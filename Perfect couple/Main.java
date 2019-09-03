#include<stdio.h>
int main()
{
 int size,sum,d=0,j,a;
    scanf("%d",&size);
  int arr[size];
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&sum);
  for(a=0;a<size;a++)
  {
  for(j=0;j<size;j++)
  {
   if(arr[a]+arr[j]==sum)
   {
     printf("Perfect couple: %d %d",arr[a],arr[j]);
   d++;
     break;
   }
    }
    if(d==1)
      break;
  }
  if(d==0)
    
    printf("No perfect couple found!"); 
  
}