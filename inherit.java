 
 // Design a java program to implement multiple inheritance using an interface.

 import java.util.*;
public class inherit {
   
// Declare the interfaces
interface Sub {
	void sub(int a, int b);
}

interface Add {
	void add(int a, int b);
}

// Implement the interfaces in a class
class Operate implements Sub,Add {
	public void sub(int a, int b)
	{
        int diff = a-b;
		System.out.println("Difference of a & b is "+diff);
	}

	public void add(int a, int b)
	{
        int sum = a+b;
		System.out.println("Sum of a & b is "+sum);
	}
}

// Use the class to call the methods from the interfaces
class Main {
	public static void main(String[] args)
	{
		inherit obj = new inherit();
		obj.sub(18,10);
		obj.add(18,10);
	}
}

}
