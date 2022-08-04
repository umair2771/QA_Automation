package Encapsulation;

public class Encapsulation {

	 private String Name;
	 private int Age;
	 private int id;
	 
	 Encapsulation() 
	 {
		 Name = "Umair";
		 Age = 22;
		 id = 2771;
	 }
	 
	 Encapsulation (String Name1, int Age1, int id1) 
	 {
		 Name = Name1;
		 Age = Age1;
		 id = id1;
	 }
	
	 //getters
	    public String getName()
	    {
		  return Name;
		}
	    
		public int getAge()
		{
			  return Age;
		}
		
		public int getId()
		{
			  return id;
		}

	//setters
		
		public void setName(String newName)
		{
			  this.Name = newName;
		}
		
		public void setAge(int newAge)
		{
				  this.Age = newAge;
		}
		
		public void setId(int newId)
		{
				  this.id = newId;
		}
		
	
	public static void main(String[] args) 
	{
		Encapsulation encap=new Encapsulation();
		
		System.out.println("By Default Constructor : ");
		
		String nameold =  encap.getName();
    	System.out.println("Old Name Is: " + nameold);
    	int Ageold = encap.getAge();
    	System.out.println("Old Age Is: " + Ageold);
    	int idold = encap.getId();
    	System.out.println("Old ID Is: " + idold);
    	
    	System.out.println("By Encapsulation : ");
    	//By Setters
    	encap.setName("John");
     	encap.setAge(28);
     	encap.setId(12345);
     	
     	nameold =  encap.getName();
     	System.out.println("Set Name Is: " + nameold);
     	Ageold = encap.getAge();
     	System.out.println("Set Age Is: " + Ageold);
     	idold = encap.getId();
     	System.out.println("Set ID Is: " + idold);
     	
     	
	}

}
