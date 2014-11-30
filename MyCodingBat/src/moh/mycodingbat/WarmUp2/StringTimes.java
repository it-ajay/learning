package moh.mycodingbat.WarmUp2;

//Given a string and a non-negative int n, 
//return a larger string that is n copies of the original string. 
//
//stringTimes("Hi", 2) StringTimes→ "HiHi"
//stringTimes("Hi", 3) → "HiHiHi"
//stringTimes("Hi", 1) → "Hi"


public class StringTimes {

	public String stringTimes(String str, int n) {
		String out = "";
		for(int i=0; i<n; i++){
			out+=str;
		}
		return out;
	}

}
