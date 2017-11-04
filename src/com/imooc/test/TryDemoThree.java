package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {

	public static void main(String[] args) {
		try {
			int result = test();
			System.out.println("one和two的商：" + result);
		} catch (ArithmeticException e) {
			System.out.println("除数不允许为零");
			e.printStackTrace();
		}
	}

	private static int test() throws ArithmeticException, InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.println("=======运算开始=======");
			System.out.print("请输入第一个整数：");
			int one = input.nextInt();
			System.out.print("请输入第二个整数：");
			int two = input.nextInt();
			System.out.println("=======运算结束=======");
			return one/two;

	}


}
