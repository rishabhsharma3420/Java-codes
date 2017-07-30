package assignment3;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("");
		int n=scn.nextInt();
		int nod=nod(n);
		boolean arm=ano(n,nod);
		System.out.println(arm);
	}
	public static int nod(int a){
		int b=0;
		while(a%10!=0){
			b++;
			a/=10;
		}
		return b;
	}
	public static boolean ano(int x,int y){
		int b=0;
		int div=0;
		int m=x;
		while(m!=0){
			b=m%10;
			div += (int) Math.pow(b, y);
			m/=10;
		}
		return div==x;
	}
}