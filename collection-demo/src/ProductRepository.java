import java.util.*;

public class ProductRepository 
{
	//This class will have methods to manage objects of product in memory by using collection 
	ArrayList<Product> list=new ArrayList<Product>();
	//Method to add object of product
	public void saveProduct(Product product)
	{
		list.add(product);
	}
	//Method to iterate objects of product
	public void showProductList()
	{
		for(Product p:list)
		{
			System.out.println(p);
		}
	}
}
