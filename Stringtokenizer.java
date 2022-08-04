package Stringtokenizer;
import java.util.Scanner; 


public class Stringtokenizer {
    
	Scanner sc = new Scanner(System.in);
	Private String str=sc.nextLine();
	
	public String inpstr()
	{
		return str;
	}
	
	
	public int  tokencount(String str)
	{
		int x=0; 
		int count=0;
		int leng=str.length();
		char [] ch=new char[leng];
		
		
		for(int j=0;j<leng;j++)
		{
			ch[j]=str.charAt(j);
			
			if(ch[j]=='@' || ch[j]=='#' || ch[j]==' ' || ch[j]==',' || ch[j]=='*')
			{
				count=count+1;
		
			}
			
			
		}
		
		return count;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("Enter String to Count String Tokenizer : ");
        Stringtokenizer obj =new Stringtokenizer(); //object 
		
		
		String a=obj.inpstr();
		int cnt=obj.tokencount(a);
		System.out.println("String Tokenizer Count is: "+cnt);
		
		
		
	}

}
