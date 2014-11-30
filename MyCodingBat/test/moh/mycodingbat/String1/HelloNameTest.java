package moh.mycodingbat.String1;


//Given a string name, e.g. "Bob", 
//return a greeting of the form "Hello Bob!". 
//
//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"

public class HelloNameTest {

	private int count = 0;
	private int error = 0;
	private HelloName s = null;

	HelloNameTest() {
		s = new HelloName();
		testcases();
	}

	public static void main(String[] args) {
		HelloNameTest st = new HelloNameTest();
	}

	void testcases() {
		test("Bob",  "Hello Bob!");
		test("Alice", "Hello Alice!");
		test("X", "Hello X!");
		test("Vicky", "Hello Vicky");
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(String name, String expected) {
		String actual = "";
		try {
			actual = s.helloName(name);
		} catch (Exception e) {
			e.printStackTrace();
			error++;
			System.out.println("Error... name:"+name+", expected:"+expected);
		}
		if (!actual.equals(expected)) {
			error++;
			System.out.println("Error... name:"+name+", expected:"+expected+", Actual:"+actual);
		} else {
			count++;
		}

	}
}
