package niit;
import java.util.Scanner;

public class Custmdetails {

      public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      
         
      System.out.println("Enter customer name:");
   	  String custname=sc.next();
   	  int price[]= new int[5];
   	  float sum=0;
   	  float per,avg;
   	 
   	  System.out.println("Enter the price");
   	  for(int i=0;i<5;i++)
   	  {
   		  price[i]=sc.nextInt();	
   		
   	      sum=sum+price[i];
   	      
   	  }
   	
   	per=(sum/500)*100;
   	 
   	System.out.println(custname + " " +per);
   	
   	float spent=(per/100)* 10000;
	
	System.out.println(spent);
	
}
}