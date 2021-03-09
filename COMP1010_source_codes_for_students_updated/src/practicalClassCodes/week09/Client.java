package practicalClassCodes.week09;
import java.util.ArrayList;
import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("I");
		words.add("solemnly");
		words.add("swear");
		words.add("that");
		words.add("I");
		words.add("am");
		words.add("upto");
		words.add("no");
		words.add("good.");
		System.out.println("Number of items in list: "+words.size());
		System.out.println("Fifth item in list: "+words.get(4));

		System.out.println("Last item in list: "+words.get(words.size()-1));

		words.set(4, "you");

		System.out.println("List after replacing fifth item with \"you\": "+words);

		String removed = words.remove(1);

		System.out.println("Item removed: "+removed);

		words.set(4, "are");

		System.out.println("List after replacing fifth item with \"are\": "+words);

		int lengthyWordCount = 0;
		for(String s: words) {
			if(s.length() > 4) {
				lengthyWordCount++;
			}
		}

		System.out.println("Words with more than 4 characters: "+lengthyWordCount);

		ArrayList<Integer> outcomes = new ArrayList<Integer>();

		outcomes.addAll(Arrays.asList(6, 10, 8, 2, -5, 0, -12, 2, 3, 10, 2, -5));

		int countNegatives = 0;

		for(Integer item: outcomes) {
			if(item < 0) {
				countNegatives++;
			}
		}

		System.out.println("Negative items in list: "+countNegatives);

		boolean hasNeg = (countNegatives > 0); //:D

		System.out.println("Any negative items? "+hasNeg);

		boolean hasOverTen = false;

		for(Integer item: outcomes) {
			if(item > 10) {
				hasOverTen = true;
				break; //no need to look any further
			}
		}
		System.out.println("Any items over 10? "+hasOverTen);

		boolean allPos = allPositives(outcomes);

		System.out.println("All items positive? "+allPos);

		boolean allPosNull = allPositives(null);

		System.out.println("All items positive in a null list? "+allPosNull);


	}

	/**
	 *
	 * @param list
	 * @return true if all items in the list are positive
	 * IMPORTANT:
	 * return false if list is null
	 * return true if list is empty
	 */
	public static boolean allPositives(ArrayList<Integer> list) {
		if(list == null)
			return false;
		for(Integer item: list) {
			if(item <= 0) { //<= means NOT positive
				return false;
			}
		} //end of loop
		return true;
	}

	/**
	 *
	 * @param list
	 * @return true if all items in the list are even (divisible by 2)
	 * IMPORTANT:
	 * return false if list is null
	 * return true if list is empty
	 */
	public static boolean allEven(ArrayList<Integer> list) {
		if(list == null)
			return false;
		for(Integer item: list) {
			if(item%2 != 0) { //the only change from allPositives was item <= 0 changed to item%2 != 0
				return false;
			}
		} //end of loop
		return true;
	}

	/**
	 * 
	 * @param list
	 * @param min
	 * @param max
	 * @return the number of items in the range [min...max]. return 0 if list is null
	 */
	public static int countInRange(ArrayList<Integer> list, int min, int max) {
		if(list == null)
			return 0;
		int count = 0;
		for(Integer item: list) {
			if(item >= min && item <= max) {
				count++;
			}
		}
		return count;
	}
	/**
	 *
	 * @param list
	 * modify the list so that each item beomes the square of its previous value
	 */
	public static void squared(ArrayList<Integer> list) {
		if(list == null)
			return;
		for(int i=0; i < list.size(); i++) {
			list.set(i, list.get(i)*list.get(i));
		}
	}

	public static void removeNegatives(ArrayList<Integer> list) {
		if(list == null)
			return;
		int i=0;
		while(i < list.size()) {			
			if(list.get(i) < 0) {
				list.remove(i);
				//don't increment i if item removed, 
				//since next item has moved into index i
				//and needs to be rechecked
			}
			else {
				i++;
			}
		}
	}

	public static ArrayList<Integer> getExclusiveItems(ArrayList<ArrayList<Integer>> list) {
		if(list == null)
			return null; //to be completed
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i < list.size(); i++) { //for each sub-list
			if(list.get(i) == null) {
				continue;
			}
			for(int k=0; k < list.get(i).size(); k++) { //for each item in sub-list i
				boolean anotherHasIt = false;
				//check its existence in every other sub-list
				for(int p=0; p < list.size() && !anotherHasIt; p++) {
					if(list.get(p) == null || i==p) {
						continue;
					}
					if(list.get(p).contains(list.get(i).get(k))) {
						anotherHasIt = true;
					}
				}
				if(!anotherHasIt) { //not present in any other sub-list
					result.add(list.get(i).get(k)); //DO IT!
				}
			}
		}
		return result;
	}
}
