package Pack1;

public class Exam {
public static void main(String[] args) {
	
	String a ="sparta";
	 
	int i= a.length();
	System.out.println(i);
	
	System.out.println(a.charAt(2));
	System.out.println(a.concat(" here"));
	
	a= a+" coming";
	System.out.println(a);
	
	String s ="";
	for(int j= (a.length()-1); j>=0; j--)
	{  
		char f= a.charAt(j);
		s= s+f;
		// System.out.println(s);
	}
	      System.out.println(s);
	
       // a =s ;
       System.out.println(a);
        
   String c= new String("i am sparta");
   String d = new String("I am sparta");
   
   System.out.println(c.toUpperCase());
   System.out.println(c.toLowerCase());
   	System.out.println(c.startsWith("i"));
   	System.out.println(c.endsWith("rta"));
   	System.out.println(c.equals("i am sparta"));
     System.out.println(c.equals(d));
     System.out.println(c.equalsIgnoreCase(d));
   
     c= "I will sparta";
     System.out.println(c.substring(2));
     System.out.println(c.substring(2, 8));
}



	
	
}

