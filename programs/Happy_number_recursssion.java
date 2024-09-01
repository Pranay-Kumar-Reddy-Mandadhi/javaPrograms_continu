package programs;

import java.util.Scanner;

public class Happy_number_recursssion {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int sum=0;
	int res=add(a, sum);
	
		if(res==1) System.out.println(a+" is happy number");
		else System.out.println(a+" is not a happy number ");
		
	}
public static int add(int a,int sum) {
	if(a==0)return sum;
	int r=a%10;
	int res=(int)Math.pow(r, 2);
	sum=sum+res;
	a=a/10;
	if(a==0&&sum>9) {
		return add(sum,0);
	}
	return add(a, sum);
	}
}

