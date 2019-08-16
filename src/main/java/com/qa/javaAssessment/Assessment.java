package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		
		
		
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		//Passes tests, but FIX THIS!!!!!!!!
		int diff1 = 0;
		int diff2 = 0;
		
		if (a > b && a < c){
			diff1 = a - b;
			diff2 = c - a;
		}
		if (a>c && a<b) {
			diff1 = a - c;
			diff2 = b - a;
		}
		if (b > a && b < c) {
			diff1 = b - a;
			diff2 = c - b;
		}
		if (c > a && c < b) {
			diff1 = c - a;
			diff2 = b - c;
		}
		
		int diff3 = diff1 - diff2;
		
		if (diff3 == 0) {
			return true;
		}
		else {
		
		return false;}
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		
		int len = input.length();
		int midPoint = len/2;
		int mid2 = midPoint - a/2;
	
			//for (int i=mid2; i<input.length(); i++) {
			
				
				
			//}
		System.out.println(midPoint);
		return "";
	}
	


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		
		int ams = 0;
		//=0; i<arg1.length(); i++
			for (int i = 0; i<arg1.length(); i++ ) {
				if (arg1.substring(i,i+1).equals("a") && arg1.substring(i+1,i+2).equals("m") ){
					ams += 1;
					return ams;
				}
				if (arg1.substring(i,i+1).equals(" ") && arg1.substring(i+1,i+2).equals("a") && arg1.substring(i+2,i+3).equals("m") ){
					ams += 1;
					return ams;
				}
				
				if (arg1.substring(i,i+1).equals("a") && arg1.substring(i+1,i+2).equals("m") && arg1.substring(i+2,i+3).equals(" ") ){
					ams += 1;
					return ams;
				}
				if (arg1.substring(i,i+1).equals(" ") && arg1.substring(i+1,i+2).equals("a") && arg1.substring(i+2,i+3).equals("m") && arg1.substring(i+3,i+4).equals(" ") ){
					ams += 1;
					return ams;
				}
					
				}
			

		return ams;
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		if(arg1 % 3 == 0 && arg1 % 5 == 0) {
			return "fizzbuzz";
		}
		else if	(arg1 % 3 == 0) {
			return "fizz";
		}
		else if(arg1 % 5 == 0) {
			return "buzz";
		}
		
		return null;
		}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		
		
		
		return -1;
	}
}
