import java.util.Scanner;

public class ProductService 
{
	Scanner sc=new Scanner(System.in);
	ProductRepository repo=new ProductRepository();
	public void addProduct() 
	{
		System.out.println("------------------------");
		System.out.print("Enter product id:");
		int pid=Integer.parseInt(sc.nextLine());
		System.out.print("Enter product name:");
		String name=sc.nextLine();
		System.out.print("Enter product brand:");
		String brand=sc.nextLine();
		System.out.print("Enter product price:");
		int price=Integer.parseInt(sc.nextLine());
		Product product=new Product(pid,name,brand,price);
		repo.saveProduct(product);
		System.out.println("------------------------");
	}
	public void iterateProducts() 
	{
		System.out.println("-----------------------------------------------");
		repo.showProductList();
		System.out.println("-----------------------------------------------");
	}
}
