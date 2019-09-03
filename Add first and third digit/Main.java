#include<stdio.h>
int main()
{
  int num1,a,b;
  scanf("%d",&num1);
  a= num1/100;
  b= num1%10;
  num1=a+b;
  printf("%d",num1);
  //Type your code here
  return 0;
}