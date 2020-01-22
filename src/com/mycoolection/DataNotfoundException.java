package com.mycoolection;

public class DataNotfoundException extends RuntimeException {
	Integer value;
	public  DataNotfoundException(Integer value){
		 super("value"+value+"is not found");
		 this.value=value; 
	 }
	@Override
	public String toString() {
	  return super.getMessage();	
	}
    
}
