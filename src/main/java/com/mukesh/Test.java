package com.mukesh;

class A {}
 class B extends A  {
	 
	public void m2(){}
	 
 }
 class C extends B {}
 class D extends C{}


public class Test {
public static void main(String[] args) {
	
	Object obj=new Object();
	Object obj2=new A();
	A a=new B();
	A a2=new D();
	//B b1=new A();
	B b1=new C();
b1.m2();


	B b2=(B) a;
	b1.m2();

	
	
	
}
}
