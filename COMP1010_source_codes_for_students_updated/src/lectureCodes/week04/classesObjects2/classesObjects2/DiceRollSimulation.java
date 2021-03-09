package lectureCodes.week04.classesObjects2.classesObjects2;

import java.util.Random;

public class DiceRollSimulation {
	public int[] outcomes;

	public void setOutcomes(int n) {
		if(n <= 0) {
			outcomes = new int[0];
		}
		else {
			outcomes = new int[n];
			Random r = new Random();

			/*
			 * r.nextInt(limit)
			 * returns a random integer
			 * between 0 (incl.) and limit (excl).
			 * 
			 * eg. r.nextInt(6)
			 * returns a random integer 
			 * from 0/1/2/3/4/5
			 */
			for(int i=0; i < outcomes.length; i++) {
				outcomes[i] = 1 + r.nextInt(6);
			}
		}
	}
	
	public DiceRollSimulation(int n) {
		setOutcomes(n);
	}
	
	/**
	 * outcomes = {4,5,6,1,3}
	 * output should be 
	 * "dice was rolled 5 times and the outcomes were 4, 5, 6, 1, and 3"
	 */
	public String toString() {
		String s = "dice was rolled "+ outcomes.length;
		s = s + " and the outcomes were ";
		for(int i=0; i < outcomes.length - 1; i++) {
			s = s + outcomes[i]+", ";
		}
		s = s + "and "+outcomes[outcomes.length - 1];
		return s;
	}
	
	public double average() {
		int total = 0;
		for(int i=0; i < outcomes.length; i++) {
			total+=outcomes[i];
		}
		return (double)total / outcomes.length;
	}
	
	/**
	 * 
	 * @param k
	 * @return the index starting at which the next k items have the highest average
	 * {6,2,6,5,3,4,6,6,5,4,3,6}
	 * k = 3
	 * [0],[1],[2] = 6+2+6=14
	 * [1],[2],[3] = 2+6+5=13
	 * ...
	 * [6],[7],[8] = 6+6+5=17 best
	 * [7],[8],[9] = 6+5+4=15
	 * ...
	 * return 6
	 * 
	 */
	public int startGoodLuck(int k) {
		return 0;
	}

}
