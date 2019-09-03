#include<stdio.h>
int main()
{
  int a,b,i,j;
  scanf("%d%d",&a,&b);
  int c[a][b],d[a][b],e[a][b];
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
    scanf("%d",&c[i][j]);
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
    scanf("%d",&d[i][j]);
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
    e[i][j]=c[i][j]-d[i][j];
    }
  }
   for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
    	printf("%d ",e[i][j]);
    }
    printf("\n");
  }
  return 0;
}