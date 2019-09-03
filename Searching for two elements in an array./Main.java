#include<stdio.h>
int ar(int num)
{
  int arr[num];
for(int b=0;b<num;b++)
{
scanf("%d",&arr[b]);
}
  int c,d;
  scanf("\n%d",&c);
    scanf("\n%d",&d);
  for(int b=0;b<num;b++)
  {
  if(c==arr[b])
  {
  c=b;
  }
    else
    {}
    if(d==arr[b])
    {
    d=b;
    }
    else
    {}
  }
  if(d==1000)
  {
  d=-1;
  }
  printf("%d",c);
  printf("\n%d",d);
}
int main()
{
  int n;
  scanf("%d\n",&n);
    int a=ar(n);
  return 0;
}