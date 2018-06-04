import java.util.*;
import java.io.*;
import java.lang.*;

public class A{

	static void printsum(int x ) {
		System.out.println(x);
	}
		
	
	public static void main(String args[]){

		int x,y,z;

		A a = new A();
		B b = new B();

		Scanner sn =  new Scanner(System.in);

		y = sn.nextInt();
		z = sn.nextInt();

		x = b.sum(y,z);	
		
		a.printsum(x);
		
	}
}