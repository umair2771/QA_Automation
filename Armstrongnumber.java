package Armstrongnumber;
import java.util.Scanner;


public class Armstrongnumber {

	public static void main(String[] args) 
	
	{
		
		 
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Number to Check Armstrong or Not :");
		    int num = sc.nextInt();
		    int x = num;
		    int length = 0;
		    while (x != 0) {
		        length = length + 1;
		        x = x / 10;

		    }
		    int y = num;
		    int arm = 0;
		    int rem;
		    while (y != 0) 
		    {

		        int pow = 1;
		         rem = y % 10;
		        for (int i = 1; i <= length; i++) {
		            pow *= rem;
		        }
		        arm = arm + pow;
		        y /= 10;
		     
 
	        }
		    
		    if (arm == num) {
	            System.out.println(num+ " Is an Armstrong Number !");
	        } else {
	            System.out.println(num+ " Not an Armstrong Number!");
	        }

}
}







