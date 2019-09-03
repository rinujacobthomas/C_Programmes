#include<stdio.h>
int sqr(int m)
{
int sq;
  sq=m*m;
  return sq;
}
int main() {
  int n;
  scanf("%d",&n);
  int s=sqr(n);
    printf("%d",s);
   // Type your code here
   return 0;
}