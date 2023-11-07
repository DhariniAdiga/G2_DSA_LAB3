package com.bracket.service;

public interface BracketCheckService {
	boolean isBalanced(String input);
	boolean isMatchingPair(char opening, char closing);
}
