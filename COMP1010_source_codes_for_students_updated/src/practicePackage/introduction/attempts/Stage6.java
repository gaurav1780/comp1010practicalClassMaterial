// Cannot use any library functions (apart from String class) for any task

package practicePackage.introduction.attempts;

public class Stage6 {
	public String add(String a, String b) {
		return "";
	}

	public String subtract(String a, String b) {
		return "";
	}

	public String multiply(String a, String b) {
		return "";
	}

	public String divide(String a, String b) {
		return "";
	}

	public String remainder(String a, String b) {
		return "";
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
