package assignment3;

import java.util.Scanner;

public class Ques11 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("");
		int m = scn.nextInt();
		System.out.println("");
		int n=scn.nextInt();
		System.out.println(gcd(m,n));
		System.out.println(lcm(m,n));
	}
	public static int gcd(int a,int b){
		int c=b;
		while(a%b!=0){
			c=a%b;
			a=b;
			b=c;
			}
		return c;
		}
	public static int lcm(int a,int b){
	int i=gcd(a,b);
	int lcm=(a*b)/i;
	return lcm;
	}
}