#include<stdio.h>
int power(int m,int n)
{
int po=pow(m,n);
  return po;
}
int main(){
  int b,e;
  scanf("%d %d",&b,&e);
  int p=power(b,e);
  printf("%d",p);
    // Type your code here
  	return 0;
}