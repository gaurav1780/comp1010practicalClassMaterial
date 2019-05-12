public class MyArrayList {
	private Rectangle[] data;
	private int nItems;

	public MyArrayList() {
		data = new Rectangle[5];
		nItems = 0;
	}

	/**
	 * 
	 * @return number of items currently in the list
	 */
	public int currentSize() {
		return nItems;
	}

	/**
	 * 
	 * @return the total number of possible items that can currently be
	 * held in the list
	 */
	public int currentCapacity() {
		return data.length;
	}

	/**
	 * 
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return nItems == 0;
	}

	/**
	 * 
	 * @return true if list is currently full, false otherwise
	 */
	public boolean isFull() {
		return nItems == data.length;
	}

	/**
	 * increase the size of the array by 10
	 * refer to the lecture notes if you are not sure
	 * how to "increase size of array"
	 */
	public void grow() {
		//to be completed
	}

	/**
	 * add item r at the end of the list
	 * @param r
	 */
	public void add(Rectangle r) {
		//to be completed
	}

	/**
	 * 
	 * @param idx
	 * @return true if index idx is valid (items exists at index idx), false otherwise
	 */
	public boolean isValidIndex(int idx) {
		return idx >= 0 && idx < nItems;
	}

	/**
	 * 
	 * @param idx
	 * @return item at index idx if any, null otherwise
	 */
	public Rectangle get(int idx) {
		return null; //to be completed
	}

	/**
	 * remove item at idx, if any
	 * @param idx
	 * @return the item removed, null if no item at index idx
	 */
	public Rectangle remove(int idx) {
		return null; //to be completed
	}

	/**
	 * remove Rectangle r, if present, from the list
	 * @param r
	 * @return true if r found and removed, false otherwise
	 */
	public boolean remove(Rectangle r) {
		return false; //to be completed
	}

/**
	 * add Rectangle r at index idx
	 * @param idx
	 * @param item
	 * @return true if idx is an index where item can be added, false otherwise
	 */
	public boolean add(int idx, Rectangle r) {
		return false; //to be completed
	}

	/**
	 * add all items of the passed array to the list.
	 * Challenge: Do NOT call add for each item of the passed array. 
	 * @param itemsToAdd
	 */
	public void addAll(Rectangle[] itemsToAdd) {
		//to be completed
	}

	/**
	 * resize the array so that there are no empty spaces
	 */
	public void resizeToFit() {
		//to be completed
	}
}
