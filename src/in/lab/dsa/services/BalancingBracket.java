package in.lab.dsa.services;

import java.util.Stack;

public class BalancingBracket {

	// checks whether string has balancing bracket or not
	public boolean checkBalancingBracket(String str) {

		Stack<Character> stack = new Stack<Character>();
		boolean flag = false;


		for(int i = 0; i<str.length();i++) {
			char nextChar = str.charAt(i);

			if(nextChar =='[' || nextChar == '{' || nextChar =='(')	//if nextChar is open bracket push to stack
			{
				stack.push(nextChar);
			}else if(!stack.isEmpty())				// if nextChar is closing bracket, check whether the top of stack- 
			{										//is corresponding opening bracket or not
				if(nextChar == ']' )
				{
					if(stack.peek() == '[')
					{
						stack.pop();
						flag = true;
					}
					else
						flag = false;				
				}else if(nextChar == '}' )
				{
					if(stack.peek() == '{')
					{
						stack.pop();
						flag = true;
					}
					else 
						flag = false;
				}else if(nextChar == ')' )
				{
					if(stack.peek() == '(') 
					{
						stack.pop();
						flag = true;
					}else 
						flag = false;				
				}
			}else if(stack.isEmpty() && i<str.length()) 
			{
				flag = false;	
			}
		}
		return flag;
	}
	
	
	// this method calls the checkBalancingBracket method
	public void checkStatus(String str) {
		
		if(checkBalancingBracket(str))
		{
			System.out.println(str + " - contains Balanced Brackets");
		}else
		{
			System.out.println(str + " - does not contain Balanced Brackets");
		}
	}
}
