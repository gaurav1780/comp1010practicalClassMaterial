package practicalClassCodes.week02;

public class ChangeCalculator {
	public static void main(String[] args) {
		int total = 127;
		int remaining = total;

		int hundredDollarBills = remaining / 100;
		remaining = remaining % 100;

		int fiftyDollarBills = remaining / 50;
		remaining = remaining % 50;

		int twentyDollarBills = remaining / 20;
		remaining = remaining % 20;

		int tenDollarBills = remaining / 10;
		remaining = remaining % 10;

		int fiveDollarBills = remaining / 5;
		remaining = remaining % 5;

		int twoDollarCoins = remaining / 2;
		remaining = remaining % 2;

		int oneDollarCoin = remaining; //remaining is either 0 or 1 at this stage

		if(hundredDollarBills != 0) {
			System.out.println(hundredDollarBills + " x $100");
		}
		if(fiftyDollarBills != 0) {
			System.out.println(fiftyDollarBills + " x $50");
		}
		if(twentyDollarBills != 0) {
			System.out.println(twentyDollarBills + " x $20");
		}
		if(tenDollarBills != 0) {
			System.out.println(tenDollarBills + " x $10");
		}
		if(fiveDollarBills != 0) {
			System.out.println(fiveDollarBills + " x $5");
		}
		if(twoDollarCoins != 0) {
			System.out.println(twoDollarCoins + " x $2");
		}
		if(oneDollarCoin != 0) {
			System.out.println(oneDollarCoin + " x $1");
		}
	}
}
