#include<stdio.h>
#include<string.h>
int main()
{
 int c,i,j=0,ar=0,flag;
char a[40],b[20],temp[30];
gets(a);
gets(b);
c=strlen(a);
  //printf("%d",c);
for(i=0;i<2*c;i++)
{
if(j<c)
{
temp[i]=a[j];
  j++;
}
else
{
j=0;
  i=i-1;
}
}
//  puts(temp);
   for (i = 0; i <= 2*c - c; i++)
    {
        for (j = i; j < i + c; j++)
        {
            flag = 1;
            if (temp[j] != b[j - i])
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            break;
    }
    if (flag == 1)
        printf("Yes");
    else
        printf("No");
 
  return 0;
}