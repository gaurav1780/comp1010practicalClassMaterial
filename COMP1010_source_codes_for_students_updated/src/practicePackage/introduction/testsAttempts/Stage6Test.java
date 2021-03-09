package practicePackage.introduction.testsAttempts;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import practicePackage.introduction.attempts.Stage6;

public class Stage6Test {
	protected Stage6 testObject;

	@BeforeEach
	public void run() {
		testObject = new Stage6();
	}

	public static int randInt(int max, int min) {
		return ((int) (Math.random()*(max - min))) + min;
	}

	@Test @Timeout(4000)
	void testAdd() {
		//equal
		assertEquals("5592",testObject.add("00000000000000000000002796","00002796"));
		assertEquals("5592",testObject.add("2796","2796"));
		assertEquals("9284",testObject.add("4642","4642"));
		assertEquals("14680",testObject.add("7340","7340"));
		assertEquals("10186",testObject.add("5093","5093"));
		assertEquals("4108",testObject.add("2054","2054"));
		//low close
		assertEquals("290",testObject.add("263","27"));
		assertEquals("1349",testObject.add("379","970"));
		assertEquals("693",testObject.add("92","601"));
		assertEquals("838",testObject.add("834","4"));
		assertEquals("1027",testObject.add("209","818"));
		//high close
		assertEquals("130094",testObject.add("82598","47496"));
		assertEquals("125478",testObject.add("64662","60816"));
		assertEquals("125645",testObject.add("41635","84010"));
		assertEquals("45049",testObject.add("5939","39110"));
		assertEquals("36226",testObject.add("-4204","40430"));
		//wildly different
		assertEquals("55103",testObject.add("24882","30221"));
		assertEquals("55398",testObject.add("28473","26925"));
		assertEquals("168838",testObject.add("70253","98585"));
		assertEquals("58353",testObject.add("35670","22683"));
		assertEquals("49149",testObject.add("17431","31718"));
		//negatives (hard)
		assertEquals("-141070",testObject.add("-87036","-54034"));
		assertEquals("-70310",testObject.add("-60955","-9355"));
		assertEquals("-34729",testObject.add("-44594","9865"));
		assertEquals("-49312",testObject.add("-21787","-27525"));
		assertEquals("-169774",testObject.add("-73696","-96078"));

		assertEquals("3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.add("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.add("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.add("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.add("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));

		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				String expected = a.add(b).toString();
				String actual = testObject.add(a.toString(), b.toString());
				assertEquals(actual, expected, a+"\n+\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

			}
		}
	}
	
	@Test @Timeout(4000)
	void testSubtract() {
		//equal
		assertEquals("0",testObject.subtract("959","959"));
		assertEquals("0",testObject.subtract("2378","2378"));
		assertEquals("0",testObject.subtract("8648","8648"));
		assertEquals("0",testObject.subtract("5714","5714"));
		assertEquals("0",testObject.subtract("6282","6282"));
		//low close
		assertEquals("812",testObject.subtract("00000000000000882","000070"));
		assertEquals("812",testObject.subtract("882","70"));
		assertEquals("486",testObject.subtract("655","169"));
		assertEquals("-567",testObject.subtract("343","910"));
		assertEquals("-633",testObject.subtract("174","807"));
		assertEquals("757",testObject.subtract("923","166"));
		//high close
		assertEquals("-18890",testObject.subtract("45821","64711"));
		assertEquals("-55680",testObject.subtract("19881","75561"));
		assertEquals("46485",testObject.subtract("49504","3019"));
		assertEquals("12982",testObject.subtract("36785","23803"));
		assertEquals("42951",testObject.subtract("33323","-9628"));
		//wildly different
		assertEquals("-53091",testObject.subtract("40120","93211"));
		assertEquals("38731",testObject.subtract("67007","28276"));
		assertEquals("-1912",testObject.subtract("65639","67551"));
		assertEquals("27032",testObject.subtract("60399","33367"));
		assertEquals("20123",testObject.subtract("90968","70845"));
		//negatives (hard)
		assertEquals("38414",testObject.subtract("-33686","-72100"));
		assertEquals("-49404",testObject.subtract("-40611","8793"));
		assertEquals("45327",testObject.subtract("-19992","-65319"));
		assertEquals("89015",testObject.subtract("2435","-86580"));
		assertEquals("188",testObject.subtract("-25627","-25815"));

		assertEquals("3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.subtract("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.subtract("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("3765428673067053708746837688950610862116285623924234310569774088437558761694124345632139623530",testObject.subtract("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-3765428673067053708746837672143466088658970450487500099143642626804132586473397323880029888640",testObject.subtract("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));

		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				String expected = a.subtract(b).toString();
				String actual = testObject.subtract(a.toString(), b.toString());
				assertEquals(actual, expected, a+"\n-\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

			}
		}
	}

	@Test @Timeout(4000)
	void testMultiply() {
		//equal
		assertEquals("2030625",testObject.multiply("1425","1425"));
		assertEquals("38266596",testObject.multiply("6186","6186"));
		assertEquals("3748096",testObject.multiply("1936","1936"));
		assertEquals("4977361",testObject.multiply("2231","2231"));
		assertEquals("9369721",testObject.multiply("3061","3061"));
		//low close
		assertEquals("513810",testObject.multiply("000000000000519","0000990"));
		assertEquals("513810",testObject.multiply("519","990"));
		assertEquals("755505",testObject.multiply("927","815"));
		assertEquals("15147",testObject.multiply("99","153"));
		assertEquals("21384",testObject.multiply("44","486"));
		assertEquals("541140",testObject.multiply("933","580"));
		//high close
		assertEquals("179805052",testObject.multiply("32597","5516"));
		assertEquals("-575902146",testObject.multiply("-6717","85738"));
		assertEquals("2086736180",testObject.multiply("41165","50692"));
		assertEquals("5448387522",testObject.multiply("56649","96178"));
		assertEquals("-50689842",testObject.multiply("23709","-2138"));
		//wildly different
		assertEquals("3079953791",testObject.multiply("95393","32287"));
		assertEquals("8105815575",testObject.multiply("85735","94545"));
		assertEquals("25430544",testObject.multiply("85914","296"));
		assertEquals("2128763377",testObject.multiply("35087","60671"));
		assertEquals("666492384",testObject.multiply("18444","36136"));
		//negatives (hard)
		assertEquals("2200952668",testObject.multiply("-36812","-59789"));
		assertEquals("243967088",testObject.multiply("-7984","-30557"));
		assertEquals("1326082434",testObject.multiply("-54858","-24173"));
		assertEquals("2897653824",testObject.multiply("-56544","-51246"));
		assertEquals("686308819",testObject.multiply("-49997","-13727"));

		assertEquals("31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiply("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiply("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiply("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("31643052421182622643080994466257368727518999666441125198843789906834274253207361756659921683730490018463087827516524655644595249906327039895858838249229832152825",testObject.multiply("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		
		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				String expected = a.multiply(b).toString();
				String actual = testObject.multiply(a.toString(), b.toString());
				assertEquals(actual, expected, a+"\n*\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

			}
		}
	}

	@Test @Timeout(4000)
	void testDivide() {
		//equal
		assertEquals("280",testObject.divide("1400","5"));
		assertEquals("1",testObject.divide("5039","5039"));
		assertEquals("1",testObject.divide("5169","5169"));
		assertEquals("1",testObject.divide("3108","3108"));
		assertEquals("1",testObject.divide("9765","9765"));
		assertEquals("1",testObject.divide("3128","3128"));
		//low close
		assertEquals("5001",testObject.divide("175035","35"));
		assertEquals("138",testObject.divide("9700","70"));
		assertEquals("147",testObject.divide("8400","57"));
		assertEquals("19",testObject.divide("1900","100"));
		assertEquals("208",testObject.divide("4800","23"));
		assertEquals("103",testObject.divide("6200","60"));
		//high close
		assertEquals("6",testObject.divide("000000000000000531100","00088228"));
		assertEquals("6",testObject.divide("531100","88228"));
		assertEquals("-1063",testObject.divide("7647600","-7193"));
		assertEquals("129",testObject.divide("9104600","70178"));
		assertEquals("426",testObject.divide("7993300","18734"));
		assertEquals("30",testObject.divide("2379300","76826"));
		//wildly different
		assertEquals("31",testObject.divide("1270700","40238"));
		assertEquals("2045",testObject.divide("7196800","3519"));
		assertEquals("302",testObject.divide("9710000","32053"));
		assertEquals("284",testObject.divide("5998100","21083"));
		assertEquals("34",testObject.divide("1295300","37217"));
		//negatives (hard)
		assertEquals("100",testObject.divide("-6270500","-62384"));
		assertEquals("467",testObject.divide("-9610800","-20559"));
		assertEquals("82",testObject.divide("-4107400","-49830"));
		assertEquals("110",testObject.divide("-8717600","-78673"));
		assertEquals("459",testObject.divide("-4857600","-10583"));

		assertEquals("448074759136198703302898106",testObject.divide("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-448074759136198703302898106",testObject.divide("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-448074759136198703302898106",testObject.divide("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("448074759136198703302898106",testObject.divide("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		
		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				if(!b.equals(new BigInteger("0"))) {
					String expected = a.divide(b).toString();
					String actual = testObject.divide(a.toString(), b.toString());
					assertEquals(actual, expected, a+"\n/\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);

				}
			}
		}
	}

	@Test @Timeout(4000)
	void testRemainder() {
		//equal
		assertEquals("0",testObject.remainder("3199","3199"));
		assertEquals("0",testObject.remainder("5109","5109"));
		assertEquals("0",testObject.remainder("3699","3699"));
		assertEquals("0",testObject.remainder("5084","5084"));
		assertEquals("0",testObject.remainder("8050","8050"));
		//low close
		assertEquals("53",testObject.remainder("0000000000007400","000093"));
		assertEquals("53",testObject.remainder("7400","93"));
		assertEquals("0",testObject.remainder("1400","5"));
		assertEquals("5",testObject.remainder("4500","31"));
		assertEquals("30",testObject.remainder("8200","38"));
		assertEquals("64",testObject.remainder("4600","72"));
		//high close
		assertEquals("-76",testObject.remainder("-125900","31456"));
		assertEquals("3654",testObject.remainder("5678400","79926"));
		assertEquals("34359",testObject.remainder("4044900","36131"));
		assertEquals("22224",testObject.remainder("5933600","57392"));
		assertEquals("24596",testObject.remainder("6965700","24968"));
		//wildly different
		assertEquals("15452",testObject.remainder("7737500","34784"));
		assertEquals("39933",testObject.remainder("7682100","87841"));
		assertEquals("89872",testObject.remainder("4085600","90812"));
		assertEquals("4028",testObject.remainder("902300","12476"));
		assertEquals("62760",testObject.remainder("8053200","66587"));
		//negatives (hard)
		assertEquals("-85478",testObject.remainder("-384200","-99574"));
		assertEquals("-18925",testObject.remainder("-9691400","-22975"));
		assertEquals("-1960",testObject.remainder("-3221800","-2795"));
		assertEquals("50810",testObject.remainder("435500","-64115"));
		assertEquals("-2059",testObject.remainder("-7513900","-49097"));

		assertEquals("2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainder("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainder("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainder("3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		assertEquals("-2964967479885262852878534846244981087097214113210047490819913196915",testObject.remainder("-3765428673067053708746837680547038475387628037205867204856708357620845674083760834756084756085","-8403572386728657586718367105713065730816713087610363510876054867445"));
		
		for(int i=0; i < 100; i++) {
			BigInteger a = new BigInteger(testObject.getRandomInteger(1,100));
			for(int k=0; k < 100; k++) {
				BigInteger b = new BigInteger(testObject.getRandomInteger(1,100));
				if(!b.equals(new BigInteger("0"))) {
					String expected = a.remainder(b).toString();
					String actual = testObject.remainder(a.toString(), b.toString());
					assertEquals(actual, expected, a+"\n%\n"+b+"\nexpected to be\n"+expected+"\nbut was\n"+actual);
				}
			}
		}
	}

}
