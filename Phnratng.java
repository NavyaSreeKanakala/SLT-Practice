package niit;
import java.util.Scanner;

public class Phnratng {

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
	      
        
	      System.out.println("Enter customer name:");
	   	  String custname[]= new String[10];
	   	  int i;
	   	  for(i=0;i<10;i++)
	   	  {
	   		 custname[i]=sc.next();
	   	      
	   	  }
	   	  for(i=0;i<10;i++)
	   	  {
	   		System.out.println(custname[i]);     
	   	  }
		  
	   	  int rating[]=new int[10];
	   	  float sum=0;
	   	  float avg;
	   	 
	   	  System.out.println("Enter the rating");
	   	  for(int j=0;j<10;j++)
	   	  {
	   		  rating[j]=sc.nextInt();	
	   		
	   	      sum=sum+rating[j];
	   	      
	   	  }
		
		avg=sum/10;
		System.out.println(avg);
		
			
			
	}
	
	

}
