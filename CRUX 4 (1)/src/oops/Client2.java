package oops;

public class Client2 {
	public static void main(String[] args) throws Exception {
		Queue f=new DynamicQueue(5);
		f.add(10);
		f.display();
		f.add(20);
		f.display();
		f.add(30);
		f.display();
		f.add(40);
		f.display();
		f.delete();
		f.display();
		f.delete();
		f.display();
		f.add(60);
		f.display();
		f.add(70);
		f.display();
		f.add(80);
		f.display();
		f.add(90);
		f.display();
		
	}
}
