package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = test();
		System.out.println("one和two的商：" + result);
	}

	private static int test() {
		Scanner input = new Scanner(System.in);
		System.out.println("=======运算开始=======");
		try{
			System.out.print("请输入第一个整数：");
			int one = input.nextInt();
			System.out.print("请输入第二个整数：");
			int two = input.nextInt();
			return one/two;
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
			return 0;
		}
		finally{
			System.out.println("=======运算结束=======");
		}
	}

}
