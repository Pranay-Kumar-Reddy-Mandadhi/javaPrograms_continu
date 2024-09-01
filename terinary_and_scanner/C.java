package terinary_and_scanner;

import java.util.Scanner;

public class C {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter  a value ");
	int a=s.nextInt();
	String res=a%2==0?"even":"odd";
	System.out.println(res);
}
}
