package javaDemo;

public class Car {

	public static void main(String[] args) {
		
		
 //syntax of object creation		
		
 //Classname obj = new Classname();	
		
		
	Car obj = new Car();
	
    obj.carDriving();
	obj.carHorn(); 	
	obj.carBreak();	
	obj.carAc();	
		
							
			
	}
	
	public void carDriving() {
	  System.out.println("I am driving");
	}
	
	void carHorn() {
	 System.out.println("My car horn is very loud");
	} 
	 
	private void carBreak() { 
	  System.out.println("My car has good break");
	}
	 
	protected void carAc() {
	  System.out.println("My car Ac works fine");
	} 
}
