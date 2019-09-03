#include <stdio.h>
int addNumbers(num);
int main()
{
int num;
  	scanf("%d", &num);
    printf("%d",addNumbers(num));
  return 0;
}  
int addNumbers(num)
{
if(num!=0)
{
return num+addNumbers(num-1);
}
else
  return 0;

}