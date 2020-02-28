package lectureCodes.week12.transition2010;

public class Node {
	public Node left, right;
	public Word word;

	public Node(Word wordToAdd) {
		word = wordToAdd;
	}

	public boolean addLeft(Word wordToAdd) {
		Node node = new Node(wordToAdd);
		if(left == null && (wordToAdd.type != word.type)) {
			left = node;
			return true;
		}
		return left != null && left.add(wordToAdd);
	}

	public boolean addRight(Word wordToAdd) {
		Node node = new Node(wordToAdd);
		if(right == null && (wordToAdd.type != word.type)) {
			right = node;
			return true;
		}
		return right != null && right.add(wordToAdd);
	}

	public boolean add(Word wordToAdd) {
		Node node = new Node(wordToAdd);
		if(left == null && (wordToAdd.type != word.type)) {
			left = node;
			return true;
		}
		if(right == null && (wordToAdd.type != word.type)) {
			right = node;
			return true;
		}
		if(left != null && left.add(wordToAdd)) {
			return true;
		}
		return right != null && right.add(wordToAdd);
	}

	public int subtreeSize() {
		int count = 1;
		if(left != null)
			count+=left.subtreeSize();
		if(right != null)
			count+=right.subtreeSize();
		return count;
	}

	public String toString() {
		String result = word.toString();
		if(left != null)
			result=left+" "+result;
		if(right != null)
			result=result+" "+right;
		return result;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
}
