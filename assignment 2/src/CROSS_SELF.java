import java.util.Scanner;

public class CROSS_SELF {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS PLEASE");
		int n = scn.nextInt();
		int row = 1;
		while(row<=n){
			int col=1;
			while (col<=n){
				if(col==row || col+row==n+1){
				System.out.print("*");	
				}else{
					System.out.print(" ");
				}
				col++;
			}
			System.out.println();
			row++;
		}
	}
}