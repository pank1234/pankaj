package com.smarttech.pankaj;

public class Pankaj {
	public static void main(String[] args) {
		Pankaj xyz = new Pankaj();
		xyz.methodone();
		System.out.println(Pankaj.methodTwo(30,20));

	}

	

public void methodone() {
String  abc = "Pankaj";
System.out.println(abc);
	
}
public static int methodTwo(int p, int a) {


int c = p/a;
return c;
}
}
