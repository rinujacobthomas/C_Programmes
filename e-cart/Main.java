//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
}
   
class Customer
{
  private String product;
  public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
	int a,b;
  public Bill(int a,int b)
  {
	  System.out.println("Total Price is : "+(a*b));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    //write the logic here
    Scanner s= new Scanner(System.in);
    c.setProduct(s.next());
    i.setPrice(s.nextInt());
    c.setQuantity(s.nextInt());
    Bill obj = new Bill(i.getPrice(),c.getQuantity());
  }
}