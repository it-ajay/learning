package moh.mycodingbat.WarmUp1;

//Unless the two values are the same, then return double their sum. 
//
//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8

public class SumDoubleTest {
	private int count = 0;
	private int error = 0;
	private SumDouble s = null;

	SumDoubleTest() {
		s = new SumDouble();
		testcases();
	}

	public static void main(String[] args) {
		SumDoubleTest st = new SumDoubleTest();
	}

	void testcases() {
		test(1, 2, 3);
		test(3, 2, 5);
		test(2, 2, 8);
		test(1, 2, 6);
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(int a, int b, int expected) {
		int actual = 0;
		try {
			actual = s.sumDouble(a, b);
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
