package june30;

public class c_to_f {

	public static void main(String[] args) {
		int minf=0;
		int maxf=300;
		int step=20;
		int j=0;
		while(minf<=maxf){
			j=(int)(5.0/9*(minf-32));
			System.out.println(minf +"\t" +j);
			minf+=step;
		}
		
	}

}