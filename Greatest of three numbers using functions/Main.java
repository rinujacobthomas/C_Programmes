#include <stdio.h>
int great(int a,int b,int c)
{
  int d;
if((a>b)&&(a>c))
{
printf("%d",a);
}
  else if((b>a)&&(b>c))
  {
  printf("%d",b);
  }
  else
  {
  printf("%d",c);
  }
}
int main(){
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int g=great(n1,n2,n3);
	// Type your code here
  	return 0;
}