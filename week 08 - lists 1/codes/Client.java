import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
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
		return false; //to be completed
	}
	
	//countInRange goes here
	
	/**
	 * 
	 * @param list
	 * modify the list so that each item becomes the square of its previous value
	 */
	public static void squared(ArrayList<Integer> list) {
		//to be completed
	}
	
	public static void removeNegatives(ArrayList<Integer> list) {
		//to be completed
	}
	
	public static ArrayList<Integer> getExclusiveItems(ArrayList<ArrayList<Integer>> list) {
		return null; //to be completed
	}
}
