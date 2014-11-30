package moh.mycodingbat.WarmUp2;


//Given a string and a non-negative int n, 
//return a larger string that is n copies of the original string. 
//
//stringTimes("Hi", 2) → "HiHi"
//stringTimes("Hi", 3) → "HiHiHi"
//stringTimes("Hi", 1) → "Hi"

public class StringTimesTest {
	private int count = 0;
	private int error = 0;
	private StringTimes s = null;

	StringTimesTest() {
		s = new StringTimes();
		testcases();
	}

	public static void main(String[] args) {
		StringTimesTest st = new StringTimesTest();
	}

	void testcases() {
		test("Hi", 2,  "HiHi");
		test("Hi", 3, "HiHiHi");
		test("Hi", 1, "Hi");
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(String a, int b, String expected) {
		String actual = "";
		try {
			actual = s.stringTimes(a, b);
		} catch (Exception e) {
			e.printStackTrace();
			error++;
			System.out.println("Error... a:"+a+", b:"+b+", expected:"+expected);
		}
		if (!actual.equals(expected)) {
			error++;
			System.out.println("Error... a:"+a+", b:"+b+", expected:"+expected+", Actual:"+actual);
		} else {
			count++;
		}

	}
}
