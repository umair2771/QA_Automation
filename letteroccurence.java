package letteroccurence;
import java.util.Scanner;

public class letteroccurence {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String To Check Occurence : ");
	    String str = sc.nextLine();
		
	    int len=str.length();
	    char[] ch = new char[len];
	    int[] cont = new int[len];

	    
	    for(int i=0; i<len; i++) {
	    	ch[i]=str.charAt(i);
	    	
	    	
	    	for (int k=0;k<len;k++)
	    	{
	    		
	    		if(ch[i]==ch[k])
	    		{
	    			cont[i]++;
	    		}
	    	}
	    	
	    	//System.out.println(ch[i] + "Occurs " + cnt[i] +" Times");
	    	
	    	
	    }
	    
	    
	    for(int j=0; j<len; j++) {
	    	System.out.println("Letter: "+ch[j]+", Occurrence: "+cont[j]);  // Output user input
	    }  
	    
	    
	    	}
	    
	    
	    
	    
	}


