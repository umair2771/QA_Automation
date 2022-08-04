

class animal {

 String name="";
 int age;


void setvalue (String str,int num)
{
	this.name=str;
	this.age=num;
}


}

class zebra extends animal
{
   zebra()
   {
	 animal objz = new animal();
	 objz.setvalue("Zebra", 40);
	 System.out.println("Hello ! My Name is " + objz.name);
	 System.out.println("I am  " + objz.age + " Old ");
	 System.out.println("My Place of Origin is Africa ");
	   
   }



}

class dolphin extends animal
{
   dolphin()
   {
	 animal objd = new animal();
	 objd.setvalue("Dolphin", 23);
	 System.out.println("Hello ! My Name is " + objd.name);
	 System.out.println("I am  " + objd.age + " Old ");
	 System.out.println("My Place of Origin is Indian Ocean ");
	   
   }



}
	
	
	
 class animalproblem{
	public static void main(String[] args) {
		
		
		zebra zebobj =new zebra();
		dolphin dolob =new dolphin();
		
		
		
	}
		
 }
		
	

