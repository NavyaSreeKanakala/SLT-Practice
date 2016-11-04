/* Finding largest and smallest from a given array */


package niit;

public class MaxMin {

	public static void main(String args[]){
		int[] num=new int[]{12,11,10,13,14,15,16,21,34,56,9,5,6};
	
		 int max=num[0];
		 int min=num[0];
		 
		 for(int i=0;i<num.length;i++)
		 {
			 if(num[i]>max)
			 {
				 max=num[i];
			 }
			 else if(num[i]<min)
			 {
				 min=num[i];
			 }
		 }
       System.out.println("The largest no is:" +max);
       System.out.println("The smallest no is:" +min);
       
		
	}

}
