import java.util.*;

public class App9 
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
		String str=list.get(2);
		System.out.println(str);
	}
}
