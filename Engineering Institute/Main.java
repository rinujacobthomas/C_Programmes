//import required packages
import java.util.Scanner;
class Faculty
{
	public int baseslalry;
  //this.baseslalry=baseslalry;
public void salary()
{
  System.out.println("Base Salary: "+baseslalry);
}
}
class CSE extends Faculty
{
public void salary(int baseslalry)
{
	 System.out.println("CSE Faculty: "+(baseslalry+3000));
  //write your CSE class statements
}
}
class IT extends Faculty
{
public void salary(int baseslalry)
{
	 System.out.println("IT Faculty: "+(baseslalry+5000));
  //write your IT class statements
}
}
class ECE extends Faculty
{
public void salary(int baseslalry)
{
	 System.out.println("ECE Faculty: "+(baseslalry+4500));
  //write your ECE class statements
}
}

class Main
{
public static void main(String[] args)
{
	 Scanner s=new Scanner(System.in);
  ECE obj = new ECE();
  Faculty f=new Faculty();
  CSE c=new CSE();
  IT i=new IT();
  int a=s.nextInt();
 f.baseslalry=a;
  f.salary();
  c.salary(a);
  i.salary(a);
  obj.salary(a);
  s.close();
  //implement your required concept here
}
}