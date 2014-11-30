package moh.mycodingbat.WarmUp1;

//We have a loud talking parrot. The "hour" parameter 
//is the current hour time in the range 0..23. 
//We are in trouble if the parrot is talking and 
//the hour is before 7 or after 20. Return true if we are in trouble. 
//
//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
//parrotTrouble(false, 6) → false

public class ParrotTroubleTest {

	private int count = 0;
	private int error = 0;
	ParrotTrouble m = null;

	ParrotTroubleTest() {
		m = new ParrotTrouble();
		testcases();
	}

	public static void main(String[] args) {
		ParrotTroubleTest mt = new ParrotTroubleTest();
	}

	void testcases() {
		test(true, 6, false);
		test(true, 6, true);
		test(true, 7, false);
		test(false, 6, false);
		test(false, 8, true);
		test(true, 18, false);
		test(true, 22, true);
		System.out.println("Passed Count:" + count + ", Errors:" + error);
	}

	void test(boolean talking, int hour, boolean expected) {
		boolean actual = false;
		try {
			actual = m.parrotTrouble(talking, hour);
		} catch (Exception e) {
			e.printStackTrace();
			error++;
			System.out.println("Error... talking:"+talking+", hour:"+hour+", expected:"+expected);
		}
		if (actual != expected) {
			error++;
			System.out.println("Error... talking:"+talking+", hour:"+hour+", expected:"+expected+", Actual:"+actual);
		}else{
			count++;
		}
	}
}
