package infosys.demo.stringdemos;

public class StringDemo4 {

	public static void main(String[] args) {
	
		String str1="Hello";
		int length=str1.length();
		System.out.println(length);
		System.out.println(str1.length());
		int length2="Welcome".length();
		// Why the above way of using method is
		// possible because String literal 
		// itself is an object
		System.out.println(length2);

	}

}
