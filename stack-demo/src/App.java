import java.util.*;

public class App 
{
	public static void main(String[] args) 
	{
		Stack<String> list=new Stack<String>();
		list.push("Rahul");
		list.push("Manoj");
		list.push("Amit");
		list.push("Kuldeep");
		list.push("Rakesh");
		int x=list.size();
		for(int c=0;c<x;c++)
		{
			String str=list.pop();
			System.out.println(str);
		}
		System.out.println(list.size());
	}
}

