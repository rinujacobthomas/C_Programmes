#include<stdio.h>
int main()
{
   int n;
    scanf("%d", &n);
    int list[n];
    for(int index = 0;index < n; index++)
    {
      scanf("%d", &list[index]);
    }
  int temp=n;
  n=n/2;
    for(int i = 0; i <= n-2; i++)
   {
     for(int j = 0; j<= n-2-i; j++)
     {
       if(list[j] > list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
   }
  for(int i = 0; i < temp;i++)
   printf("%d ", list[i]);
	return 0;
}