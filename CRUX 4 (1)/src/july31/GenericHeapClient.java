package july31;

public class GenericHeapClient {

	public static void main(String[] args) {
		Cars car[] = new Cars[5];
		car[0] = new Cars("Audi", 300, 2);
		car[1] = new Cars("Lamborghini", 350, 20);
		car[2] = new Cars("Ferrari", 250, 200);
		car[3] = new Cars("Dodge", 301, 1);
		car[4] = new Cars("Mustang", 275, 5);
		GenericHeap<Cars> heap = new GenericHeap<>(Cars.cnrc);
		for (Cars Car : car) {
			heap.add(Car);
		}
		heap.display();
		while (heap.size() != 0) {
			System.out.println(heap.remove());
		}
	}

}
