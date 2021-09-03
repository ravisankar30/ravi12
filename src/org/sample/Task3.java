package org.sample;

public class Task3 {
	int c;
	int e;
	public void  empId(int a, int b) {
		
		c=a+b;
		System.out.println(c);
	}
	
	public void empName(int d) {
		
		e=c+d;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		Task3 ts=new Task3();
		ts.empId(5,35);
		ts.empName(60);
	}

}
