#include <stdio.h>
#include <string.h>
// Main function
int main()
{
  int b[26],i,c,count=0;
 char a[30];
   gets(a);
  c=strlen(a);
 
 for(i=0;i<26;i++)
 {
 	b[i]=0;
  //  printf("%d",b[i]);
   //count++;
   // printf("%d",count);
 }
 
  for(i=0;i<c;i++)
  {
 count=a[i]-'a';
 	b[count]++;
   
  }
for(i=0;i<26;i++)
{
  if(b[i]!=0)
	{
    //count++;
	printf("%c",'a'+i);
    printf("%d ",b[i]);
	}
}
   return 0;
}