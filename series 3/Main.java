#include<stdio.h>
int main()
{
int a,b=1,c=0,d=0,e=1;
  scanf("%d",&a);
 while(b<=a)
 {
 c=d+e;
   d=e;
   e=c;
   b++;
 }
  printf("%d",c);
  return 0;
}
