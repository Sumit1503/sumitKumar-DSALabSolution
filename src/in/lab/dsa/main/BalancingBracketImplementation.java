package in.lab.dsa.main;

import in.lab.dsa.services.BalancingBracket;

public class BalancingBracketImplementation {
	
	public static void main(String[] args) {
		
		// hard-coding the inputs to be checked
		String str ="{[()()]}";
		String str1 ="([[{}]]))";
		String str2 ="([[{}]])";
		
		// creating the object of service class BalancingBracket
		BalancingBracket bb = new BalancingBracket();
		
		// checking the status of aforementioned strings vis- str, str1, str2
		bb.checkStatus(str);
		bb.checkStatus(str1);
		bb.checkStatus(str2);
	}

}
