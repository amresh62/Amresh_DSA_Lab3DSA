package com.gl.bb.services;

import java.util.Stack;

public class CheckBalancing {
	
	public Boolean Balance(String input)
	{
			
		Stack<Character> inputStack=new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			char _c=input.charAt(i);
			
			if(_c=='(' ||_c=='{'||_c=='[')
			{
				inputStack.push(_c);
				continue;
			}
			
			if(inputStack.isEmpty())
				return false;
			
			char c;
			switch(input.charAt(i))
			{
			case '}':
				
				c=inputStack.pop();
				if(c=='(' || c=='[')
					return false;
				break;
			case ']':
				
				c=inputStack.pop();
				if(c=='(' || c=='{')
					return false;
				break;
			case ')':
	
				c=inputStack.pop();
				if(c=='}' || c=='[')
					return false;
				break;
			}
			
		}
		return inputStack.isEmpty();
	}

}
