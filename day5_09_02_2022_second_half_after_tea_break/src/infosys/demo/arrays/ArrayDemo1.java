package infosys.demo.arrays;

public class ArrayDemo1 {

public static void main(String[] args) {
int num[]= {11,22,33};
// index start from 0;
// Array declaration an intialisation in the same
// step 
// How we can access the elements 
//for(int j=0;j<10;j++)  
	// java.lang.ArrayIndexOutOfBoundsException
   // as we don't have position 10
for(int j=0;j<num.length;j++)  
{
	System.out.println(num[j]);
}

System.out.println("--------------------");
int num2[]=new int[3];
// In C int num2[3]; // Compile time allocation of memory
// int num2[]; // This is depicting that this is
// an array declaration
// new int[3]; // Arrays in java are created
// dymamically and while creating we mention the size
  num2[0]=1;
  num2[1]=2;
  num2[2]=3;
  System.out.println(num2[0]);
  System.out.println(num2[1]);
  System.out.println(num2[2]);
  System.out.println("----------");
  // length is not a method
  // length is a variable
  for(int i=0;i<num2.length;i++)
  {
	  System.out.println(num2[i]);
  }
  
  System.out.println("-------------------------");
  for(int x : num)
  {
	  System.out.println(x);
  }
  
		  
		

	}

}
