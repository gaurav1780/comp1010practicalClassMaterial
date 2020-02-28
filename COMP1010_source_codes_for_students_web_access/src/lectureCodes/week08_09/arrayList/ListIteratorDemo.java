package lectureCodes.week08_09.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(9);
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(4);
		
		ListIterator<Integer> iter = list.listIterator();
		System.out.println("iterating starting at the beginning: ");
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		System.out.println("removing all even numbers: ");
		iter = list.listIterator(); //bring back to the beginning
		while(iter.hasNext()) {
			if(iter.next() % 2 == 0) {
				iter.remove();
			}
			System.out.println(list);
		}	
		
		System.out.println("setting all numbers less than 8 to 0: ");
		iter = list.listIterator();
		
		while(iter.hasNext()) {
			if(iter.next() < 8) {
				iter.set(0);
			}
			System.out.println(list);
		}	

		System.out.println("add a -1 after every 0: ");
		iter = list.listIterator();
		
		while(iter.hasNext()) {
			if(iter.next() == 0) {
				iter.add(-1);
			}
			System.out.println(list);
		}	

		
		iter = list.listIterator(1);
		System.out.println("iterating starting at index 1: ");
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		System.out.println("reverse iterating starting at index 1 (incorrect): ");
		iter = list.listIterator(1);
		while(iter.hasPrevious()) {
			System.out.print(iter.previous()+" ");
		}
		System.out.println();
		
		System.out.println("reverse iterating starting at index 1 (correct): ");
		iter = list.listIterator(2);
		while(iter.hasPrevious()) {
			System.out.print(iter.previous()+" ");
		}
		System.out.println();
		
		System.out.println("reverse iterating starting at end of list: ");
		iter = list.listIterator(list.size());
		while(iter.hasPrevious()) {
			System.out.print(iter.previous()+" ");
		}
		System.out.println();
		System.out.println("Some more items added");
		list.add(12);
		list.add(19);
		list.add(16);
		list.add(13);
		list.add(17);
		list.add(14);
		System.out.println(list);
		
		System.out.println("getting the index of the first negative item: ");
		int result = -1;
		iter = list.listIterator();
		while(iter.hasPrevious() && result == -1) {
			if(iter.next() < 0) {
				result = iter.nextIndex() - 1;
			}
		}
		System.out.println("First negative item at index "+result);
		
		System.out.println("getting the index of the last negative item: ");
		result = -1;
		iter = list.listIterator(list.size());
		while(iter.hasPrevious() && result == -1) {
			if(iter.previous() < 0) {
				result = iter.previousIndex() + 1;
			}
		}
		System.out.println("Last negative item at index "+result);
	}

}
