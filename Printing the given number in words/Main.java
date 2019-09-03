#include<stdio.h>
int main()
{
  int a;
 scanf("%d",&a);
  if(a>1 && a<6)
    switch(a)
    {
      case 1:
        printf("one");
        break;
      case 2:
        printf("two");
        break;
      case 3:
        printf("Three");
     break;
      case 4:
        printf("Four");
        break;
      case 5:
        printf("Five");
        break;
    }
  else
    printf("Invalid");
  //Type your code here
  return 0;
}