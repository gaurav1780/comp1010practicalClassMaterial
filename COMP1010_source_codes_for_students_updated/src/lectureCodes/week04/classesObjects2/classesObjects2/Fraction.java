package lectureCodes.week04.classesObjects2.classesObjects2;

import java.util.Scanner;

/**
 * 
 * @author gauravgupta
 * a number of the form p/q where p and q are integers and q is not equal to 0
 * examples: 1/3, 56/908, -60/540
 */
public class Fraction {
	public int num, den;

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDen(int den) {
		Scanner scanner = new Scanner(System.in);
		while(den == 0) {
			System.out.println("denominator cannot be zero. re-enter a value: ");
			den = scanner.nextInt();
		}
		scanner.close();
		this.den = den;
	}
	
	public Fraction(int n, int d) {
		setNum(n);
		setDen(d);
	}
	
	public Fraction(int a) {
		setNum(a);
		setDen(1);
	}
	
	public Fraction() {
		setNum(0);
		setDen(1);
	}
	
	public double getValue() {
		return (double)num/den;
	}
	
	public String toString() {
		return num+"/"+den+" ("+getValue()+")";
	}
	
	//10/50 -> 1/5
	public Fraction simplified() {
		//euclid's method
		int a = num;
		int b = den;
		while(b!=0) {
			int temp = a%b;
			a = b;
			b = temp;
		}
		int rn = num/a;
		int rd = den/a;
		Fraction reduced = new Fraction(rn, rd);
		return reduced;
	}
	
	public void simplify() {
		//euclid's method
		int a = num;
		int b = den;
		while(b!=0) {
			int temp = a%b;
			a = b;
			b = temp;
		}
		num/=a;
		den/=a;
	}
	
	//(10/50)*(2/3)=(20/150)
	public Fraction multiply(Fraction other) {
		int n = this.num * other.num;
		int d = this.den * other.den;
		Fraction result = new Fraction(n, d);
		return result;		
	}
}
