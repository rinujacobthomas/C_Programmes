/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  int temp1=0,temp2=0;
 for(int i=0;i<n;i++)
 {
 scanf("%d",&arr[i]);
 }
  
    int temp,count=0;
  if(n%3==0)
  {  
  for(int i=0;i<n;i=i+3)
  {
  temp=arr[i]+arr[i+1]+arr[i+2];
	if(temp!=n)
	{
      	count=1;
  		
		break;
	}
  }}
  
if(count==0)
{
  	printf("Perfect Batch");
}
else
{
	printf("Not a Perfect Batch");
} //Type your code here
  return 0;
}