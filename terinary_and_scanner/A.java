package terinary_and_scanner;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  a value ");
		int a=s.nextInt();
		System.out.println("enter  b value ");
		int b=s.nextInt();
		String res=a>b?"true":"false";
		System.out.println(res);
		

	}

}
