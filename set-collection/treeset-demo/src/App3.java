import java.util.*;

public class App3 
{
	public static void main(String[] args) 
	{
		TreeSet<Product> set=new TreeSet<Product>();
		set.add(new Product("Mobile",50000));
		set.add(new Product("Watch",1200));
		set.add(new Product("Laptop",70000));
		set.add(new Product("Printer",10000));
		set.add(new Product("Mouse",1000));
		set.add(new Product("Keyboard",1800));
		for(Product p:set)
		{
			System.out.println(p);
		}
	}
}
