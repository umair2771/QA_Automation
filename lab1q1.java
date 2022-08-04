package lab1q1;

import java.util.Scanner; 


public class lab1q1 {

	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter Your Name ");
		String name = myobj.nextLine();
		
		String x="";
		x=x+name.charAt(0);
		x=x+".";
		
		
		
		for(int i=0;i<name.length();i++)
		{
			
			if(name.charAt(i)==' ' && name.charAt(i+1)!=' ' && i+1<name.length())
			{
				
				x=(x+name.charAt(i+1)).toUpperCase();
				x=x+".";
			}
			
		}
		
		String lw="";
		
	
		
		
		
		
		
		for(int j=name.length()-1;j>=0;j--)
		{
			if(name.charAt(j)==' ')
			{
				lw=name.substring(j+1);
				break;
				
				
				
			}
			
			
		}
		
		
		x=x.substring(0,x.length()-2);
		
		x=x+lw;
		
		System.out.println("Abbreviated Name : "+ x);
	}

}
