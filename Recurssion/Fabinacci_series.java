package Recurssion;

import java.util.Scanner;

public class Fabinacci_series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the range");
		int n=s.nextInt();
		fab(0,1,n);

	}
	static void   fab(int a,int b,int k) {
		System.out.print(a+" ");
		if(k==0)return ;
		fab(b,a+b,k-1);
		return;
	}

}
