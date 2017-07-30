import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER THE NO");
		n = scn.nextInt();
		int n1=0,n2=1,i,count;
		int n3;
		count = n;
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<count;++i)
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3); 
		  n1=n2;    
		  n2=n3;
		 } 
		 
	}
}