#include <stdio.h>
int main() {
   int a,c=0,count=1;
 scanf("%d",&a);
 int b=a;
  int d=a;
 while(a>0)
 {
   a=a/10;
   count=count+1;
 }
            count=count-3;
            while(c<=count)
            {
            b=b/10;
              c=c+1;
            }
  d=d%10;
  int s=b+d;
  printf("%d",s);
	//Type your code
	return 0;
}