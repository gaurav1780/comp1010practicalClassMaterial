package lectureCodes.week10_11.linkedList;

import java.util.LinkedList;
import java.util.Random;

public class JavaLinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list;
		list = new LinkedList<String>();

		list.add("this");
		list.add("special");
		list.add("day");
		list.add(1, "is");
		list.remove(2);
		list.add(2, "horrible");
		list.add(2, "a");
		list.set(3, "depressing");

		LinkedList<Integer> ilist = new LinkedList<Integer>();

		Random r=  new Random();

		for(int i=0; i < 50; i++) {
			int chance = r.nextInt(100);
			if(chance < 70) {
				ilist.add(r.nextInt(6) + 1);
			}
			else {
				if(chance < 85 && ilist.size() > 0) {
					ilist.remove(ilist.size() - 1);
				}
				else if(ilist.size() > 0) {
					ilist.set(r.nextInt(ilist.size()), r.nextInt(6) + 1);
				}
			}
			System.out.println(ilist);
		}

		//ilist is randomly populated. each item is between 1 and 6

		double avg = average(ilist, 0, list.size() - 1);

		System.out.println("average is "+avg);

		int loc = getIndex(ilist, 6);

		if(loc != -1)
			System.out.println("first 6 at "+loc);
		else
			System.out.println("no 6s yet");

		double bestBlockOutcome = 0;
		int bestBlockSize = 0;
		int bestBlockStart = 0;

		for(int bs = 3; bs <= ilist.size(); bs++) {
			int startLuck = getBestSequence(ilist, bs);
			System.out.println("Best sequence of "+bs+" started at index "+startLuck);
			for(int i=startLuck; i < startLuck + bs; i++)
				System.out.print(ilist.get(i)+" ");
			double current = average(ilist, startLuck, startLuck + bs - 1);
			if(current > bestBlockOutcome) {
				bestBlockOutcome = current;
				bestBlockSize = bs;
				bestBlockStart = startLuck;
			}
			System.out.println(", average = "+current);
		}

		System.out.println();
		System.out.println();
		System.out.println("Gambling analysis: start at "+bestBlockStart+" and go on for "+bestBlockSize+" to get the optimal average of "+bestBlockOutcome);


		list.set(2, "an");
		list.add(3, "increasingly");
		list.set(0, "an");
		
		list.add(4, "moderately");
		list.add(6, "an");
		list.add(2, "this");
		list.add(7, "is");
		list.add(7, "this");
		list.add(7, "this");
		list.add(7, "this");
		list.add(7, "this");
		
		System.out.println(list);

		String firstChars = getFirstCharacters(list);
		System.out.println("string containing first characters: "+firstChars);

		String lastChars = getLastCharacters(list);
		System.out.println("string containing last characters: "+lastChars);
		
		removeDuplicates(list);
		System.out.println("with duplicates removed");
		System.out.println(list);

	}
	
	/**
	 * remove all but the first occurrences of duplicate values such that by 
	 * the end the method the list contains exactly one occurrence of each item
	 * @param list
	 */
	public static void removeDuplicates(LinkedList<String> list) {
		for(int i=0; i<list.size(); i++) {
			String target = list.get(i);
			for(int k=i+1; k < list.size(); k++) {
				String current = list.get(k);
				if(target.equals(current)) {
					list.remove(k);
					k--;
				}
			}
		}
	}


	public static String getLastCharacters(LinkedList<String> list) {
		String result = "";
		for(String item: list)
			result+=item.charAt(item.length()-1);
		return result;
	}

	public static String getFirstCharacters(LinkedList<String> list) {
		String result = "";
		for(String item: list)
			result+=item.charAt(0);
		return result;
	}

	/**
	 * Precondition list.size() >= blockSize
	 * @param list
	 * @param blockSize
	 * @return
	 */
	public static int getBestSequence(LinkedList<Integer> list, int blockSize) {
		int max = 0;
		int result = 0;
		for(int i=0; i <= list.size() - blockSize; i++) {
			int total = 0;
			for(int k=0; k < blockSize; k++) {
				total+=list.get(i+k);
			}
			if(total > max) {
				max = total;
				result = i;
			}
		}
		return result;
	}

	/**
	 * @param list
	 * @param item
	 * @return the index of the first 
	 * occurrence of item in list, -1 if not found
	 */
	public static int getIndex(LinkedList<Integer> list, int item) {
		if(list == null)
			return -1;

		for(int i=0; i<list.size(); i++)
			if(list.get(i) == item)
				return i;

		return -1; //not found
	}

	/**
	 * Preconditions start <= end
	 * @param list
	 * @param start 0 <= start < list.size()
	 * @param end 0 <= end < list.size()
	 * @return
	 */
	public static double average(LinkedList<Integer> list, int start, int end) {
		int total = 0;
		for(int i=start; i <= end; i++)
			total+=list.get(i);
		return ((double)total) / (end - start + 1);
	}

}
