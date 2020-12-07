package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

public static void main(String[] args) {
		
Map<String,Integer> mp	= new LinkedHashMap<String,Integer>();
		
mp.put("Atia",  123);		
mp.put("Tayef", 444);		
mp.put("Lipa",  555);		
mp.put("Kanon",  682);		
mp.put("Wakil",  720);		
mp.put("Tamim",  840);		
		
for (Entry<String,Integer> eachMp :mp.entrySet()) {		
System.out.println(eachMp.getKey()+"     "+eachMp.getValue());		
}

//get count of Mp entry-size()
System.out.println(mp.size());		
System.out.println(".......................................");		
		
//get();	
System.out.println(mp.get("Atia"));

//Remove()
mp.remove("Atia");    // just pass the key
System.out.println("...............................................");

//After remove size of map items
System.out.println(mp.size()); 
System.out.println("....................................................");

//contains key()
System.out.println(mp.containsKey("Shipa"));
System.out.println("..................................................");

//contains value()
System.out.println(mp.containsValue(682));  // true or false
System.out.println("................................................");

//clear();
mp.clear();   //Removes all map data/entry
System.out.println("..................................................");

//After clear
System.out.println(mp.size());
System.out.println("...................................................");

// is empty true or false
System.out.println(mp.isEmpty());
System.out.println("...................................................");

//in Map (2 dimension)- for each loop

for (Entry<String,Integer> eachMp :mp.entrySet()) {		
System.out.println(eachMp.getKey()+"     "+eachMp.getValue());

}




}


}



	



	


