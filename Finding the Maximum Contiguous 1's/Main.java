#include<stdio.h>
int main()
{
  int a,count=0;
scanf("%d",&a);
int b[a];
for(int i=0;i<a;i++)
{
scanf("%d",&b[i]);
}
for(int i=0;i<a;i++)
{
if(b[i]==1)
count++;
else
break;
}
printf("%d",count);
  return 0;
}