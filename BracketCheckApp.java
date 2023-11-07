package com.bracket.app;

import com.bracket.service.BracketCheckService;
import com.bracket.service.BracketCheckServiceImpl;

public class BracketCheckApp {
	static BracketCheckService bracketCheck=new BracketCheckServiceImpl();

	 public static void main(String[] args) {
	        String input = "({[(){}]})"; // Hardcoded input
	        if (bracketCheck.isBalanced(input)) {
	            System.out.println("The string '" + input + "' is Balanced.");
	        } else {
	            System.out.println("The string '" + input + "' is Unbalanced.");
	        }
	       
	    }
}
