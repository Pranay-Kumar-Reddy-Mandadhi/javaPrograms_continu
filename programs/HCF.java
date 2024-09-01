package programs;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int hcf=a*b;
		int lcm=a>b?a:b;//greatest
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				break;
			}
			lcm++;
		}
		int ans=hcf/lcm;
		System.out.println(ans+" is the hcf "+a+" and "+b);
	}

	}
