#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<math.h>
#include<stdbool.h>
#include<limits.h>
char *s2,*s1;
float average;
bool printRem=false;
int count=0;
int quadrant(int a[]){
    int x=a[0],y=a[1];
    if(x<0){
        if(y>0)
            return 2;
        if(y<0)
            return 3;
        return 5;
    }
    else if(x>0)
    {
        if(y>0)
            return 1;
        else if(y<0)
            return 4;
        else
            return 5;
    }
    else{
        if(y==0)
            return 7;
        return 6;
    }
}
float distance(int a1[],int a2[]){
    int x1=a1[0];
    int x2=a2[0];
    int y1=a1[1];
    int y2=a2[1];
    int d1=x1-x2;
    int d2=y1-y2;
    return sqrt((d1*d1)+(d2*d2));
    
}
void output(int point1[],int point2[],int q1,int q2,float dist){
    if(printRem==true){
        printf("\n");
        printf("%d sets of points processed\n",count);
        printf("Average distance was %.3f \n",average/count);
    }
    else
    {
        if(q1==1)s1="lies in the quadrant I";else if(q1==2)s1="lies in the quadrant II";
        else if(q1==3)s1="lies in the quadrant III";else if(q1==4)s1="lies in the quadrant IV";
        else if(q1==5)s1="lies on the x-axis";else if(q1==6)s1="lies on the y-axis";else s1="lies on origin";
        
        if(q2==1)
        s2="lies in the quadrant I";else if(q2==2)s2="lies in the quadrant II";else if(q2==3)s2="lies in the quadrant III";
        else if(q2==4)s2="lies in the quadrant IV";
        else if(q2==5)s2="lies on the x-axis";else if(q2==6)s2="lies on the y-axis";else s2="lies on origin";
    
        printf("(%d,%d) %s,(%d,%d) %s, distance is %.3f \n",point1[0],point1[1],s1,point2[0],point2[1],s2,dist);
    }
    
}
int reading(FILE *ptr,int *x1,int *y1,int *x2,int *y2){
    int c= fscanf(ptr,"%d %d %d %d ",x1,y1,x2,y2);
    if(c==4){
        return 1;
    }
    else if(c==0 || c== -1)
        return 0;
    else
        return -1;
}
int main(){
    FILE *ptr;
    int number,i,j;
    int point1[2];
    int point2[2];
    char q1,q2;
    float dist;
    int status;
    ptr = fopen("points.dat","r");
    while((status=reading(ptr,&point1[0],&point1[1],&point2[0],&point2[1]))==1){
         count+=1;
           q1=quadrant(point1);
           q2=quadrant(point2);
           dist=distance(point1,point2);
           output(point1,point2,q1,q2,dist);
           average+=dist;
    }
    if(status==0){
         printRem=true;
        output(point1,point2,q1,q2,dist);
        fclose(ptr);
        return 1;
    }
    else if(status==-1){
        printRem=true;
        output(point1,point2,q1,q2,dist);
        fclose(ptr);
        return 0;
    }
    else
        return 2;
}