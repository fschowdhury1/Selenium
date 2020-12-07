package Arrays;

public class stringConceptJava {

	public static void main(String[] args) {
		
	//string class Method	
	//1.equals-return true or false	
		
	String text ="String Concept";
	String text1 ="String Concept";	
	System.out.println(text.equals(text1));	 //equals function compare the value of two different variable (text and text1)
		
	System.out.println(text=text1);	     //compares memory address of string variable
		
	System.out.println(System.identityHashCode(text));	
	System.out.println(System.identityHashCode(text1));	
		
	//2.Length()-return count of string	
	//String text ="String Concept";
	String text2="Learning String";	
	System.out.println(text.length());	
		
	//3.concat()-if you want a concat(join more than one string) two string	
	System.out.println(text.concat(text2));
	
	//if you want to concat different datatype variable,we use+
	String num = "20";
	String num1 ="30";
	int a = 10;
	int b = 20;
	
	String firstName = "kanon";
	String lastName ="Chowdhury";
	
	System.out.println(num + a);
	System.out.println(firstName +" "+lastName);
	System.out.println(a+b);
	
	//4.trim()-want to remove white space from both side of a string use trim()
	String line = "  java String concept   ";
	System.out.println(line);
	System.out.println(line.length());
	System.out.println(line.trim());
	System.out.println(line.trim().length());
	
	//5.substring()-return partial string
	String text3 ="Learning String";  //return string word only i.e beginning from 9th index
	//String text3 = "Learning String is very important concept in java";
	System.out.println(text3.substring(9));
	//Substring()-print a particular String i.e begin index to end index
	System.out.println(text3.substring(4, 9));
	System.out.println(text3.substring(0, 9));
	System.out.println(text3.substring(9, 15));
	
	//6.To LowerCase()-convert all of the String as LowerCase()
	String text4 ="Compares String";
	System.out.println(text4.toLowerCase());
	
	//TO UpperCase()-convert all of the string as UpperCase
	String text5 = "Compares String";
	System.out.println(text5.toUpperCase());
	
	//7.charAt()-returns character based on given index number
	  System.out.println(text5.charAt(2));
	  System.out.println(text5.charAt(9));
	  
	  
	//8.indexOf()-return the position of the given character  
	  System.out.println(text5.indexOf('C'));
	  System.out.println(text5.indexOf('S'));
	  
	  
	 //9.StartsWith()-given string start with particular Character/collection of char or not-return true/false 
	  System.out.println(text5.startsWith("c"));
	  System.out.println(text5.startsWith("Com"));
	  
	 //endWith()-given string ends with particular Character/collection of char or not-return true/false  
	  System.out.println(text5.endsWith("s"));
	  System.out.println(text5.endsWith("ing"));
	  
	  //Contains()-given string is available in entire string or not-return true/false
	  System.out.println(text5.contains("mpa"));
	  System.out.println(text5.contains("tex"));
	  
	  
	  
	  
}

}
