#include<stdio.h>
int main()
{

  int a,b=1,c=0,d=0,e;
  scanf("%d",&a);
while(b<=a)
{
 if(b%2!=0)
 {
  e=c;
  c=c+2;
 }
  else
  {
  e=d;
    d++;
  }
  b++;
}
  printf("%d",e);
return 0;
}