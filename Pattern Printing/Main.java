import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int row= s.nextInt();
      int column = s.nextInt();
      for(int i=0;i<row;i++)
      {
      for(int j=0;j<=i;j++)
      {
      System.out.print(row-j);
      }
        for(int k=i+1;k<row;k++)
      {
      System.out.print(row-i);
        }
        System.out.print("\n");
      }
    }
}