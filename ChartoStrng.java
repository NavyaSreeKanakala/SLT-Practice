/* Character data to String Variable */


package niit;

public class ChartoStrng {

	public static void main(String args[]){
		char[] mychar={'B','i','g','d','a','t','a','a','n','d','h','a','d','o','o','p'};
		String str=new String(mychar);
		System.out.println(str);
		
		str=String.copyValueOf(mychar);
		System.out.println(str);
		
		str=String.copyValueOf(mychar,3,8);
		System.out.println(str);
		
		 
	}
}
