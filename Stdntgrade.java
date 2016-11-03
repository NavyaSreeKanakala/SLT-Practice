package niit;
import java.util.Scanner;
public class Stdntgrade {

	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter student name:");
	  String name=sc.next();
	  
	  float sum=0;
	  float per,avg;
	  int num;
	  System.out.println("Enter the no of subjects:");
	  num=sc.nextInt();
	  int marks[]=new int[num];
	  System.out.println("Enter the marks");
	  for(int i=0;i<marks.length;i++)
	  {
		  marks[i]=sc.nextInt();	
		
	      sum=sum+marks[i];
	      
	  }
	avg=sum/num;
	per=(sum/(num*100))*100;
	
	System.out.println(name + " " +per);
	
	
	
	if(per>=85)
	{
		System.out.println(name+ " got A+ grade");
	}
	else if(per>=75 && per<=84)
	{
		System.out.println(name+ "got A grade");
	}
	else if(per>=65 && per<=74)
	{
		System.out.println(name+ "got B grade");
	}
	else if(per>=50 && per<=64)
	{
		System.out.println(name+ "got C grade");
	}
	  
		
	}
	
}
