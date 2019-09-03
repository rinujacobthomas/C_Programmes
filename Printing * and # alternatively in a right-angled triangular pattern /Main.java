#include <stdio.h>
int main(){ 
  int n,turn=0;
  scanf("%d",&n);
  for(int num=1;num<=n;num++)
  {
  for(int num1=1;num1<=num;num1++)
  {
  if(turn==1)
  {
  printf("#");
    turn=0;
  }
    else
    {
    printf("*");
      turn=1;
    }
  }
    printf("\n");
  }
	// Type your code here
  	return 0;
}