import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner s =new Scanner(System.in);
     String a=s.nextLine();
     String b=s.nextLine();
     int c=s.nextInt();
     s.close();
     String d= a.replace(a, b);
     String e[]=d.split(" ",c);
     for (String string : e) {
		System.out.println(string);
	}
    }
}