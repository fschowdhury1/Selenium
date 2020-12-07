package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListtest {

	public static void main(String[] args) {

		//Create object for Array List	
          
       // List<String>lst=new ArrayList<String>();
		
	   ArrayList<String> lst=new ArrayList<String>();
		
		//Add items in list 
		lst.add("Lipa");
		lst.add("Kanon");	
		lst.add("Wakil");	
		lst.add("Tamim");	

		System.out.println(lst);
		//get the count of list

		System.out.println(lst.size());

		System.out.println(".................................");	

		lst.add("Kanon");	
		System.out.println(lst.size());	

		System.out.println("........................................");

		//print all items inside the list
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));	
		}

       System.out.println("................................................");
	
		 //delete the item from list
          lst.remove(3);
		
		System.out.println(".....................................................");
		
		//Again print all items inside the list
		
		for(int i=0; i <lst.size();i++) {
		System.out.println(lst.get(i));
		
		}
		
		System.out.println("..................................");
		
		System.out.println(lst.contains("Tamim"));
		
		System.out.println("......................................");
		
		lst.clear();
		
		System.out.println("...........................................");
		
		System.out.println(lst.isEmpty());
		
}

}
