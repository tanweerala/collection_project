import java.util.*;

public class App11 
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
		boolean res=list.contains("manoj");
		System.out.println(res);
	}
}
