package moh.mycodingbat.WarmUp1;

//Given two int values, return their sum. 
//Unless the two values are the same, then return double their sum. 
//
//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8

public class SumDouble {
	public int sumDouble(int a, int b) {
		int sum = a+b;
		  if(a!=b){
			  return sum;
		  }else{
			  return sum*2;
		  }
	}
}
