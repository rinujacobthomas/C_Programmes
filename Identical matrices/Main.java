#include<stdio.h>
int main()
{
	 int a,b,i,j,k,flag;
  scanf("%d%d",&a,&b);
  int c[a][b],d[a][b];
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
   for(j=i;j<b;j++)
   {
     if(c[i][j]==d[i][j])
     {
     flag=0;
     }
     else
     {
     flag=1;
       break;
     }
    
   }
  
  }
  if(flag==1)
     printf("No");
  else
     printf("Yes");
    
	return 0;
}