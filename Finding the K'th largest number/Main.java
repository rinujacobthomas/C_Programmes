#include<stdio.h>
int main()
{
int size,temp,k;
scanf("%d",&size);
int a[size];
for(int i=0;i<size;i++)
{
scanf("%d",&a[i]);
}
scanf("%d",&k);
for(int i=0;i<size;i++)
{
for(int j=0;j<size-i-1;j++)
{
if(a[j]<a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
printf("%d",a[k-1]);
return 0;
}