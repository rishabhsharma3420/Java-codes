package assignment3;

import java.util.Scanner;

public class ques10 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("");
		int n=scn.nextInt();
		System.out.println("");
		int i=scn.nextInt();
		armno(n,i);
	}
	public static int nod(int a){
		int b=0;
		while(a!=0){
			b++;
			a/=10;
		}
		return b;
	}
	public static int ano(int x,int y){
		int b=0;
		int div=0;
		int m=x;
		while(m!=0){
			b=m%10;
			div += (int) Math.pow(b, y);
			m/=10;
		}
		return div;
		}
	public static void armno(int n,int i){
		while(i<=n){
			int nod=nod(i);
			int div=ano(i,nod);
			if(div==i){
				System.out.print(div+" ");
			}
			i++;
		}
	} 
}