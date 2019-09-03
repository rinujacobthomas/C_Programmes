#include <stdio.h>
int main() { 
  int n;
  scanf("%d",&n);
  for(int num = 1;num<=n;num++)
  {
  if(num%3==0)
  { 
    printf("%d,",num);
  }
    else
    {
    printf("%d",num);
    }
  }
	//Type your code
	return 0;
}