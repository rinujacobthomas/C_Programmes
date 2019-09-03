#include <stdio.h>
int main() {
  int a,b,s,c;
  s=0;
  scanf("%d",&a);
  b=a/10000;
  s=s+b;
  b=a/1000;
  c=b%10;
  s=s+c;
  b=a/100;
  c=b%10;
  s=s+c;
    b=a%100;
      c=b/10;
  s=s+c;
  b=a%10;
  s=s+b;
  printf("%d",s);

	//Type your code
	return 0;
}