package infosys.demo.stringdemos;

public class StringDemo3 {
// How we can compare two strings for equality 
// ==
// boolean equals(Object obj); // Currently we talk about String
// object as a parameter
	public static void main(String[] args) {
	String str1=new String("Hello");
	String str2=new String("Hello"); 
	// In the above two lines 2 String objects are getting created
	// Because this time due to the usage of new , two different
	// objects are created and one is refered by str1 and another by str2.
	System.out.println(str1==str2); // false
   	System.out.println(str1.equals(str2)); // true
    
	}

}
