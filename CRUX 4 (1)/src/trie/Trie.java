package trie;

import java.util.ArrayList;
import java.util.HashMap;

public class Trie {

	private class Node {
		Character data;
		boolean eow;
		HashMap<Character, Node> child = new HashMap<>();
	}

	private Node root = new Node();
	private int numwords = 0;
	private int numnode = 1;

	public void addword(String word) {
		addword(root, word);
	}

	private void addword(Node node, String word) {
		if (word.length() == 0) {
			numwords++;
			node.eow = true;
			return;
		}
		Character ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.child.get(ch);
		if (child != null) {
			addword(child, ros);
		} else {
			numnode++;
			Node newchild = new Node();
			newchild.data = ch;
			node.child.put(ch, newchild);
			addword(newchild, ros);
		}
	}

	public boolean searchWord(String word) {
		return searchWord(root, word);
	}

	private boolean searchWord(Node node, String word) {
		if (word.length() == 0) {
			return node.eow;
		}
		Character ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.child.get(ch);
		if (child != null) {
			return searchWord(child, ros);
		} else {
			return false;
		}
	}

	public void removeWord(String word) throws Exception {
		removeWord(root, word);
	}

	private void removeWord(Node node, String word) throws Exception {
		if (word.length() == 0) {
			numwords--;
			node.eow = false;
			return;
		}
		Character ch = word.charAt(0);
		String str = word.substring(1);
		Node child = node.child.get(ch);
		if (child != null) {
			removeWord(child, str);
			if (child.eow == false && child.child.size() == 0) {
				node.child.remove(child);
				numnode--;
			}
		} else {
			throw new Exception("Word not found");
		}
	}

	public void display() {
		display(root, "");
	}

	private void display(Node node, String str) {
		if (node.eow) {
			System.out.println(str);
		}
		ArrayList<Character> keys = new ArrayList<>(node.child.keySet());
		for (Character key : keys) {
			display(node.child.get(key), str + key);

		}
	}

	public void numofwords(){
		System.out.println("\""+numwords+"\"");
		return;
	}
	
	public void numofnodes(){
		System.out.println("~"+numnode+"~");
		return;
	}
}

