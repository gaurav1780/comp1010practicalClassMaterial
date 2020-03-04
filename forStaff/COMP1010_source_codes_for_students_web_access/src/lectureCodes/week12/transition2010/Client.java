package lectureCodes.week12.transition2010;

public class Client {

	public static void main(String[] args) {
		Node node = new Node(new Word("and", WordType.CONJUNCTION));
		System.out.println(node);
		node.add(new Word("ate", WordType.VERB));
		System.out.println(node);
		node.add(new Word("chased", WordType.VERB));
		System.out.println(node);
		node.add(new Word("the dog", WordType.NOUN));
		System.out.println(node);
		node.add(new Word("the bone", WordType.NOUN));
		System.out.println(node);
		node.getRight().addRight(new Word("the cat", WordType.NOUN));
		System.out.println(node);
	}

}
