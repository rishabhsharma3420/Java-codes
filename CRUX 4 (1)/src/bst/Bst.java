package bst;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bst {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;
	int size;

	public Bst(int[] sa) {
		root = construct(sa, 0, sa.length - 1);
	}

	private Node construct(int[] arr, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node left = construct(arr, lo, mid - 1);
		Node right = construct(arr, mid + 1, hi);
		Node temp = new Node();
		temp.data = arr[mid];
		temp.left = left;
		temp.right = right;
		return temp;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += " => " + node.data + " <= ";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}

	public int size() {
		return size;
	}

	public boolean IsEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int size2() {
		return size2(root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = size2(node.left);
		int rs = size2(node.right);
		return ls + rs + 1;
	}

	public int height() {
		return height(root, 0, 0);

	}

	private int height(Node node, int d, int h) {
		if (node == null) {
			return h;
		}
		if (d > h) {
			h = d;
		}
		h = Math.max(height(node.right, d + 1, h), height(node.left, d + 1, h));
		return h;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		} else {
			return max(node.right);
		}
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;
		} else {
			return min(node.left);
		}
	}

	public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (data > node.data) {
			return find(node.right, data);
		} else if (data < node.data) {
			return find(node.left, data);
		} else {
			return true;
		}
	}

	public int diameter() {
		// return diameterStupid(root);
		return diameter2(root).diameter;
	}

	private class DiaPair {
		int height;
		int diameter;
	}

	private int diameterStupid(Node node) {
		if (node == null) {
			return 0;
		}
		int ld = diameterStupid(node.left);
		int rd = diameterStupid(node.right);
		int h1 = height(node.left, 0, 0);
		int h2 = height(node.right, 0, 0);

		return Math.max(h1 + h2 + 2, Math.max(ld, rd));
	}

	private DiaPair diameter2(Node node) {
		if (node == null) {
			DiaPair bc = new DiaPair();
			bc.height = -1;
			bc.diameter = 0;
			return bc;
		}
		DiaPair lc = diameter2(node.left);
		DiaPair rc = diameter2(node.right);
		DiaPair ans = new DiaPair();
		ans.height = Math.max(lc.height, rc.height) + 1;
		ans.diameter = Math.max(lc.height + rc.height + 2, Math.max(lc.diameter, rc.diameter));
		return ans;
	}

	private class bal {
		int height;
		boolean ans;
	}

	public boolean IsBalanced() {
		return isbalanced(root).ans;
	}

	private bal isbalanced(Node node) {
		if (node == null) {
			bal bs = new bal();
			bs.height = -1;
			bs.ans = false;
			return bs;
		}
		bal ls = isbalanced(node.left);
		bal rs = isbalanced(node.right);
		bal ans = new bal();
		ans.height = Math.max(ls.height, rs.height) + 1;
		if (ls.ans && rs.ans) {
			int gap = Math.abs(ls.height - rs.height);
			if (gap <= 1) {
				ans.ans = true;
			} else {
				ans.ans = false;
			}
		} else {
			ans.ans = false;
		}
		return ans;
	}

	private class marker {
		Node node;
		boolean self, left, right;
	}

	public void preorderI() {
		marker m = new marker();
		m.node = root;
		LinkedList<marker> stack = new LinkedList<>();
		stack.addFirst(m);
		while (stack.size() != 0) {
			m = stack.getFirst();
			if (m.self == false) {
				System.out.print(m.node.data + "\t");
				m.self = true;
			} else if (m.left == false) {
				if (m.node.left != null) {
					marker lp = new marker();
					lp.node = m.node.left;
					stack.addFirst(lp);
				}
				m.left = true;
			} else if (m.right == false) {
				if (m.node.right != null) {
					marker rp = new marker();
					rp.node = m.node.right;
					stack.add(rp);
				}
				m.right = true;
			} else if (m.left == true && m.right == true && m.self == true) {
				stack.removeFirst();
			}
		}
	}

	public void InorderI() {
		marker m = new marker();
		m.node = root;
		LinkedList<marker> stack = new LinkedList<>();
		stack.addFirst(m);
		while (stack.size() != 0) {
			m = stack.getFirst();
			if (m.left == false) {
				if (m.node.left != null) {
					marker lp = new marker();
					lp.node = m.node.left;
					stack.addFirst(lp);
				}
				m.left = true;
			} else if (m.self == false) {
				System.out.print(m.node.data + "\t");
				m.self = true;
			} else if (m.right == false) {
				if (m.node.right != null) {
					marker rp = new marker();
					rp.node = m.node.right;
					stack.add(rp);
				}
				m.right = true;
			} else if (m.left == true && m.right == true && m.self == true) {
				stack.removeFirst();
			}
		}
	}

	public void LevelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(root);
		while (queue.size() != 0) {

		}
	}

	public Bst(int[] post, int[] in, int[] pre) {
		// root=construct(pre, in, 0, pre.length-1, 0, in.length-1);
		root = construct1(post, in, 0, post.length - 1, 0, in.length - 1);
	}

	private Node construct(int[] pre, int[] in, int psi, int pei, int isi, int iei) {
		if (psi > pei || isi > iei) {
			return null;
		}
		Node node = new Node();
		node.data = pre[psi];
		this.size++;
		int idx = -1;
		for (int i = isi; i <= iei; i++) {
			if (in[i] == node.data) {
				idx = i;
				break;
			}
		}
		int clse = idx - isi;
		node.left = construct(pre, in, psi + 1, psi + clse, isi, idx - 1);
		node.right = construct(pre, in, psi + clse + 1, pei, idx + 1, iei);
		return node;
	}

	private Node construct1(int[] post, int[] in, int posi, int poei, int insi, int inei) {
		if (poei < posi || inei < insi) {
			return null;
		}
		Node node = new Node();
		node.data = post[poei];
		size++;
		int idx = -1;
		for (int i = insi; i <= inei; i++) {
			if (in[i] == node.data) {
				idx = i;
				break;
			}
		}
		int clse = idx - insi;
		node.left = construct1(post, in, posi, posi + clse - 1, insi, idx - 1);
		node.right = construct1(post, in, posi + clse, poei - 1, idx + 1, inei);
		return node;
	}

	public void add(int data) {
		if (size == 0) {
			root = new Node();
			root.data = data;
			size++;
		}
		add(root, data);
	}

	private void add(Node node, int data) {
		if (data > node.data) {
			if (node.right == null) {
				Node temp = new Node();
				temp.data = data;
				node.right = temp;
				size++;
				return;
			} else {
				add(node.right, data);
			}
		} else if (data < node.data) {
			if (node.left == null) {
				Node temp = new Node();
				temp.data = data;
				node.left = temp;
				size++;
				return;
			} else {
				add(node.left, data);
			}
		} else {
			return;
		}
	}

	public void remove(int data) throws Exception {
		remove(root, null, data);
	}

	private void remove(Node curr, Node prev, int data) throws Exception {
		if (curr.data < data) {
			if (curr.right == null) {
				throw new Exception(data + " Not Found in BST");
			} else
				remove(curr.right, curr, data);
		} else if (curr.data > data) {
			if (curr.left == null) {
				throw new Exception(data + " Not Found in BST");
			} else
				remove(curr.left, curr, data);
		} else {
			if (curr.left != null || curr.right != null) {
				int ans = -1;
				Node remove = curr;
				int a = height(curr.left, 0, 0);
				int b = height(curr.right, 0, 0);
				if (a > b) {
					ans = max(curr.left);
					remove(curr.left, curr, ans);
				} else {
					ans = min(curr.right);
					remove(curr.right, curr, ans);
				}
				remove.data = ans;
			} else if (prev.right == curr) {
				size--;
				prev.right = null;
			} else if (prev.left == curr) {
				size--;
				prev.left = null;
			}
		}
	}

	public void sumreplace(int[] arr) {
		sumreplace(root, arr);
	}

	private void sumreplace(Node node, int[] arr) {
		if (node == null) {
			return;
		}
		sumreplace(node.left, arr);
		sumreplace(node.right, arr);
		int i = 0;
		int sum = 0;
		while (node.data != arr[i]) {
			sum += arr[i];
			i++;
		}
		node.data = sum;
	}

	public void printinrange(int lo, int high) {
		printinrange(root, lo, high);
	}

	private void printinrange(Node node, int lo, int hi) {
		if (node == null) {
			return;
		}
		if (node.data < lo) {
			printinrange(node.right, lo, hi);
		} else if (node.data > hi) {
			printinrange(node.left, lo, hi);
		} else {
			printinrange(node.left, lo, hi);
			System.out.print(node.data + "\t");
			printinrange(node.right, lo, hi);
		}
	}

	
}
