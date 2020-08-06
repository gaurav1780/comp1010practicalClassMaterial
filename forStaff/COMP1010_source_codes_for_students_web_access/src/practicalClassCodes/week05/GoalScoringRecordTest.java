package practicalClassCodes.week05;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GoalScoringRecordTest {

	@Test
	void testCompareTo() {
		GoalScoringRecord a = new GoalScoringRecord(6, 2);
		GoalScoringRecord b = new GoalScoringRecord(8, 1);
		GoalScoringRecord c = new GoalScoringRecord(15, 5);
		assertEquals(1,  a.compareTo(b));
		assertEquals(-1,  b.compareTo(c));
		assertEquals(0,  c.compareTo(a));	
	}
}
