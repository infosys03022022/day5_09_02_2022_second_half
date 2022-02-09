package infosys.demo.encapsulation;

public class MyNumberMain {

	public static void main(String[] args) {
		MyNumber number=new MyNumber();
		number.setNumber1(1);
		number.setNumber2(22);
		System.out.println(number.getResult()); // 0
		number.add();
		System.out.println(number.getResult()); //23
	}

}
