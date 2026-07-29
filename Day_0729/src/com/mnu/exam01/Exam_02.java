package com.mnu.exam01;
public class Exam_02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.capacity());//20
		System.out.println(sb);//Java
		sb.append("Program");//문자열추가
		System.out.println(sb);//JavaProgram
		System.out.println(sb.charAt(0));
		sb.delete(0, 4);
		System.out.println(sb);//Program
		sb.deleteCharAt(0);
		System.out.println(sb);//Rogram
		sb.insert(0, "Java P");//삽입
		System.out.println(sb);//Java Program
		System.out.println(sb.length());//12
		sb.setCharAt(0, 'A');//변경
		System.out.println(sb);//Aava Program
		sb.replace(0, 3, "AAA");//0~3전까지 치환
		
		sb.reverse();
		System.out.println(sb);
		}

}