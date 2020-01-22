package com.mycoolection;

public class DoubleLinklist implements MyList {
 
	public  static DoubleNode start;
	public DoubleNode last;
	public int size;
	//public static DoubleNode mynode;
	@Override
	public void add(Integer value) {
		System.out.println("value"+value);
		 DoubleNode newnode=new DoubleNode();
		 newnode.value=value;
		// newnode.next=null;
		if(start==null) {
			start=newnode;
			last=newnode;
			size++;
		}
		else {
			 DoubleNode holdstart=start;
			while(holdstart.next!=null) {
				holdstart=holdstart.next;
			}
			holdstart.next=newnode;
			newnode.privoius=holdstart;
			last=newnode;
			size++;
		}
		
		
	}

	@Override
	public void remove(Integer value) {
	    boolean flag=false;
		DoubleNode holdstart=start;
		if(start==null) {
			throw new EmptyListException();
		}
		
		
	}

	@Override
	public boolean find(Integer value) {
		// TODO Auto-generated method stub
		return false;
	}
	public  MyLoop myiterator() {
		MyLoop myloop=new DoubleLinklist.MyLoop();
		 return myloop;
	}
	public  static  class MyLoop implements Miterator{
	
		DoubleNode dnode=start;
		
		public boolean  hasNext() {
		   
		   
		
			if(dnode!=null) 
				
				return true;
		
			else 
				return false;
			
			
		}
		public Integer next() {
			Integer val= dnode.value;
			dnode=dnode.next;
			return val;
	}

	}
	
	
}
