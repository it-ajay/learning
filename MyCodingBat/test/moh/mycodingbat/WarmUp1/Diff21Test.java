package moh.mycodingbat.WarmUp1;

//
//Given an int n, return the absolute difference between n and 21, 
//except return double the absolute difference if n is over 21. 
//
//diff21(19) → 2
//diff21(10) → 11
//diff21(21) → 0

public class Diff21Test {
private int count=0;
private int error=0;
private Diff21 d=null;

Diff21Test(){
	d=new Diff21();
	testcases();
}
public static void main(String[] args){
	Diff21Test dt = new Diff21Test();
}

void testcases(){
	test(19,2);
	test(10,11);
	test(21,0);
	test(41,40);
	test(41,21);
	System.out.println("Passed Count:"+count+", Error:"+error);
}
void test(int n, int expected){
	int actual =0;
	try {
		actual=d.diff21(n);
	} catch (Exception e) {
		e.printStackTrace();
		error++;
		System.out.println("Error... n:"+n+", expected:"+expected);
	}
	if(actual!=expected){
		error++;
		System.out.println("Error... n:"+n+", expected:"+expected+", Actual:"+actual);
	}else{
		count++;
	}
}
}
