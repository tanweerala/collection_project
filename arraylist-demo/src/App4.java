import java.util.*;

public class App4 
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
		for(String str:list)
		{
			System.out.println(str);
		}
	}
}
