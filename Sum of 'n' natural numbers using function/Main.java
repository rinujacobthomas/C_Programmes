#include<stdio.h>
int sum(int m)
{
  int sum1=0;
for(int a=1;a<=m;a++)
{
sum1=sum1+a;
  
}
  return sum1;
}
int main() {
  int n;
  scanf("%d",&n);
  int s=sum(n);
  printf("%d",s);
    // Type your code here
  	return 0;
}