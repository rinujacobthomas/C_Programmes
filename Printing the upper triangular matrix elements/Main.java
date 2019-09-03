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
 for(i=0;i<a;i++)
 {
   int k=0;
   for(j=i;j<b;j++)
   {
     printf("%d ",c[k][j]);
     k++;
     
 }
}

     
     
	return 0;
}