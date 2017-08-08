package aug6_heapmaking;

public class GenericLL<T> {

	private class Node {
		private T data;
		private Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void addlast(T value) {
		Node node = new Node();
		node.data = value;
		node.next = null;
		if (this.size == 0) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void display() {
		Node temp = new Node();
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.print("\n{--------------------------------------------------------------}\n");
	}

	public void addstart(T val) {
		Node node = new Node();
		node.data = val;
		node.next = head;
		head = node;
		size++;
	}

	public T getfirst() throws Exception {
		if (size == 0) {
			throw new Exception("Empty list");
		}
		return head.data;
	}

	public T getlast() throws Exception {
		if (size == 0) {
			throw new Exception("EMPTY LIST");
		}
		return tail.data;
	}

	public T getmid(int index) throws Exception {
		if (size == 0) {
			throw new Exception("LIST EMPTY");
		}
		if (index < 0 || index >= size) {
			throw new Exception("Wrong INDEX");
		}
		Node temp = new Node();
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addmid(T val, int index) throws Exception {
		if (size == 0) {
			throw new Exception("LIST EMPTY");
		}
		if (index < 0 || index > size) {
			throw new Exception("Wrong INDEX");
		}
		if (index == 0) {
			addstart(val);
		} else if (index == size - 1) {
			addlast(val);
		} else {
			Node temp = head;
			temp = getNode(index - 1);
			Node add = new Node();
			add.data = val;
			add.next = temp.next;
			temp.next = add;
			size++;
		}
	}

	public Node getNode(int index) throws Exception {
		if (size == 0) {
			throw new Exception("LIST EMPTY");
		}
		if (index < 0 || index >= size) {
			throw new Exception("Wrong INDEX");
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public T remlast() throws Exception {
		if (size == 0) {
			throw new Exception("List EMPTY");
		}
		T rv = tail.data;
		if (size == 1) {
			return remfirst();
		}
		Node temp = head;
		temp = getNode(size - 2);
		temp.next = null;
		tail = temp;
		size--;
		return rv;
	}

	public T remfirst() throws Exception {
		if (size == 0) {
			throw new Exception("LIST EMPTY");
		}
		T rv = head.data;
		if (size == 1) {
			head = tail = null;
			size = 0;
		} else {

			Node temp = head;
			temp = getNode(1);
			head = temp;
			size--;
		}
		return rv;
	}

	public T remmid(int index) throws Exception {
		if (index < 0 || index > size) {
			throw new Exception("LIST EMPTY");
		}
		if (index == 0) {
			return remfirst();

		}
		if (index == size - 1) {
			return remlast();

		}
		Node temp1 = head;
		temp1 = getNode(index - 1);
		Node temp2 = head;
		temp2 = getNode(index);
		temp1.next = temp2.next;
		temp2.next = null;
		T rv = temp2.data;

		size--;
		return rv;
	}

}