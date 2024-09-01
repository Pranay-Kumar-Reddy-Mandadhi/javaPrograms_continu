package terinary_and_scanner;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  a value ");
		int a=s.nextInt();
		System.out.println("enter  b value ");
		int b=s.nextInt();
		System.out.println("before swaping");
		System.out.println("a="+a+"b="+b);
		//using temparary variable
		/*int c;
		c=a;
		a=b;
		b=c;
		System.out.println("after swaping");
		System.out.println("a="+a+"b="+b);*/
		System.out.println("without using third variable");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping");
		System.out.println("a="+a+"b="+b);
	}

}
