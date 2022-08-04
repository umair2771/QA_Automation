package duplicatestring;

import java.util.Scanner;

public class duplicatestring {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String To Remove Duplicate: ");
	    String str = sc.nextLine();
		String str2="";
	    int len=str.length();
	    
	    
	    for(int i=0;i<len-1;i++)
	    {
	    	int count=0;
	    	
	    	for  (int j=0;j<=i;j++)
	    	{
	    		if (str.charAt(i)==str.charAt(j))
	    		{
	    			count++;
	    		}
	    		
	    		if(count>1)
	    		{
	    			
	    			break;
	    		}
	    		
	    		
	    	}
	    	
	    	
	    	if(count==1)
	    	{
	    		str2=str2+str.charAt(i);
	    	}
	    	
	    	
	    }
	    
	    System.out.println(str2);
	    

	    
	    
	    
	    	
	    }

	    
	
		
		

	}

