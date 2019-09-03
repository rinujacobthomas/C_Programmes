#include<stdio.h>
int arr(num)
{
  int ar[num];
for(int i=0;i<num;i++)
{
scanf("%d",&ar[i]);
}
  int temp1=ar[0],temp2;
  for(int b=1;b<num;b++)
  {
  temp2=ar[b];
    if((temp1-temp2)>0)
    {}
    else
    {
    temp1=temp2;
    }
  }
  printf("%d",temp1);
}

int main()
{
  int n;
  scanf("%d\n",&n);
  int a=arr(n);
  
  //fill the code
  return 0;
}