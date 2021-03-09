package lectureCodes.week12.sorting;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = ArrayService.generate(10, 1, 10);
		ArrayService.display(arr);
		System.out.println(ArrayService.contains(arr, 5));		
		System.out.println(ArrayService.indexOf(arr, 5)); //-1/0/.../9
		System.out.println(ArrayService.indexOfV2(arr, 5)); //-1/0/.../9
		System.out.println(ArrayService.indexOf(null, 5)); //-1
		int[] empty = new int[0];
		System.out.println(ArrayService.indexOf(empty, 5)); //-1
		
		arr = ArrayService.generateSortedArray(8192, 1, 20);
		ArrayService.display(arr);
		System.out.println(ArrayService.binarySearch(arr, 2)); //-1/0/.../9
		
		
	}

}
