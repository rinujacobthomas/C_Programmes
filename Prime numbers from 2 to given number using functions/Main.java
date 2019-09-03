#include<stdio.h>
int prime(int num)
{
  for(int i=1;i<=num;i++)
  {
  int pr=0;
  for(int a=i;a!=0;a--)
  {
  if(i%a==0)
  {
  pr++;
  }
    else
    {}
  }
   if(pr==2)
   {
   printf("%d\n",i);
   }
    else
    {}
  }
}
int main(){
  int n;
  scanf("%d",&n);
  int p=prime(n);
    // Type your code here
    return 0;
}