package june30;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("");
	char ch=scn.next().charAt(0);
	ch+=0;
	if('a'<=ch && ch<='z'){
		System.out.println("L");
	}
	else if('A'<=ch && ch<='Z'){
		System.out.println("U");
	}else{
		System.out.println("I");
	}
	}
}
