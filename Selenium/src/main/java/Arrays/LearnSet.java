package Arrays;

import java.util.LinkedHashSet;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class LearnSet {

public static void main(String[] args) {
		
//Set<Integer> obj = new TreeSet<Integer>	();
		
Set<Integer> obj = new LinkedHashSet<Integer>();		
//Set<Integer> obj = new HashSet<Integer>();	

		
// Add items in Set - use add	
obj.add(125);		
obj.add(721);		
obj.add(123);		
obj.add(456);		
obj.add(101112);		
obj.add(789);		
obj.add(000);		
				
//Get count of Set - use size()		
System.out.println(obj);		
System.out.println(obj.size());		
System.out.println("......................................");

//add more items
obj.add(111);

//print/display all items in the Set - use (for each loop)	
for (Integer eachobj :obj) {
System.out.println(eachobj);
}
System.out.println("...............................................");	

//delete item from Set - use remove(item)
obj.remove(101112);

//after delete item
for(Integer eachobj : obj) {
System.out.println(eachobj);	
}	
System.out.println(".................................................");

//after delete item 	
System.out.println(obj.size());	
System.out.println(".......................................................");

//contains in set
obj.contains(123);
System.out.println(obj.contains(123));
System.out.println("........................................................");

//remove all items from Set - use obj.clear()
  obj.clear();

//confirm Set is Empty or not - use isEmpty() -output-true/false
System.out.println(obj.isEmpty());







	
	
	
}

	

	}


