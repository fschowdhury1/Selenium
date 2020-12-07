package seleniumDemo;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Arrays {

	public static void main(String[] args) {
		
		
 //How to store the value		
   String [] names= {"Kanon", "Lipa","Wakil","Tamim",};	 
   
   int [] numbers = {10,20,30,40,};
   
   char [] char1 = {'e','f','g','h',};
   
   short [] id = {1,2,3,4};
   
   
   System.out.println(names[1]);                 
	
	System.out.println(numbers[0]);	
		
	System.out.println(char1[2]);
		
	System.out.println(id[3]);	
		
	//length of Arrays	
	System.out.println(names.length);	
	System.out.println(numbers.length);	
	
	//second way
	
/*	String[] obj = new String [5];
	
	odj[0]="AAA";
	obj[1]="BBB";
	obj[2]="CCC";
	obj[3]="DDD";
	obj[4]="EEE";
	
	System.out.println(obj[0]);	
    System.out.println(obj[1]);
    System.out.println(obj[2]);
    System.out.println(obj[4]);
    System.out.println(obj.length); */
    
	}

}
