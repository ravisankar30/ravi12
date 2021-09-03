package org.sample;

public class Practical {

	public Practical() {
		
		 System.out.println("data");
}

	public Practical(int id) {
		this("value");
		System.out.println("id is " + id);
	}

	public Practical(String data) {
		this(987654321l);
		System.out.println("string " + data);
	}

	public Practical(long l) {
		this(true);
		System.out.println("ph num " + l);
	}

	public Practical(boolean b) {
		
		System.out.println("boolean " + b);
	}

	

}
