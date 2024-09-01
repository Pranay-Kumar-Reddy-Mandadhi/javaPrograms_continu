package programs;

import java.util.Scanner;

public class Auto_morphic_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int start=s.nextInt();
		int end=s.nextInt();
		for(int k=start;k<=end;k++) {
		int a=k;
		int b=a;
		int sq=a*a;
		int count=0;
		for(;a>0;a=a/10,sq=sq/10) {
			if ((a%10)!=(sq%10)) {
				count=1;
				break;
			}
			
		}
		if(count==0) {
			System.out.println(b+" is a automarphic Number");
		}else {
			System.out.println(b+" is not a automarphic number");
		}

	}

}
}
