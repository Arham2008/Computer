package variable;

public class Mac {

	//static variable
	static String name="akbar";
	static int  price=321;
	static char mySize='L';
	static boolean credit=true;
	static long account=123456709l;
	static double cost=23.99;
	
	// non static variable
	
	String  country="pakistan";
	int      value= 240000000;   
	char     size ='T';
	boolean  person=true;
	float     cd= 33.89f;  
	byte      num=127;
	
	
	public static void main(String[] args) {
		
		System.out.println(Mac.name);
		System.out.println(Mac.price);
		System.out.println(Mac.mySize);
		System.out.println(Mac.credit);
		System.out.println(Mac.account);
		System.out.println(Mac.cost);
		// static variable reinitlize
		Mac.price=200;
		Mac.mySize='B';
		System.out.println(Mac.price);
		System.out.println(Mac.mySize);
		
		//non static variable reinitlize
		
		Mac  fm= new Mac();
		System.out.println(fm.country);
		System.out.println(fm.value);
	    System.out.println(fm.person);
		System.out.println(fm.size);
		System.out.println(fm.cd);
		System.out.println(fm.num);
		
	}
	
	
	
	
	
	
	
}
