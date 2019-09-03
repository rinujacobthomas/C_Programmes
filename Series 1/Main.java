#include<stdio.h>
#include<math.h>
int main()
{
  int a,b=1,c=0,d=0,e;
  scanf("%d",&a);
while(b<=a)
{
 if(b%2!=0)
 {
  e=pow(2,c);
  c++;
 }
  else
  {
  e=pow(3,d);
    d++;
  }
  b++;
}
  printf("%d",e);
return 0;
}