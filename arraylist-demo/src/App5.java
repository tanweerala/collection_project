import java.util.*;

public class App5 
{
	public static void main(String[] args) 
	{
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("Amit","Noida",21));
		list.add(new Person("Manoj","Noida",18));
		for(Person p:list)
		{
			System.out.println(p);
		}
	}
}
