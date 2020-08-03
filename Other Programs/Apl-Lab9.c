#include <stdio.h>
int add(int a,int b){    return a+b;}
int sub(int a,int b){   return (a-b);}
int mul(int a,int b){  return a*b;}
int div(int a,int b){  return a/b;}
int doOp(int (*f)(int,int),int a,int b){return (f)(a,b);}
int main() {
	printf("%d\n", doOp(add, 2,2));
	printf("%d\n", doOp(sub, 2,2));
	printf("%d\n", doOp(mul, 2,2));
	printf("%d\n", doOp(div, 2,2));
	return 0;
}