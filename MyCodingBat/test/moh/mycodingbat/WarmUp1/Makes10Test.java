package moh.mycodingbat.WarmUp1;

//Given 2 ints, a and b, 
//return true if one if them is 10 or if their sum is 10. 
//
//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true


public class Makes10Test {
	private int count = 0;
	private int error = 0;
	private Makes10 s = null;

	Makes10Test() {
		s = new Makes10();
		testcases();
	}

	public static void main(String[] args) {
		Makes10Test st = new Makes10Test();
	}

	void testcases() {
		test(10, 2, true);
		test(3, 10, true);
		test(4, 6, true);
		test(3, 6, false);
		test(3, 6, true);
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(int a, int b, boolean expected) {
		boolean actual = false;
		try {
			actual = s.makes10(a, b);
		} catch (Exception e) {
			e.printStackTrace();
			error++;
			System.out.println("Error... a:"+a+", b:"+b+", expected:"+expected);
		}
		if (actual != expected) {
			error++;
			System.out.println("Error... a:"+a+", b:"+b+", expected:"+expected+", Actual:"+actual);
		} else {
			count++;
		}

	}
}
