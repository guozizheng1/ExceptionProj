package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

	public static void main(String[] args) {
		try {
			int result = test();
			System.out.println("one��two���̣�" + result);
		} catch (ArithmeticException e) {
			System.out.println("����������Ϊ��");
			e.printStackTrace();
		}
	}

	private static int test() throws ArithmeticException, InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.println("=======���㿪ʼ=======");
			System.out.print("�������һ��������");
			int one = input.nextInt();
			System.out.print("������ڶ���������");
			int two = input.nextInt();
			System.out.println("=======�������=======");
			return one/two;

	}


}
