class MyModel1 {
     public int camera;
     public String lock;
     public int display;
   
}
class MyModel2 extends MyModel1 {

	
}
class MyModel2T extends MyModel2 {

	
}
public class Main 
{
    public static void main(String[] args) 
    {
       MyModel1 a=new MyModel1();
    		   a.camera=2;
       a.display=5;
       MyModel2 b= new MyModel2();
       b.camera=5;
       b.lock="Fingerprint";
       b.display=a.display;
       MyModel2T c=new MyModel2T();
       c.camera=16;
       c.lock=b.lock;
       c.display=6;
       System.out.println("Features of MyModel 1\n"+"Camera mega pixels: "+a.camera+"\n"+"Features of MyModel 2\n"+"Camera mega pixels: "+b.camera+"\n"+"Lock mechanism: "+b.lock+"\n"+"Display size: "+b.display+"\n"+"Features of MyModel 2T\n"+"Camera mega pixels: "+c.camera+"\n"+"Lock mechanism: "+c.lock+"\nDisplay size: "+c.display);
    }
}