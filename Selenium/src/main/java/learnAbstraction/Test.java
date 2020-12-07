package learnAbstraction;

public class Test {

	public static void main(String[] args) {
		
	//we cannot create object of Abstract class; but we can create reference variable of abstract class/super class	
	//MobileUser mu = new MobileUser();
		
		
	//reference variable of super class	
	MobileUser mu;
	
	mu = new Rahim();
	mu.call();
	mu.sendMessage();
	
	
	mu = new Karim();
	mu.call();
	mu.sendMessage();
	
	

	}

}
