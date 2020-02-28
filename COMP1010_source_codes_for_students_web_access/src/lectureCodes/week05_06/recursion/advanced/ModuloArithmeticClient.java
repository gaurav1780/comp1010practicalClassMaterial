package lectureCodes.week05_06.recursion.advanced;

import java.util.Random;

public class ModuloArithmeticClient {

	public static void main(String[] args) {
		Random r = new Random();
		int min = r.nextInt(200) + 5;
		int max = r.nextInt(500) + min;
		int modulus = RecursionService.getPrime(min, max);
		int x = r.nextInt(modulus) + 1;
		System.out.println(x+" inverse (modulo "+modulus+") = "+RecursionService.inverseRecursive(modulus, x, modulus, 0, 1));
		int n = r.nextInt(50)+100;
		System.out.println(x+"^"+n+" (mod "+modulus+") = "+RecursionService.powerModulo(x, n, modulus));
	}

}
