 #include<stdio.h>
int main()
{
  int size,max,j=1,count;
  scanf("%d\n%d",&size,&max);
  int ar[size];
  for(int i=0;i<size;i++)
  {
  scanf("%d",&ar[i]);
  }
  while(j<=max)
  {
    count=0;
  for(int i=0;i<size;i++)
  {
  if(j==ar[i])
    count++;
  }
    printf("%d %d\n",j,count);
    j++;
  }
  //printf("%d",max);

      return 0;
}