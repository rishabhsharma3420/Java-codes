package July6;

public class exitpoint {

	public static void main(String[] args) {
		int[][] arr={{0,0,1,0},{1,0,0,0},{1,0,1,0},{0,0,0,0}};
		exitpt(arr);
	}
	public static void exitpt(int[][] arr){
		int dir=0;
		int r=0,c=0;
		while(true){
			dir=(dir+arr[r][c])%4;
			if(dir==0){
				c++;
			}else if(dir==1){
				r++;
			}else if(dir==2){
				c--;
			}else if(dir==3){
				r--;
			}
			
			if(r==-1){
				System.out.println(++r+" & "+c);
				break;
			}if(c==-1){
				System.out.println(r+" & "+(c+1));
				break;
			}if(r==arr.length){
				System.out.println(++r+" & "+c);
				break;
			}if(c==arr[0].length){
				System.out.println(r+" & "+(c+1));
				break;
			}
		}
	}
}
