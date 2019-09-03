#include<stdio.h>
#include<string.h>
int main()
{
  int c,count=0,end,begin;
  char a[10],b[10];
  gets(a);
  strcpy(b,a);
   while (a[count] != '\0')
      count++;
   end = count - 1;
   for (begin = 0; begin < count; begin++) 
   {
      b[begin] = a[end];
      end--;
   }
  c=strcmp(a,b);
  if(c==0)
    printf("%s is a palindrome",a);
  else
    printf("%s is not a palindrome",a);
  return 0;
}