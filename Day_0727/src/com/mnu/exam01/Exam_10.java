package com.mnu.exam01;
class Parent{
	void show() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("Child");
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Parent pa1 = new Parent();
		pa1.show();
		
		Parent pa = new Child();
		pa.show();
		
		Child ch = new Child();
		ch.show();
		
	}

}
