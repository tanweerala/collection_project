import java.util.*;

public class App10 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Amit");
		list.add("Rahul");
		list.add("Manoj");
		list.add("Imran");
		list.add("Kapil");
		list.add(1,"Hemant");
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}
}
