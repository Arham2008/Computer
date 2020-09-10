package variable;

public class Mac {

	//static variable
	static String name="akbar";
	static int  price=321;
	static char mySize='L';
	static boolean credit=true;
	static long account=123456709l;
	static double cost=23.99;
	
	
	public static void main(String[] args) {
		
		System.out.println(Mac.name);
		System.out.println(Mac.price);
		System.out.println(Mac.mySize);
		System.out.println(Mac.credit);
		System.out.println(Mac.account);
		System.out.println(Mac.cost);
		// reinitlize
		Mac.price=200;
		Mac.mySize='B';
		System.out.println(Mac.price);
		System.out.println(Mac.mySize);
		
		
		
	}
	
	
	
	
	
	
	
}
