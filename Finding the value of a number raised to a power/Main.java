import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
        int base=s.nextInt();
      int exponent=s.nextInt();
      int pow=1;
      for(int i=1;i<=exponent;i++)
      {
      pow=pow*base;
      }
      System.out.print(pow);
    }
}