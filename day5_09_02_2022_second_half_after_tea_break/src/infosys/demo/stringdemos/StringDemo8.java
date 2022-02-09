package infosys.demo.stringdemos;

public class StringDemo8 {

	public static void main(String[] args) {
		
		String str="Welcome";
		// index position starts from 0
		char ch=str.charAt(0);
        System.out.println(ch);
        ch=str.charAt(20);  // java.lang.StringIndexOutOfBoundsException:
        System.out.println(ch);
	}

}
