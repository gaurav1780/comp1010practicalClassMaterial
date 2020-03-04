package samplePracExams.pracExam3;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//20 marks
class MyLinkedList {
	public Node head;

	/**
	 * DO NOT MODIFY
	 * @param item: item to be added at the end of the list
	 */
	public void add(int item) {
		Node temp = new Node(item, null);
		if(head == null) {
			head = temp;
		}
		else {
			Node cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = temp;
		}
	}

	/**
	 * DO NOT MODIFY
	 * @param idx: index of item to be returned
	 * @return the value of supplied index (null if index invalid)
	 */
	public Integer get(int idx) {
		Node cur = head;
		for(int i=0; i < idx && cur != null; i++) {
			cur = cur.next;
		}
		if(cur == null)
			return null;
		else
			return cur.data;
	}

  //DO NOT MODIFY
	public int size() {
		int n = 0;
		for(Node cur = head; cur != null; cur = cur.next) {
			n++;
		}
		return n;
	}

	/**
	 * 10 marks
	 *
	 * @param n
	 * @return number of items more than n.
	 * return 0 if empty or none of the items are more than n.
	 * IMPORTANT: list should NOT BE MODIFIED.
	 * for example,
	 * head -> 20 -> 50 -> 60 -> null, n = 40: return 2
	 * head -> 20 -> 50 -> 60 -> null, n = 60: return 0
	 * head -> null, n = 20: return 0
	 */
	public int countMoreThan(int n) {
		return 0; //to be completed
	}

	/**
	 * 10 marks
	 *
	 * physically reverse the list.
	 * for example,
	 * if head -> 20 -> 80 -> 30, it should become head -> 30 -> 80 -> 20
	 * if head -> 70 -> 10 -> 80 -> 30, it should become head -> 30 -> 80 -> 10 -> 70
	 * if head -> 50, it should stay head -> 50
	 * if head -> null, it should stay head -> null
	 */
	public void reverse() {
		//to be completed
	}
}

//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

public class Question7 { //begin TEST class 

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="MyLinkedList:countMoreThan(int)", marks=10)
	public void testMyLinkedListCountMoreThan() throws NoSuchMethodException, SecurityException {
		MyLinkedList list = new MyLinkedList();
		assertEquals(0, list.countMoreThan(10));

		list.add(50);
		list.add(60);
		list.add(-30);
		list.add(70);
		list.add(40); //[50, 60, -30, 70, 40]
		assertEquals(2, list.countMoreThan(55));//60 and 70
		assertEquals(5, list.countMoreThan(-100));//all the items
		assertEquals(0, list.countMoreThan(70));

	}

	@Test @Graded(description="MyLinkedList:reverse()", marks=10)
	public void testMyLinkedListReverse() throws NoSuchMethodException, SecurityException {
		MyLinkedList list = new MyLinkedList();
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(7); //[5, 6, 3, 7]
		list.reverse(); //should become [7, 3, 6, 5]
		assertEquals(4, list.size());
		assertEquals(7, (int)list.get(0));
		assertEquals(3, (int)list.get(1));
		assertEquals(6, (int)list.get(2));
		assertEquals(5, (int)list.get(3));
		list.add(9); //[7, 3, 6, 5, 9]
		list.reverse(); //should become [9, 5, 6, 3, 7]
		assertEquals(5, list.size());
		assertEquals(9, (int)list.get(0));
		assertEquals(5, (int)list.get(1));
		assertEquals(6, (int)list.get(2));
		assertEquals(3, (int)list.get(3));
		assertEquals(7, (int)list.get(4));

	}
} //end TEST class Question7 (do not delete this closing bracket)
