package infosys.demo.encapsulation;

// We are planning for some calculator
// I want number1 number2 and number all initialised with 0
// constructors ===> reason are called once only
// setter  ========> setter method can be called for multiple times

//constructors are invoked once only while creating the object
// and purpose of constructor is initialisation of the object and
// ultimately we are initialising instance variables 
// but setter method can be called multiple times and 
// can be used for updating the instance variable
// We dont want setResult because the result value won't be set externally and it
// will calculated value from add and subtract
// getResult is required to read or access the result after add or subtract
public class MyNumber {
 private int number1;
 private int number2;
 private int result;

 public MyNumber()
 {
	 number1=0;
	 number2=0;
	 result=0;
 }
 
 
  
 

 public int getNumber1() {
	return number1;
}





public void setNumber1(int number1) {
	this.number1 = number1;
}





public int getNumber2() {
	return number2;
}





public void setNumber2(int number2) {
	this.number2 = number2;
}

public int getResult() {
	return result;
}


// The following methods are not setter/getter methods
   public void add()
   {
	   result=number1+number2;
   }
   public void subtract()
   {
	   result=number1-number2;   
   }
}
