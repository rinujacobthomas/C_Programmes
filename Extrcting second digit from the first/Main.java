#include <stdio.h>
int main() {
  int a,c=0,count=1;
 scanf("%d",&a);
 int b=a;
 while(a>0)
 {
   a=a/10;
   count=count+1;
 }
            count=count-4;
            while(c<=count)
            {
            b=b/10;
              c=c+1;
            }
           b=b%10;
            printf("%d",b);

	//Type your code
	return 0;
}