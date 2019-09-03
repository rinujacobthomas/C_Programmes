import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      int a,b,c;
      double total=0;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      switch(a)
      {
           case 4:
          b=s.nextInt();
          total=(b*3.14)*b;
          break;
        case 1:
         b=s.nextInt();
     	c=s.nextInt();
          total=b*b;
          break;
        case 2:
          b=s.nextInt();
      	c=s.nextInt();
          total = b*c;
          break;
        case 3:
          b=s.nextInt();
     	c=s.nextInt();
          total=(b*c)/2;
          break;
       
      }
      System.out.print(""+total);
    }
}