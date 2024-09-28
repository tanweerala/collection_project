import java.util.LinkedList;

public class App 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Rahul");
		list.add("Amit");
		list.add(0,"Kapil");
		list.addFirst("Naveen");
		list.addLast("Imran");
		list.add("Suman");
		list.add("David");
		System.out.println(list);
	}
}
