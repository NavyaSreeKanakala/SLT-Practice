/* Extract character from string variable */

package niit;

public class StrngToChar {

	public static void main(String args[]){
		
		String str="This is Java Example";
		char ch=str.charAt(6);
		System.out.println(ch);
		
		
		char[] mystr=new char[5];
		str.getChars(5,10,mystr,0);
		System.out.println(mystr);
		
			
		
	}
	
}
