package com.mycoolection;

public class EmptyListException extends RuntimeException {
	
	
	public EmptyListException() {
		super("List is Empty");
		
	}

	
	public String toString() {
		return super.getMessage();
	}
	
}
