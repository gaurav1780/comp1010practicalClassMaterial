package practicePackage.customBuiltLists.customLinkedList.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practicePackage.customBuiltLists.customLinkedList.attempts.*;

class NodeServiceTest {
	public Node a, b, c, d, e, f;
	public Node a1, b1, c1, d1, e1, f1;


	@BeforeEach 
	public void run() {
		f = new Node(17, null);
		e = new Node(25, f);
		d = new Node(49, e);
		c = new Node(36, d);
		b = new Node(0, c);
		a = new Node(-12, b);
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;

		f1 = new Node(17, null);
		e1 = new Node(25, f1);
		d1 = new Node(49, e1);
		c1 = new Node(36, d1);
		b1 = new Node(0, c1);
		a1 = new Node(-12, b1);
		//a1 -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
	}

	void ensureNoModify() {
		assertNotNull(NodeService.toString(a));
		assertEquals("[-12, 0, 36, 49, 25, 17]", NodeService.toString(a));

		assertNotNull(NodeService.toString(b));
		assertEquals("[0, 36, 49, 25, 17]", NodeService.toString(b));

		assertNotNull(NodeService.toString(c));
		assertEquals("[36, 49, 25, 17]", NodeService.toString(c));

		assertNotNull(NodeService.toString(d));
		assertEquals("[49, 25, 17]", NodeService.toString(d));

		assertNotNull(NodeService.toString(e));
		assertEquals("[25, 17]", NodeService.toString(e));

		assertNotNull(NodeService.toString(f));
		assertEquals("[17]", NodeService.toString(f));
	}

	@Test
	void testSum() {
		assertEquals(115, NodeService.sum(a));
		assertEquals(127, NodeService.sum(b));
		assertEquals(127, NodeService.sum(c));
		assertEquals(91, NodeService.sum(d));
		assertEquals(42, NodeService.sum(e));
		assertEquals(17, NodeService.sum(f));
		assertEquals(0, NodeService.sum(null));	

		ensureNoModify();
	}

	@Test
	void testSumOdd() {
		assertEquals(91, NodeService.sumOdd(a));
		assertEquals(91, NodeService.sumOdd(b));
		assertEquals(91, NodeService.sumOdd(c));
		assertEquals(91, NodeService.sumOdd(d));
		assertEquals(42, NodeService.sumOdd(e));
		assertEquals(17, NodeService.sumOdd(f));
		assertEquals(0, NodeService.sumOdd(null));

		ensureNoModify();
	}

	@Test
	void testCount() {
		assertEquals(6, NodeService.count(a));
		assertEquals(5, NodeService.count(b));
		assertEquals(4, NodeService.count(c));
		assertEquals(3, NodeService.count(d));
		assertEquals(2, NodeService.count(e));
		assertEquals(1, NodeService.count(f));
		assertEquals(0, NodeService.count(null));

		ensureNoModify();
	}

	@Test
	void testCountPositives() {
		assertEquals(4, NodeService.countPositives(a));
		assertEquals(4, NodeService.countPositives(b));
		assertEquals(4, NodeService.countPositives(c));
		assertEquals(3, NodeService.countPositives(d));
		assertEquals(2, NodeService.countPositives(e));
		assertEquals(1, NodeService.countPositives(f));
		assertEquals(0, NodeService.countPositives(null));

		ensureNoModify();
	}

	@Test
	void testCountPrimes() {
		assertEquals(1, NodeService.countPrimes(a));
		assertEquals(1, NodeService.countPrimes(b));
		assertEquals(1, NodeService.countPrimes(c));
		assertEquals(1, NodeService.countPrimes(d));
		assertEquals(1, NodeService.countPrimes(e));
		assertEquals(1, NodeService.countPrimes(f));
		assertEquals(0, NodeService.countPrimes(null));

		ensureNoModify();
	}

	@Test
	void testGetFirstPositiveNode() {
		assertEquals(c, NodeService.getFirstPositiveNode(a));
		assertEquals(c, NodeService.getFirstPositiveNode(b));
		assertEquals(c, NodeService.getFirstPositiveNode(c));
		assertEquals(d, NodeService.getFirstPositiveNode(d));
		assertEquals(e, NodeService.getFirstPositiveNode(e));
		assertEquals(f, NodeService.getFirstPositiveNode(f));
		assertNull(NodeService.getFirstPositiveNode(null));

		ensureNoModify();
	}

	@Test
	void testIdentical() {
		assertTrue(NodeService.identical(a, a1));
		assertTrue(NodeService.identical(c, c1));
		assertFalse(NodeService.identical(a, b));
		assertFalse(NodeService.identical(e, a));
		assertFalse(NodeService.identical(e, null));	

		ensureNoModify();
	}

	@Test
	void testSubList() {
		assertNull(NodeService.subList(a, -1, 3));
		assertNull(NodeService.subList(a, 1, 8));
		assertNull(NodeService.subList(a, 3, 1));
		assertNull(NodeService.subList(a, -1, -1));
		assertNull(NodeService.subList(a, 6, 6));

		assertNotNull(NodeService.subList(a, 0, 3));	
		System.out.println(NodeService.toString(a));
		assertEquals("[-12, 0, 36, 49]", NodeService.toString(NodeService.subList(a, 0, 3)));

		assertNotNull(NodeService.subList(a, 2, 3));		
		assertEquals("[36, 49]", NodeService.toString(NodeService.subList(a, 2, 3)));

		assertNotNull(NodeService.subList(a, 5, 5));		
		assertEquals("[17]", NodeService.toString(NodeService.subList(a, 5, 5)));

		ensureNoModify();
	}

	@Test
	void testSame() {
		assertTrue(NodeService.same(a, a1));

		Node f2 = new Node(17, null);
		Node e2 = new Node(25, f2);
		Node d2 = new Node(49, e2);
		Node c2 = new Node(-36, d2);
		Node b2 = new Node(0, c2);
		Node a2 = new Node(-12, b2);
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> -36 -> 49 -> 25 -> 17 -> null;		

		assertFalse(NodeService.same(a, a2));

		c2.data = 36;
		e2.next = null;
		//a  -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> 36 -> 49 -> 25 -> null;

		assertFalse(NodeService.same(a, a2));

		e2.next = f2;
		f2.next = new Node(20, null);
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> 20 -> null;

		assertFalse(NodeService.same(a, a2));

		f2.next = null;

		System.out.println(NodeService.toString(a));
		System.out.println(NodeService.toString(a2));
		assertTrue(NodeService.same(a, a2));

		//a  -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;

		ensureNoModify();
	}

	@Test
	void testSort() {
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null
		Node temp = NodeService.sort(a, true);
		//temp -> -12 -> 0 -> 17 -> 25 -> 36 -> 49 -> null
		assertNotNull(temp);
		assertEquals("[-12, 0, 17, 25, 36, 49]", NodeService.toString(temp));

		temp = NodeService.sort(a, false);
		//temp -> 49 -> 36 -> 25 -> 17 -> 0 -> -12 -> null
		assertNotNull(temp);
		assertEquals("[49, 36, 25, 17, 0, -12]", NodeService.toString(temp));

		Node x = new Node(-1, null);
		Node sx = NodeService.sort(x, true);
		assertNotNull(sx);
		assertEquals("[-1]", NodeService.toString(sx));

		Node y = null;
		Node sy = NodeService.sort(y, false);
		assertNull(sy);
		
		ensureNoModify();
	}

	@Test
	void testJoin() {
		assertNotEquals(a, NodeService.join(null, a));
		assertNotEquals(c, NodeService.join(c, null));

		Node x = NodeService.join(a, c1);
		assertEquals("[-12, 0, 36, 49, 25, 17, 36, 49, 25, 17]", NodeService.toString(x));

		a = a.next;
		c1 = c1.next;
		
		x = NodeService.join(a, c1);

		assertEquals("[0, 36, 49, 25, 17, 49, 25, 17]", NodeService.toString(x));

		ensureNoModify();
	}
}
