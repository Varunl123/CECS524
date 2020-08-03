import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java. util.Arrays;
public class Grading
{
    //public static int[] numbers;
    public static int[] keys; 
    public static boolean iskey;
    public static int questions;
    public static Vector<Integer> v;
    
    public static int calculateAverage(int count){
        int sum=0;
        for(int i=0;i<v.size();i++)
        {
           sum+=v.get(i);
        }
        return sum/count;
    }
    public static void convertArray(String st){
         String[] numberStrs;
         int[] numbers;
         numberStrs=st.split(" ");
         if(iskey==true){
	            keys=new int[numberStrs.length];
	         for(int i=0;i<numberStrs.length;i++){
	            keys[i]=Integer.parseInt(numberStrs[i]);
	           // System.out.print(keys[i]+" ");
	            }
	            //System.out.println();
         }
         else{
              numbers=new int[numberStrs.length];
	            for(int i=0;i<numberStrs.length;i++){
	            numbers[i]=Integer.parseInt(numberStrs[i]);
	            //System.out.print(numbers[i]+" ");
	            }
	            //System.out.println();
	            v.add(computeScore(numbers));
	            System.out.println(numbers[0]+"     "+v.lastElement());
         }
         
    }
   public static int computeScore(int[] numbers){
        int count=0;
        int mult=100/questions;
             
        for(int i=0;i<keys.length;i++){
            if(keys[i]==numbers[i+1])
                count++;
        }
        return count*mult;
    }
	public static void main(String[] args) throws IOException, NullPointerException {
	    String filename;
	    HashMap<Integer,Integer> map=new HashMap<>();
	    System.out.println("Enter file name:");
	    Scanner sc=new Scanner(System.in);
	    filename=sc.nextLine();
	    File file = new File(filename);
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    String st;
	    int count=0;
	   // int questions;
	   while((st=br.readLine())!=null){
	       count++;
	   }
	   v=new Vector<>();
	   //System.out.println(count);
	   br.close();
	   br = new BufferedReader(new FileReader(file));
	   System.out.println("StudentID   Score:");
	   System.out.println("==================");
	   int count1=0;
	    while((st=br.readLine())!=null){
	       // System.out.println(st);
	       count1++;
	       if(count1==1){
	           questions=Integer.parseInt(st);
	           //System.out.println(questions);
	       }
	       else if(count1==2){
	           iskey=true;
	            convertArray(st);
	       }
	       else{
	           iskey=false;
	           convertArray(st);
	       }
	         
	    }
	   System.out.println("===================");
	   System.out.println("Tests graded= "+(count-2));
	   System.out.println("===================");
	   System.out.println("Score   Frequency:");
	   System.out.println("===================");
	   
	   int a[]=new int[101];
       Arrays.fill(a,-1);
        int s;
        for(int i=0;i<v.size();i++){
            s=v.get(i);
            if(a[s]==-1){
                a[s]=1;
            }
            else{
                a[s]=a[s]+1;
            }
        }
        for(int i=100;i>=0;i--){
            if(a[i]!=-1)
                System.out.println(i+"     "+ a[i]);
        }
        System.out.println("===================");
        System.out.println("Class Average:"+calculateAverage(count-2));
	   /*
	   int s;
	   
	   for(int i=0;i<v.size();i++){
	       s=v.get(i);
	       if(map.containsKey(s))
	       {
	           map.put(s,map.get(s)+1);
	       }
	       else
	            map.put(s,1);
	   }
       //map.forEach((key, value) -> System.out.println(key + " : " + value));
       Map<Integer,Integer> treemap=new TreeMap<>(map);
       for(Integer i : treemap.keyset()){
           System.out.println(i);
       } */
	}

}
