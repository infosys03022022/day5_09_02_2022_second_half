package infosys.demo.stringdemos;

public class StringDemo5 {

	public static void main(String[] args) {
	
		String str1="Hello";
		String str2="World";
		String str3=str1+str2;
		System.out.println(str3);
		String str4=str1.concat(str2);
		System.out.println(str4);
        String str5="Bye";
        String str6=str1.concat(str2).concat(str5);
        System.out.println(str6);
	    int num=10;
	    String result="The result is"+num;
	    System.out.println(result);
	    // Anything concatenated with String gets
	    // converted into String
	}

}
