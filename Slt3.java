package niit;

public class Slt3 {

	public static void main(String args[]){
		int x=23;
		int y=34;
		
		System.out.println("Before swapping:" +x  +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping:" +x  +y);
		
	}
}
