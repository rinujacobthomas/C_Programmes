#include <stdio.h>
int fact(m);
int main()
{
int n;
  	scanf("%d", &n);
    printf("%d",fact(n));
  return 0;
}  
int fact(int m)
           {
           if(m==0)
             return 1;
             else
             {
             return m*fact(m-1);
             }
           }