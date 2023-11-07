package com.bracket.service;

import java.util.Stack;

public class BracketCheckServiceImpl implements BracketCheckService {
	 public boolean isBalanced(String input) {
	        Stack<Character> stack = new Stack<>();

	        for (char bracket : input.toCharArray()) {
	            if (bracket == '(' || bracket == '{' || bracket == '[') {
	                stack.push(bracket);
	            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
	                if (stack.isEmpty() || !isMatchingPair(stack.peek(), bracket)) {
	                    return false;
	                }
	                stack.pop();
	            }
	        }

	        return stack.isEmpty();
	    }

	    public boolean isMatchingPair(char opening, char closing) {
	        return (opening == '(' && closing == ')') ||
	               (opening == '{' && closing == '}') ||
	               (opening == '[' && closing == ']');
	    }

}
