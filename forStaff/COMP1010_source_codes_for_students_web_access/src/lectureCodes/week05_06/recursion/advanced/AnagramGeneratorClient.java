package lectureCodes.week05_06.recursion.advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramGeneratorClient {
	public static String[] words;
	
	public static int validWord(String word) {
		int first = 0;
		int last = words.length - 1;
		while(first <= last) {
			int median = (first+last)/2;
			if(words[median].equalsIgnoreCase(word))
				return median;
			if(word.compareTo(words[median]) == -1)
				last = median - 1;
			else
				first = median + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dictionary.txt");
		Scanner scanner = new Scanner(file);
		words = new String[178691];
		for(int i=0; i < words.length; i++) {
			words[i] = scanner.next();
		}
		scanner.close();
		System.out.println(Arrays.toString(words));
		String str = "SUPER";
		
		ArrayList<ArrayList<String>> permutations = new ArrayList<ArrayList<String>>();
		ArrayList<String> validWords = new ArrayList<String>();
		for(int size=1; size <= str.length(); size++) {
			ArrayList<String> current = new ArrayList<String>();
			for(int k=0; k < RecursionService.countPermutations(str.length(), size); k++) {
				String p = RecursionService.getPermutation(str, size, k);
				System.out.println("Word generated: "+p);
				if(current.contains(p)==false)
					current.add(p);
					//System.out.println("Permutation "+k+" of size "+size+" of "+str+": "+RecursionService.getPermutation(str, size, k));
			}
			permutations.add(current);
		}
		
		int size = 1;
		for(ArrayList<String> current: permutations) {
			int counter = 1;
			for(String s: current) {
				System.out.println("Permutation "+counter+" of size "+size+": "+s);
				if(validWord(s)>=0)
					validWords.add(s);
				counter++;
			}
			System.out.println();
			size++;
		}
		
		System.out.println("Valid words: "+validWords);
	}
}
