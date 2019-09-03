#include <stdio.h>
int fact(int a,int b,int c)
{
  int d;
if((a>b)&&(b<c))
{
d=b;
}
  else if((b>a)&&(a<c))
  {
  d=a;
  }
  else
  {
 d=c;
  }
  int e=d;
  while(e!=0)
  {
  if((a%d==0)&&(b%d==0)&&(c%d==0))
  {
  break;
  }
    else
    {
    d--;
    }
  }
  return d;
}
int main() {
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int f=fact(n1,n2,n3);
  printf("%d",f);
	//Type your code here
	return 0;
}