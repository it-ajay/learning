package moh.mycodingbat.String1;

//Given two strings, a and b, return the result of putting them 
//together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 
//
//makeAbba("Hi", "Bye") → "HiByeByeHi"
//makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//makeAbba("What", "Up") → "WhatUpUpWhat"

public class MakeAbbaTest {

	private int count = 0;
	private int error = 0;
	private MakeAbba s = null;

	MakeAbbaTest() {
		s = new MakeAbba();
		testcases();
	}

	public static void main(String[] args) {
		MakeAbbaTest st = new MakeAbbaTest();
	}

	void testcases() {
		test("Hi", "Bye",  "HiByeByeHi");
		test("Yo", "Alice", "YoAliceAliceYo");
		test("What", "Up", "WhatUpUpWhat");
		test("Vicky", "Hello", "VickyHelloHelloVicky");
		System.out.println("Passed count:" + count + ", Errors:" + error);
	}

	void test(String a, String b, String expected) {
		String actual = "";
		try {
			actual = s.makeAbba(a, b);
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
