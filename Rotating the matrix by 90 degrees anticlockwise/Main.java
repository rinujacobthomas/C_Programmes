#include<stdio.h>
int main()
{
	int a,b,i,j,k;
  scanf("%d%d",&a,&b);
  int c[a][b];
	 for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
    scanf("%d",&c[i][j]);
    }
     }
 for(j=b-1;j>=0;j--)
  {
      for(i=0;i<b;i++)
   
    {
    printf("%d ",c[i][j]);
    }
    printf("\n");
  }
	return 0;
}