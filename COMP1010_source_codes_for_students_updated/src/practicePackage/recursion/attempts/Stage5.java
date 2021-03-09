package practicePackage.recursion.attempts;

public class Stage5 {
	public String addRecursive(String a, String b) {
		return ""; //to be completed
	}

	public String subtractRecursive(String a, String b) {
		return ""; //to be completed
	}


	public String multiplyRecursive(String a, String b) {
		return ""; //to be completed
	}

	public String divideRecursive(String a, String b) {
		return ""; //to be completed
	}

	public String remainderRecursive(String a, String b) {
		return ""; //to be completed
	}
	
	public String getRandomInteger(int minDigits, int maxDigits) {
		int n = (int)(Math.random()*(maxDigits - minDigits + 1)) + minDigits;
		String result = "";
		for(int i=0; i < n; i++) {
			result = result + (int)(Math.random()*10);
		}
		return result;
	}
}
