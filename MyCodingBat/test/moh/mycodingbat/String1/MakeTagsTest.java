package moh.mycodingbat.String1;

//The web is built with HTML strings like "<i>Yay</i>" 
//which draws Yay as italic text. In this example, the "i" tag 
//makes <i> and </i> which surround the word "Yay". 
//Given tag and word strings, create the HTML string with 
//tags around the word, e.g. "<i>Yay</i>". 
//
//makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"

public class MakeTagsTest {
	private int count = 0;
	private int error = 0;
	private MakeTags s = null;

	MakeTagsTest() {
		s = new MakeTags();
		testcases();
	}

	public static void main(String[] args) {
		MakeTagsTest st = new MakeTagsTest();
	}

	void testcases() {
		test("i", "Yay",  "<i>Yay</i>");
		test("i", "Hello", "<i>Hello</i>");
		test("cite", "Yay", "<cite>Yay</cite>");
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(String a, String b, String expected) {
		String actual = "";
		try {
			actual = s.makeTags(a, b);
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
