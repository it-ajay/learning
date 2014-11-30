package moh.mycodingbat.WarmUp2;

//Given a string and a non-negative int n, 
//we'll say that the front of the string is the first 3 chars, 
//or whatever is there if the string is less than length 3. 
//Return n copies of the front; 
//
//frontTimes("Chocolate", 2) → "ChoCho"
//frontTimes("Chocolate", 3) → "ChoChoCho"
//frontTimes("Abc", 3) → "AbcAbcAbc"

public class FrontTimesTest {
	private int count = 0;
	private int error = 0;
	private FrontTimes s = null;

	FrontTimesTest() {
		s = new FrontTimes();
		testcases();
	}

	public static void main(String[] args) {
		FrontTimesTest st = new FrontTimesTest();
	}

	void testcases() {
		test("Chocolate", 2,  "ChoCho");
		test("Chocolate", 3, "ChoChoCho");
		test("Abc", 3, "AbcAbcAbc");
		test("Up", 5, "UpUpUpUpUp");
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(String a, int b, String expected) {
		String actual = "";
		try {
			actual = s.frontTimes(a, b);
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
