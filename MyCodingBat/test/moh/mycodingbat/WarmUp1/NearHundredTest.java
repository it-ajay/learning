package moh.mycodingbat.WarmUp1;

//Given an int n, return true if it is within 10 of 100 or 200. 
//Note: Math.abs(num) computes the absolute value of a number. 
//
//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false


public class NearHundredTest {
	private int count = 0;
	private int error = 0;
	private NearHundred s = null;

	NearHundredTest() {
		s = new NearHundred();
		testcases();
	}

	public static void main(String[] args) {
		NearHundredTest st = new NearHundredTest();
	}

	void testcases() {
		test(93,  true);
		test(90, true);
		test(209, true);
		test(89, false);
		test(211, false);
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(int a, boolean expected) {
		boolean actual = false;
		try {
			actual = s.nearHundred(a);
		} catch (Exception e) {
			e.printStackTrace();
			error++;
			System.out.println("Error... a:"+a+", expected:"+expected);
		}
		if (actual != expected) {
			error++;
			System.out.println("Error... a:"+a+", expected:"+expected+", Actual:"+actual);
		} else {
			count++;
		}

	}
}
