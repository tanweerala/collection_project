import java.util.*;

public class App12 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Kamlesh");
		list.add("Amit");
		list.add("Rahul");
		list.add("Manoj");
		list.add("Imran");
		list.add("Kapil");
		list.add("Hemant");
		Collections.sort(list);
		System.out.println(list);
	}
}
