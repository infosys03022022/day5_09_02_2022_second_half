package infosys.demo.stringdemos;

public class StringDemo1 {
// How we create String objects?
	public static void main(String[] args) {
	// In line 8 we created a reference 
	// with the name str1 and it is storing the address of the literal/string constant 
		String str1="Hello"; // In RHS the constant is
		// an object . So Hello is an object
	   // String literals/constants are enclose within " "
      System.out.println(str1);    // Hello
      System.out.println("str1");  // str1 as such
      // We never put variables within " "
      String str2="Hi";
      System.out.println(str2);
      String str3="Bye";
      System.out.println(str3);
      String str4=new String("Hello");
      // We are creating a new object ( Whatever we are writing in RHS)
      // new is a keyword used for dynamic memory allocation ( memory allocation done
      // during the runtime.
      // We are using the parameterized constructor of String class where the
      // parameter is String literal Hello
      // and then we are storing the address of th object created in RHS
      // to the reference variable str4 which is LHS
      System.out.println(str4);
      char ch[]= {'H','e','l','l','o'};
      String str5=new String(ch);
	  // In line 28 we are passing a character array as parameter to the
      // constructor and creating the new object and storing the reference in str5v
	  System.out.println(str5);
	}

}
