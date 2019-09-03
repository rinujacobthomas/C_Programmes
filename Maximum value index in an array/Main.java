// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n;
  scanf("%d",&n);
  int ar[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  int temp2,temp1=0;
  for(int i=0;i<n;i++)
  {
  temp2=ar[i];
   if(temp1<temp2)
   {
   temp1=temp2;
   }
  }
  for(int i=0;i<n;i++)
  {
  if(ar[i]==temp1)
  {
  printf("%d",i);
  }
  }

  // Type your code here 
  
   return 0;
}