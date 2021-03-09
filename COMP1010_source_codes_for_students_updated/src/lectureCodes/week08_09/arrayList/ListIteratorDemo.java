package lectureCodes.week08_09.arrayList;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90, -30, 80, 0, -40));
		
		ListIterator<Integer> iter1 = list.listIterator();
		
		System.out.print("Items front to back: ");
		while(iter1.hasNext()) {
			System.out.print(iter1.next()+" ");
		}
		System.out.println();
		
		//now iterator AFTER last item
		System.out.print("Items back to front: ");
		while(iter1.hasPrevious()) {
			System.out.print(iter1.previous()+" ");
		}
		System.out.println();

		
		while(iter1.hasNext()) {
		    if(iter1.next() < 0) {
		        iter1.add(666); //marker moves forward after adding the item
		    }
		}
		System.out.println("With 666 inserted after every negative item: \n"+list);

		//adding item BEFORE an item that satisfies some criteria
		ListIterator<Integer> iter2 = list.listIterator(list.size());
		while(iter2.hasPrevious()) {
		    if(iter2.previous() < 0) {
		        iter2.add(888); //marker moves left after adding the item
		    }
		}
		System.out.println("With 888 inserted before every negative item: \n"+list);

		/*
		 * KEY POINT:
		 * placing item AFTER: next()
		 * placing item BEFORE: previous() 
		 */
		
		/*
		 * modifying a list while iterating over it is not (easily) possible
		 * using the enhanced for loop
		 */
		
		//REMOVE ALL NEGATIVE ITEMS
		iter1 = list.listIterator(list.size()); 
		while(iter1.hasPrevious()) {
			if(iter1.previous() < 0) { //item accessed
				iter1.remove(); //most recently accessed item is removed
			}
		}
		System.out.println("With all negative items removed: \n"+list);

		/*
		 * KEY POINT:
		 * remove function removes the item most recently accessed using 
		 * next() or previous()
		 */
		
		//increment all multiples of 10 by 1
		
		/*
		 * KEY POINT:
		 * set changes the item MOST CURRENTLY ACCESSED using next() or previous
		 */
		
		iter1 = list.listIterator();
		while(iter1.hasNext()) {
			int lastAccessedItem = iter1.next();
			if(lastAccessedItem%10 == 0) {
				iter1.set(lastAccessedItem + 1);
			}
		}
		
		System.out.println("With multiples of 10 incremented by 1: \n"+list);	
	}

}
