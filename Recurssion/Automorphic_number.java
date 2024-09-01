package Recurssion;

import java.util.Scanner;

public class Automorphic_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sq=a*a;
		int count=0;
		if(automorphic(a, sq, count))System.out.println(a+","+sq+"automorphic number");
		else System.out.println(a+","+sq+" not an automorphic number");
	}
public static boolean automorphic(int a,int sq,int count) {
	if(a!=0) {
		if(a%10!=sq%10) {
			return false;
		}
		return automorphic(a/10, sq/10, count);
	}
	return true;
}
}
