#include <stdio.h>
int main() {
  int n,c=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
for(int j=n-i;j>=1;j--)
{
printf(" ");
}
for(int k=1;k<=i;k++)
{
printf("%d ",++c);
}
    printf("\n");
  }
	// Type your code here
	return 0;
}