package infosys.demo.stringdemos;

public class StringDemo2 {
// How we can compare two strings for equality 
// ==
// boolean equals(Object obj); // Currently we talk about String
// object as a parameter
	public static void main(String[] args) {
	String str1="Hello";
	String str2="Hello";  // In this case the new String Hello is not
	// created as Hello is already available in the constant string pool
	// so in line 10 str2 again points to the same String literal
	// which got created in line 9.
	// == is used to check whether the reference variable are
	// storing the same object or not
	System.out.println(str1==str2); // true
    // equals check for the content of the object rather than the 
	// reference
	System.out.println(str1.equals(str2)); // true
    
	}

}
