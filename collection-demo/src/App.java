import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		ProductService service=new ProductService();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("---------------------------");
			System.out.println("1:Enter 1 to add product");
			System.out.println("2:Enter 2 to remove product");
			System.out.println("3:Enter 3 to search product");
			System.out.println("4:Enter 4 to iterate product");
			System.out.println("5:Enter 5 to terminate program");
			System.out.println("---------------------------");
			System.out.print("Enter your choice:");
			int ch=Integer.parseInt(sc.nextLine());
			if(ch==1)
			{
				service.addProduct();
			}
			else if(ch==2)
			{
				//Code to remove product from collection
			}
			else if(ch==3)
			{
				//Code to search product from collection
			}
			else if(ch==4)
			{
				service.iterateProducts();
			}
			else if(ch==5)
			{
				System.out.println("------------");
				System.out.println("Thank you!!!");
				System.out.println("------------");
				break;
			}
		}
	}
}
