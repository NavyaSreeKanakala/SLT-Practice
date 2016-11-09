/* reading from std output and writing to file */

package niit;
import java.io.*;
public class CustomerDetails {

	public static void main(String args[]){
		byte CustId;
		String CustName;
		int CustAge;
		float CustSal;
		char grade;
		
		try{
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter Customer id");
		CustId=Byte.valueOf(br.readLine());
		
		System.out.println("Enter Customer name");
		CustName=br.readLine();
		
		System.out.println("Enter Customer Age");
		CustAge=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Customer salary");
		CustSal=Float.parseFloat(br.readLine());
		
		System.out.println("Enter grade");
		grade=(char)(br.read());
		
		System.out.println("Id is " +CustId);
		System.out.println("Name is " +CustName);
		System.out.println("Age is " +CustAge);
		System.out.println("Salary is " +CustSal);
		System.out.println("Grade is " +grade);
		
		
		FileOutputStream fobj=new FileOutputStream("e:\\sample.txt");
		String str=String.valueOf(CustId);
		byte c[]=str.getBytes();
		fobj.write(c);
		
		fobj.write(CustName.getBytes());
		
		String str1=String.valueOf(CustSal);
		byte b[]=str1.getBytes();
		fobj.write(b);
		
		fobj.write(grade);
		
		String str2=String.valueOf(CustAge);
		byte d[]=str2.getBytes();
		fobj.write(d);
	
		}
		catch(IOException ex)
		{
			System.out.println(ex.toString());
		}
		
		}	
		
	}

