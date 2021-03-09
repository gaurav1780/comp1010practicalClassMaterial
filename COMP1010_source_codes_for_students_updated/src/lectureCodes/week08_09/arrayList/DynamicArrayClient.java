package lectureCodes.week08_09.arrayList;

import java.util.Arrays;
import java.util.Random;

public class DynamicArrayClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray da = new DynamicArray();
		Random r = new Random();
		for(int i=0; i < 40; i++) {
			int item = r.nextInt(20);
			da.add(item, 0);
			System.out.println(da);
		}
		for(int i=0; i < 10; i++) {
			int itemRemoved = da.remove(0);
			System.out.println(itemRemoved+" removed");
			System.out.println(da);
		}

		int[] items = da.remove(0, 10);
		System.out.println(Arrays.toString(items));
		System.out.println(da);
	}

}
