package testsAttempts.customBuiltLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import attempts.customBuiltLinkedList.*;

class NodeServiceTest {
	private Node a, b, c, d, e, f;
	
	@BeforeEach 
	public void run() {
		f = new Node(17, null);
		e = new Node(25, f);
		d = new Node(49, e);
		c = new Node(36, d);
		b = new Node(0, c);
		a = new Node(-12, b);
		
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;
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
	}

	@Test
	void testIdentical() {
				
		assertTrue(NodeService.identical(a, a));
		assertFalse(NodeService.identical(a, b));
		assertFalse(NodeService.identical(e, a));
		assertFalse(NodeService.identical(e, null));	
	}

	@Test
	void testJoin() {
				
		assertEquals(a, NodeService.join(null, a));
		assertEquals(c, NodeService.join(c, null));
		
		Node i = new Node (22, null);
		Node h = new Node (31, i);
		Node g = new Node (72, h);
		// 72 -> 31 -> 22 -> null
		
		Node f1 = new Node (17, g);
		Node e1 = new Node (25, f1);
		Node d1 = new Node (49, e1);
		// 49 ->25 -> 17 -> 72 -> 31 -> 22 -> null
		Node x = NodeService.join(d, g);
		assertEquals(d1.getData(), x.getData());
		assertEquals(f1.getData(), x.getNext().getNext().getData());
		assertEquals(g.getData(), x.getNext().getNext().getNext().getData());
		assertEquals(i.getData(), x.getNext().getNext().getNext().getNext().getNext().getData());
	}

	@Test
	void testSubList() {
				
		assertNull(NodeService.subList(a, -1, 3));
		assertNull(NodeService.subList(a, 1, 8));
		
		Node e1 = new Node (25, null);
		Node d1 = new Node (49, e1);
		Node c1 = new Node (36, d1);
		// 36 -> 49 -> 25 -> null
		assertEquals(c1.getData(), NodeService.subList(a, 2, 4).getData());
		assertEquals(c1.getNext().getData(), NodeService.subList(a, 2, 4).getNext().getData());
		assertEquals(c1.getNext().getNext().getData(), NodeService.subList(a, 2, 4).getNext().getNext().getData());
		
		Node d2 = new Node (49, null);
		Node c2 = new Node (36, d2);
		Node b2 = new Node (0, c2);
		// 0 -> 36 -> 49 -> null
		assertEquals(b2.getData(), NodeService.subList(b, 0, 2).getData());
		assertEquals(b2.getNext().getData(), NodeService.subList(b, 0, 2).getNext().getData());
		assertEquals(b2.getNext().getNext().getData(), NodeService.subList(b, 0, 2).getNext().getNext().getData());
	}

	@Test
	void testSame() {
				
		Node f1 = new Node(17, null);
		Node e1 = new Node(25, f1);
		Node d1 = new Node(49, e1);
		Node c1 = new Node(36, d1);
		Node b1 = new Node(0, c1);
		Node a1 = new Node(-12, b1);
		// -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null
		assertTrue(NodeService.same(a, a1));
		
		Node b2 = new Node(0, null);
		Node a2 = new Node(-12, b2);
		// -12 -> 0 -> null
		assertFalse(NodeService.same(a, a2));
		
		Node f3 = new Node(17, null);
		Node e3 = new Node(28, f3);
		Node d3 = new Node(31, e3);
		Node c3 = new Node(-10, d3);
		Node b3 = new Node(26, c3);
		Node a3 = new Node(5, b3);
		// 5 -> 26 -> -10 -> 31 -> 28 -> 17 -> null
		assertFalse(NodeService.same(a, a3));
		
		assertFalse(NodeService.same(a, null));
		assertFalse(NodeService.same(null, c));	
	}

	@Test
	void testSort() {
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null
		a = NodeService.sort(a, true);
		//a -> -12 -> 0 -> 17 -> 25 -> 36 -> 49 -> null
		assertNotNull(a);
		assertEquals("[-12, 0, 17, 25, 36, 49]", NodeService.toString(a));

		a = NodeService.sort(a, false);
		//a -> 49 -> 36 -> 25 -> 17 -> 0 -> -12 -> null
		assertNotNull(a);
		assertEquals("[49, 36, 25, 17, 0, -12]", NodeService.toString(a));

		
		a = new Node(-1, null);
		a = NodeService.sort(a, true);
		assertNotNull(a);
		assertEquals("[-1]", NodeService.toString(a));

		a = null;
		a = NodeService.sort(a, false);
		assertNull(a);
	}

}
