package moh.mycodingbat.WarmUp1;


public class SleepInTest {
//	The parameter weekday is true if it is a weekday, 
//	and the parameter vacation is true if we are on vacation. 
//	We sleep in if it is not a weekday or we're on vacation. 
//	Return true if we sleep in. 
//
//	sleepIn(false, false) → true
//	sleepIn(true, false) → false
//	sleepIn(false, true) → true
	
	private int count =0;
	private int errors =0;
	SleepIn w = null;
	
	
	SleepInTest(){
		w = new SleepIn();
		testCases();
	}
	
	public static void main(String[] args) {
		SleepInTest a = new SleepInTest();
	}

	
	void testCases(){
		test(false, false, true);
		test(true, false, false);
		test(false, true, true);
		test(true, true, true);
		System.out.println("Passed Count:" + count + ", Errors:" + errors);
	}

	void test(boolean weekday, boolean vacation, boolean expected){
		boolean actual = false;
		try {
			actual = w.sleepIn(weekday, vacation);
		} catch (Exception e) {
			System.out.println("Error: " + e + ", weekday: " + weekday + ", vacation: " + vacation + ", expected: " + expected);
			e.printStackTrace();
			errors++;
		}

		if (actual != expected) {
			System.out.println("For expected: " + expected + ", weekday: " + weekday + ", vacation: " + vacation + ", actual: " + actual);
			errors++;
		}
		count++;
	}

}