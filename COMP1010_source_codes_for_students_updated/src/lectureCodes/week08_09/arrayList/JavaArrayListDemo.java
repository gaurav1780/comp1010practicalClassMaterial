package lectureCodes.week08_09.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class JavaArrayListDemo {

	public static void main(String[] args) {
		// a list holding real numbers
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(1.5);
		System.out.println("item at index 0: "+list.get(0));
		list.add(2.5);
		System.out.println("item at index 1: "+list.get(1));
		list.add(3.5);
		System.out.println("item at index 2: "+list.get(2));
		//first item 1.5, second 2.5, third 3.5
		list.add(1, 1.8);
		//first item 1.5, second 1.8, third 2.5, fourth 3.5
		list.set(3, 4.2); //change item at index 3 to 4.2
		//first item 1.5, second 1.8, third 2.5, fourth 4.2
		list.remove(2); //remove item at index 2
		//first item 1.5, second 1.8, third 4.2
		list.add(3, 1.8);
		//first item 1.5, second 1.8, third 4.2, fourth 1.8
		System.out.println("...after certain modifications, list: "+list); //built-in toString() method called
		System.out.println("index of 1.8: "+list.indexOf(1.8)); //first index of item 1.8: 1
		System.out.println("last index of 1.8: "+list.lastIndexOf(1.8)); //first index of item 1.8: 3
		System.out.println("index of 4.2: "+list.indexOf(4.2)); //first index of item 4.2: 2
		System.out.println("index of 2.5: "+list.indexOf(2.5)); //first index of item 2.5: -1 (not found)
		System.out.println("number of items: "+list.size()); //number of items: 4
		
		list.clear(); //erase all items
		System.out.println("...after clearing, list: "+list); //built-in toString() method called

		for(int i=0; i < 7; i++) {
			list.add((int)(Math.random() * 13)/2.0 - 3); //add a random number between -3 and +3
		}
		System.out.println("...after re-populating with random real numbers between -3 and +3, list: "+list); //built-in toString() method called

		int firstNegIndex = -1; //assume no negatives
		for(int i=0; i < list.size() && firstNegIndex == -1; i++) {
			if(list.get(i) < 0) {
				firstNegIndex = i;
			}
		}
		if(firstNegIndex == -1) {
			System.out.println("no negative numbers");
		}
		else {
			System.out.println("first negative number at index "+firstNegIndex);
		}

		/*
		 * iterator loop - very useful when you don't have any
		 * use of index except for accessing an item
		 */
		double total = 0;
		for(double item: list) {
			total+=item;
		}
		System.out.println("total: "+total);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList = generate(20, 1, 6); //create a list of 20 items, each between 1 and 6
		System.out.println("randomized list of size 20 with each item between 1 and 6: \n"+myList);		
		remove(myList, 4); //remove all 4s from myList
		System.out.println("list with all 4s removed: \n"+myList);

		/*
		 * demo of iterator
		 */
		Iterator<Integer> iter = myList.iterator();
		System.out.println("Traversing using iterator: ");
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();		
	}

	public static void remove(ArrayList<Integer> list, int item) {
		if(list == null)
			return;
		
		for(int i=0; i < list.size(); i++) {
			if(list.get(i) == item) {
				list.remove(i);
				i--; //to check the item moved into index i again
			}
		}
	}

	public static ArrayList<Integer> generate(int n, int min, int max) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(n <= 0 || max < min) {
			return result;
		}
		
		Random r = new Random();
		for(int i=0; i < n; i++) {
			int item = min + r.nextInt(max - min + 1);
			result.add(item);
		}
		
		return result;
	}

}
