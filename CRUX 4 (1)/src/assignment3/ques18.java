package assignment3;

import java.util.Scanner;

public class ques18 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("");
		char n=scn.next().charAt(0);
		System.out.println(case1(n));
	}
	public static char case1(char ch){
		if('a'<=ch&&ch<= 'z'){
			return 'L';
		}else if('A'<=ch&&ch<='Z'){
			return 'U';
		}
		return 'I';
	}
}