import java.util.*;

public class App7 
{
	public static void main(String[] args) 
	{
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("Amit","Noida",21));
		list.add(new Person("Manoj","Noida",18));
		Iterator<Person> itr=list.iterator();
		while(itr.hasNext())
		{
			Person p=itr.next();
			System.out.println(p);
		}
	}
}
