#include<stdio.h>
int main()
{
   int a,b,i,j;
  scanf("%d%d",&a,&b);
   int c[a][b],d[a][b];
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
    scanf("%d",&c[i][j]);
    }
  }
   for(i=0;i<b;i++)
  {
    for(j=0;j<a;j++)
    {
    printf("%d ",c[j][i]);
    }
     printf("\n");
  }
  return 0;
}