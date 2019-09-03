#include<stdio.h>
int main()
{
  int a,i,total=0,sum=0;
  scanf("%d",&a);
  int b[a];
  for (i = 0; i <a; i++)
  {
  scanf("%d",&b[i]);
  }
 for (i =0; i<=a+1; i++)
 {
 total=total+i;
 }
  for (i=0; i<a; i++)
  {
	sum=sum+b[i];
  }
  printf("%d",total-sum);
  return 0;
}