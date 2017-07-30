package assignment3;

import java.util.Scanner;

public class ques6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("");
		int n=scn.nextInt();
		System.out.println("");
		int d=scn.nextInt();
		int a=checknum(n,d);
		System.out.println(a);
	}
	public static int checknum(int a,int b){
		int c=0;
		while(a!=0){
			int x=a%10;
			if(x==b){
				c+=1;
			}
			a=a/10;
		}
		return c;	
	}
}