package Arrays;

import java.util.LinkedList;
import java.util.List;




public class LinkedLisTest  {

	public static void main(String[] args) {
		
	//Create object for Array List	
	
	List<String> names =  new LinkedList<String>();
     
	//Add items in Linked List	
	names.add("Lipa");	
	names.add("Kanon");	
	names.add("Wakil");	
	names.add("Tamim");	
		
	System.out.println(names);	
	
	//get the count of names	
	System.out.println(names.size());	
		
	System.out.println("............................................");	
		
	names.add("Lipa");	
	System.out.println(names.size()); 	
		
	System.out.println("....................................");	
		
	//Print all items inside the names	
		
	for(int i=0;i<names.size();i++) {	
	System.out.println(names.get(i));	
	}	
	System.out.println("...............................................");	
	
	//delete/remove the item from names
     names.remove(1);
     
     System.out.println("........................................");
     
 	//Print all items inside the names	
		
	for(int i=0;i<names.size();i++) {	
	System.out.println(names.get(i));	
	}
	System.out.println("..............................................");
	
	System.out.println(names.contains("Tayef"));
	
	System.out.println(names.contains("ABC"));
	
	System.out.println("................................................");
	
	names.clear();
	
	System.out.println("...........................................................");
	
	System.out.println(names.isEmpty());
	
	}
	
	}
	
	
	
	

     

     
     
	


