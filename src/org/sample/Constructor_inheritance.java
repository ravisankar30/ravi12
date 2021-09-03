package org.sample;

public class Constructor_inheritance extends Practical {
	
	public  Constructor_inheritance() {
		
	System.out.println("do work");
	
}
	public  Constructor_inheritance(int id) {
		super(id);
		System.out.println("print karo");
	}
   public static void main(String[] args) {
	   
	   Constructor_inheritance dr=new Constructor_inheritance(665);
	   
}
}
