public class Product implements Comparable<Product> 
{
	private String name;
	private int price;
	public Product(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() 
	{
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public int compareTo(Product o) 
	{
		//int n=this.price-o.price;
		//int n=o.price-this.price;
		int n=this.name.compareTo(o.name);
		return n;
	}
}
