package niit;
import java.util.Scanner;
public class Slt1 {

	public void vowel()
	{   int ctr=0;
		System.out.println("Enter the string");
		Scanner readstr=new Scanner(System.in);
		String text=readstr.nextLine();
		
		char[] mychar=text.toCharArray();
		for(char c : mychar)
		{  
			switch(c)
			{  case 'a':
			   case	'e':
			   case	'i':
			   case	'o':
			   case	'u':
				   ctr=ctr+1;
				   break;
				default:
			}		
		}
		System.out.println("Total vowels" +ctr);
		}
	
	public static void main(String args[]){
		Slt1 tobj=new Slt1();
		tobj.vowel();
   }	
}

