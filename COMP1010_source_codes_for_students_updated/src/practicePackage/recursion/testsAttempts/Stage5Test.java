package practicePackage.recursion.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import practicePackage.recursion.attempts.Stage5;

public class Stage5Test {
	protected Stage5 testObject;

	@BeforeEach
	public void run() {
		testObject = new Stage5();
	}

	public static int randInt(int max, int min) {
		return ((int) (Math.random()*(max - min))) + min;
	}

	@Test @Timeout(4000)
	void testAddRecursive() {
		//equal
		assertEquals("5592",testObject.addRecursive("2796","2796"));
		assertEquals("9284",testObject.addRecursive("4642","4642"));
		assertEquals("14680",testObject.addRecursive("7340","7340"));
		assertEquals("10186",testObject.addRecursive("5093","5093"));
		assertEquals("4108",testObject.addRecursive("2054","2054"));
		//low close
		assertEquals("290",testObject.addRecursive("263","27"));
		assertEquals("1349",testObject.addRecursive("379","970"));
		assertEquals("693",testObject.addRecursive("92","601"));
		assertEquals("838",testObject.addRecursive("834","4"));
		assertEquals("1027",testObject.addRecursive("209","818"));
		//high close
		assertEquals("130094",testObject.addRecursive("00000000000082598","000047496"));
		assertEquals("130094",testObject.addRecursive("82598","47496"));
		assertEquals("125478",testObject.addRecursive("64662","60816"));
		assertEquals("125645",testObject.addRecursive("41635","84010"));
		assertEquals("45049",testObject.addRecursive("5939","39110"));
		assertEquals("36226",testObject.addRecursive("-4204","40430"));
		//wildly different
		assertEquals("55103",testObject.addRecursive("24882","30221"));
		assertEquals("55398",testObject.addRecursive("28473","26925"));
		assertEquals("168838",testObject.addRecursive("70253","98585"));
		assertEquals("58353",testObject.addRecursive("35670","22683"));
		assertEquals("49149",testObject.addRecursive("17431","31718"));
		//negatives (hard)
		assertEquals("-141070",testObject.addRecursive("-87036","-54034"));
		assertEquals("-70310",testObject.addRecursive("-60955","-9355"));
		assertEquals("-34729",testObject.addRecursive("-44594","9865"));
		assertEquals("-49312",testObject.addRecursive("-21787","-27525"));
		assertEquals("-169774",testObject.addRecursive("-73696","-96078"));

		assertEquals("3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.addRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.addRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.addRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.addRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));

		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				String expected = a.add(b).toString();
				String actual = testObject.addRecursive(a.toString(), b.toString());
				assertEquals(actual, expected, a+"\n+\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

			}
		}
	}
	
	@Test @Timeout(4000)
	void testSubtractRecursive() {
		//equal
		assertEquals("0",testObject.subtractRecursive("959","959"));
		assertEquals("0",testObject.subtractRecursive("2378","2378"));
		assertEquals("0",testObject.subtractRecursive("8648","8648"));
		assertEquals("0",testObject.subtractRecursive("5714","5714"));
		assertEquals("0",testObject.subtractRecursive("6282","6282"));
		//low close
		assertEquals("812",testObject.subtractRecursive("882","70"));
		assertEquals("486",testObject.subtractRecursive("655","169"));
		assertEquals("-567",testObject.subtractRecursive("343","910"));
		assertEquals("-633",testObject.subtractRecursive("174","807"));
		assertEquals("757",testObject.subtractRecursive("923","166"));
		//high close
		assertEquals("-18890",testObject.subtractRecursive("00000000045821","000064711"));
		assertEquals("-64711",testObject.subtractRecursive("000000000","00000000000000000064711"));
		
		assertEquals("-18890",testObject.subtractRecursive("45821","64711"));
		assertEquals("-55680",testObject.subtractRecursive("19881","75561"));
		assertEquals("46485",testObject.subtractRecursive("49504","3019"));
		assertEquals("12982",testObject.subtractRecursive("36785","23803"));
		assertEquals("42951",testObject.subtractRecursive("33323","-9628"));
		//wildly different
		assertEquals("-53091",testObject.subtractRecursive("40120","93211"));
		assertEquals("38731",testObject.subtractRecursive("67007","28276"));
		assertEquals("-1912",testObject.subtractRecursive("65639","67551"));
		assertEquals("27032",testObject.subtractRecursive("60399","33367"));
		assertEquals("20123",testObject.subtractRecursive("90968","70845"));
		//negatives (hard)
		assertEquals("38414",testObject.subtractRecursive("-33686","-72100"));
		assertEquals("-49404",testObject.subtractRecursive("-40611","8793"));
		assertEquals("45327",testObject.subtractRecursive("-19992","-65319"));
		assertEquals("89015",testObject.subtractRecursive("2435","-86580"));
		assertEquals("188",testObject.subtractRecursive("-25627","-25815"));

		assertEquals("3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.subtractRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.subtractRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.subtractRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.subtractRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));

		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				String expected = a.subtract(b).toString();
				String actual = testObject.subtractRecursive(a.toString(), b.toString());
				assertEquals(actual, expected, a+"\n-\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

			}
		}
	}

	@Test @Timeout(4000)
	void testMultiplyRecursive() {
		//equal
		assertEquals("2030625",testObject.multiplyRecursive("1425","1425"));
		assertEquals("38266596",testObject.multiplyRecursive("6186","6186"));
		assertEquals("3748096",testObject.multiplyRecursive("1936","1936"));
		assertEquals("4977361",testObject.multiplyRecursive("2231","2231"));
		assertEquals("9369721",testObject.multiplyRecursive("3061","3061"));
		//low close
		assertEquals("513810",testObject.multiplyRecursive("519","990"));
		assertEquals("755505",testObject.multiplyRecursive("927","815"));
		assertEquals("15147",testObject.multiplyRecursive("99","153"));
		assertEquals("21384",testObject.multiplyRecursive("44","486"));
		assertEquals("541140",testObject.multiplyRecursive("933","580"));
		//high close
		assertEquals("179805052",testObject.multiplyRecursive("32597","5516"));
		assertEquals("-575902146",testObject.multiplyRecursive("-00000000000000000000006717","0000000085738"));
		assertEquals("-575902146",testObject.multiplyRecursive("-6717","85738"));
		assertEquals("2086736180",testObject.multiplyRecursive("41165","50692"));
		assertEquals("5448387522",testObject.multiplyRecursive("56649","96178"));
		assertEquals("-50689842",testObject.multiplyRecursive("23709","-2138"));
		//wildly different
		assertEquals("3079953791",testObject.multiplyRecursive("95393","32287"));
		assertEquals("8105815575",testObject.multiplyRecursive("85735","94545"));
		assertEquals("25430544",testObject.multiplyRecursive("85914","296"));
		assertEquals("2128763377",testObject.multiplyRecursive("35087","60671"));
		assertEquals("666492384",testObject.multiplyRecursive("18444","36136"));
		//negatives (hard)
		assertEquals("2200952668",testObject.multiplyRecursive("-36812","-59789"));
		assertEquals("243967088",testObject.multiplyRecursive("-7984","-30557"));
		assertEquals("1326082434",testObject.multiplyRecursive("-54858","-24173"));
		assertEquals("2897653824",testObject.multiplyRecursive("-56544","-51246"));
		assertEquals("686308819",testObject.multiplyRecursive("-49997","-13727"));

		assertEquals("31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiplyRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiplyRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiplyRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiplyRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		
		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				String expected = a.multiply(b).toString();
				String actual = testObject.multiplyRecursive(a.toString(), b.toString());
				assertEquals(actual, expected, a+"\n*\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

			}
		}
	}

	@Test @Timeout(4000)
	void testDivideRecursive() {
		//equal
		assertEquals("280",testObject.divideRecursive("1400","5"));
		assertEquals("1",testObject.divideRecursive("5039","5039"));
		assertEquals("1",testObject.divideRecursive("5169","5169"));
		assertEquals("1",testObject.divideRecursive("3108","3108"));
		assertEquals("1",testObject.divideRecursive("9765","9765"));
		assertEquals("1",testObject.divideRecursive("3128","3128"));
		//low close
		assertEquals("5001",testObject.divideRecursive("175035","35"));
		assertEquals("138",testObject.divideRecursive("9700","70"));
		assertEquals("147",testObject.divideRecursive("8400","57"));
		assertEquals("19",testObject.divideRecursive("1900","100"));
		assertEquals("208",testObject.divideRecursive("4800","23"));
		assertEquals("103",testObject.divideRecursive("6200","60"));
		//high close
		assertEquals("6",testObject.divideRecursive("531100","88228"));
		assertEquals("-1063",testObject.divideRecursive("7647600","-7193"));
		assertEquals("129",testObject.divideRecursive("9104600","70178"));
		assertEquals("426",testObject.divideRecursive("7993300","18734"));
		assertEquals("30",testObject.divideRecursive("2379300","76826"));
		//wildly different
		assertEquals("31",testObject.divideRecursive("1270700","40238"));
		assertEquals("2045",testObject.divideRecursive("7196800","3519"));
		assertEquals("302",testObject.divideRecursive("9710000","32053"));
		assertEquals("284",testObject.divideRecursive("5998100","21083"));
		assertEquals("34",testObject.divideRecursive("1295300","37217"));
		//negatives (hard)
		assertEquals("100",testObject.divideRecursive("-6270500","-62384"));
		assertEquals("467",testObject.divideRecursive("-9610800","-20559"));
		assertEquals("82",testObject.divideRecursive("-4107400","-49830"));
		assertEquals("110",testObject.divideRecursive("-8717600","-78673"));
		assertEquals("459",testObject.divideRecursive("-4857600","-10583"));

		assertEquals("448074759136198703302898106",testObject.divideRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-448074759136198703302898106",testObject.divideRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-448074759136198703302898106",testObject.divideRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("448074759136198703302898106",testObject.divideRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		
		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				if(!b.equals(new BigInteger("0"))) {
					String expected = a.divide(b).toString();
					String actual = testObject.divideRecursive(a.toString(), b.toString());
					assertEquals(actual, expected, a+"\n/\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

				}
			}
		}
	}

	@Test @Timeout(4000)
	void testRemainderRecursive() {
		//equal
		assertEquals("0",testObject.remainderRecursive("3199","3199"));
		assertEquals("0",testObject.remainderRecursive("5109","5109"));
		assertEquals("0",testObject.remainderRecursive("3699","3699"));
		assertEquals("0",testObject.remainderRecursive("5084","5084"));
		assertEquals("0",testObject.remainderRecursive("8050","8050"));
		//low close
		assertEquals("53",testObject.remainderRecursive("7400","93"));
		assertEquals("0",testObject.remainderRecursive("1400","5"));
		assertEquals("5",testObject.remainderRecursive("4500","31"));
		assertEquals("30",testObject.remainderRecursive("8200","38"));
		assertEquals("64",testObject.remainderRecursive("4600","72"));
		//high close
		assertEquals("-76",testObject.remainderRecursive("-125900","31456"));
		assertEquals("3654",testObject.remainderRecursive("5678400","79926"));
		assertEquals("34359",testObject.remainderRecursive("4044900","36131"));
		assertEquals("22224",testObject.remainderRecursive("5933600","57392"));
		assertEquals("24596",testObject.remainderRecursive("6965700","24968"));
		//wildly different
		assertEquals("15452",testObject.remainderRecursive("7737500","34784"));
		assertEquals("39933",testObject.remainderRecursive("7682100","87841"));
		assertEquals("89872",testObject.remainderRecursive("4085600","90812"));
		assertEquals("4028",testObject.remainderRecursive("902300","12476"));
		assertEquals("62760",testObject.remainderRecursive("8053200","66587"));
		//negatives (hard)
		assertEquals("-85478",testObject.remainderRecursive("-384200","-99574"));
		assertEquals("-18925",testObject.remainderRecursive("-9691400","-22975"));
		assertEquals("-1960",testObject.remainderRecursive("-3221800","-2795"));
		assertEquals("50810",testObject.remainderRecursive("435500","-64115"));
		assertEquals("-2059",testObject.remainderRecursive("-7513900","-49097"));

		assertEquals("2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainderRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainderRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainderRecursive("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainderRecursive("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		
		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				if(!b.equals(new BigInteger("0"))) {
					String expected = a.remainder(b).toString();
					String actual = testObject.remainderRecursive(a.toString(), b.toString());
					assertEquals(actual, expected, a+"\n%\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);
				}
			}
		}
	}
}
