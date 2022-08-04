package missingno;

public class missingno {

	public static void main(String[] args) {
		
		  int arr [] = {1, 10, 5, 9, 2, 7, 3 , 4, 6, 8 ,12 , 0, 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20 };
		   
		  int n = arr.length; 
		  int sum = n*(n+1)/2; //Find sum of all integers from 1 to n 
		  int emptyno = 0;
		  int missno = 0;
		  int result = 0;
		   
		  for (int i = 0; i < arr.length; i++) 
		  {
		   if(arr[i] == 0)
		   {
		    emptyno = i; 
		   }
		    
		   else
		   {
		    result =result+ arr[i]; 
		   }
		  }
		   
		
		  missno = sum - result;
		     
		  System.out.println("The Missing No is "+ missingNo +" at the index "+emptyno);
		
		

	}

}
