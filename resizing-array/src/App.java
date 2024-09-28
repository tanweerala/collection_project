public class App 
{
	public static void main(String[] args) 
	{
		int[] x=new int[3];
		System.out.println("Size of x:"+x.length);
		x[0]=10;
		x[1]=20;
		x[2]=90;
		//code to create new array
		int[] y=new int[x.length*2];
		//code to copy value of old array into new array
		for(int i=0;i<x.length;i++)
		{
			y[i]=x[i];
		}
		//code to assign reference of new array into the reference variable of old array
		x=y;
		System.out.println("Size of x:"+x.length);
	}
}
