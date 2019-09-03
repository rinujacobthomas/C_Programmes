#include<stdio.h>
int main()
{
  int a,count=0,countt=0,val;
scanf("%d",&a);
int b[a];
for(int i=0;i<a;i++)
{
scanf("%d",&b[i]);
}
for(int i=0;i<a;i++)
{
  count=0;
for(int j=i;j<a;j++)
{
if(b[i]==b[j])
{
count++;
}
}
if(count>countt)
{
  countt=count;
val=b[i];
}
}
  if(countt>1)
printf("%d",val);
 else
    printf("%d",b[0]);
  return 0;
}