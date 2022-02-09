package infosys.demo.stringdemos;

public class StringDemo9 {

	public static void main(String[] args) {
		String str="Welcome";
		String subString=str.substring(1,5);  
		 // String substring(startIndex,endIndex)
		// A substring from  position mentioned
		// as parameter one(startIndex) in our example it is 1
		// to endIndex-1
      System.out.println(subString); //elc
      subString=str.substring(2);   // String substring(startIndex)
      // The above form of SubString returns 
      // The substring from the startIndex and
      // as we don;t have any endIndex so it 
      // displays till the end of the String
      System.out.println(subString);
	}

}
