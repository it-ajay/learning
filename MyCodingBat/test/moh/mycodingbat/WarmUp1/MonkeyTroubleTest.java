package moh.mycodingbat.WarmUp1;

//We have two monkeys, a and b, and the parameters 
//aSmile and bSmile indicate if each is smiling. 
//We are in trouble if they are both smiling 
//or if neither of them is smiling. 
//Return true if we are in trouble. 
//
//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false

public class MonkeyTroubleTest {

	private int count = 0;
	private int error = 0;
	MonkeyTrouble m = null;

	MonkeyTroubleTest() {
		m = new MonkeyTrouble();
		testcases();
	}

	public static void main(String[] args) {
		MonkeyTroubleTest mt = new MonkeyTroubleTest();
	}

	void testcases() {
		test(true, true, false);
		test(true, true, true);
		test(true, false, false);
		test(false, true, false);
		test(false, false, true);
		System.out.println("Passed Count:" + count + ", Errors:" + error);
	}

	void test(boolean aSmile, boolean bSmile, boolean expected) {
		boolean actual = false;
		try {
			actual = m.monkeyTrouble(aSmile, bSmile);
			System.out.println("Called monkeyTrouble");
		} catch (Exception e) {
			e.printStackTrace();
			error++;
			System.out.println("Error... aSmile:"+aSmile+", bSmile:"+bSmile+", expected:"+expected);
		}
		if (actual != expected) {
			error++;
			System.out.println("Error... aSmile:"+aSmile+", bSmile:"+bSmile+", expected:"+expected+", Actual:"+actual);
		}else{
			count++;
		}
	}
}
