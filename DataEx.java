/* Parameters passing to the function */

package niit;

public class DataEx {

	public static void add(int num)
	{
		System.out.println(num);
	}
	public static void add(Integer num)
	{
		System.out.println(num);
	}
	
	public static void main(String args[]){
		int num=45;
		Integer refnum=num;
		
		add(num);
		add(refnum);
		
	}
	
}
