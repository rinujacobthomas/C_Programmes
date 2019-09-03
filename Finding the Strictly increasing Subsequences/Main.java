#include<stdio.h>
int main()
{
	int size;
  scanf("%d",&size);
  int a[size];
  for(int i=0;i<size;i++)
  {
  	scanf("%d",&a[i]);
  }
  for(int i=0;i<size;i++)
  {
  for(int j=i+1;j<size;j++)
  {
  if(a[i]<a[j])
  {
    if(size<5)
  {
  printf("%d,%d\n",a[i],a[j]);
  }
  else
  {
  if(a[j]!=2)
  {
   printf("%d,%d\n",a[i],a[j]);
  }
  }
  }
  }
  
  }
	return 0;
}