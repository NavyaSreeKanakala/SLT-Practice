/* Remove multiple spaces from string */

package niit;

import java.util.StringTokenizer;

public class MultiSpaces {

	public static void main(String args[]){
		
		String str="Hello   this  is       java";
		
		for(String str1 : str.split(" "))
		{
			System.out.print(str1);
		}
		
		
	
		/*System.out.println(str);
		StringTokenizer st =new StringTokenizer(str," ");
		StringBuffer sb=new StringBuffer();
	
		while(st.hasMoreElements())
		{
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println(sb.toString().trim());*/
	
	}	
	
}
