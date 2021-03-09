package lectureCodes.week12.searching;

public class SearchServiceClient {

	public static void main(String[] args) {
		int[] arr = {0,1,1,2,3,5,8,13,21,34,55,89,144,243,387,630}; //fibonacci sequence
		for(int i=0; i < arr.length; i++) {			
			System.out.println("searching for "+arr[i]);
			int idx = SearchService.binarySearch(arr, arr[i], 0, arr.length - 1);
			if(idx >= 0)
				System.out.println("found at index "+idx);
			else
				System.out.println("not found");
			System.out.println("----------------------------");
		}
		System.out.println("number of items: "+arr.length);
	}

}
