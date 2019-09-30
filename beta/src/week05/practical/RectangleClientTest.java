package week05.practical;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleClientTest {

	@Test public void testCountSquares() {
		Rectangle[] arr = new Rectangle[6]; 
		arr[0] = new Rectangle(2, 7); 
		arr[1] = new Rectangle(10, 2); 
		arr[2] = new Rectangle(5, 4); 
		arr[3] = new Rectangle(14, 6);
		arr[4] = new Rectangle(7, 5);
		arr[5] = new Rectangle(4, 5); 

		assertEquals(0, RectangleClient.countSquares(arr));

		Rectangle[] brr = new Rectangle[6]; 
		brr[0] = new Rectangle(2, 7); 
		brr[1] = new Rectangle(10, 10); 
		brr[2] = new Rectangle(5, 4); 
		brr[3] = new Rectangle(14, 14);
		brr[4] = new Rectangle(7, 5);
		brr[5] = new Rectangle(4, 5); 

		assertEquals(2, RectangleClient.countSquares(brr)); //index 1, 3 items

		Rectangle[] crr = new Rectangle[6]; 
		crr[0] = new Rectangle(7, 7); 
		crr[1] = new Rectangle(10, 10); 
		crr[2] = new Rectangle(5, 4); 
		crr[3] = new Rectangle(14, 14);
		crr[4] = new Rectangle(7, 5);
		crr[5] = new Rectangle(5, 5); 

		assertEquals(4, RectangleClient.countSquares(crr)); //index 0, 1, 3, 5 items
	}


}
