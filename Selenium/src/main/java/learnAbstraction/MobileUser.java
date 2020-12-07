package learnAbstraction;

public abstract class MobileUser { // its a fully abstract class,it has no abstract method
	
	//this is a non abstract method,it has implementation
   void call() {	 
	
   System.out.println("This is call method");

 }
 //after adding call()method,it is not a fully abstract method,it has abstract & non  abstract method
   
   
 abstract void sendMessage();   //this is a fully abstract method 

}