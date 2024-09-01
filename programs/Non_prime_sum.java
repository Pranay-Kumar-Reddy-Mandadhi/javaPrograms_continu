package programs;

import java.util.Scanner;

public class Non_prime_sum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int sum=0;
	for(int j=s.nextInt();j!=0;j=j/10) {
		int r=j%10;
	int  a=r;
	if (a==1) {
		sum=sum+a;
	}
	for(int i=2;i<=a/2;i++) {
		if (a%i==0) {
			System.out.println(a);
			sum=sum+a;
			break;

}
}	
}
	System.out.println(sum);
}
}
