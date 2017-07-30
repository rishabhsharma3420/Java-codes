import java.util.Scanner;

public class diamond3456543 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the number");
		int n= scn.nextInt();
		int row=1;
		while(row<=n){
			int sppr=n,csp=1;
			while (csp<=sppr){
				System.out.print("*");
				csp++;
			}
			
			System.out.println();
			row++;
		}
				

	}

}
