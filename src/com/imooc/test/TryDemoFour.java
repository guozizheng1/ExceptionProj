package com.imooc.test;

import java.util.Scanner;

public class TryDemoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testAge();
		} catch (HotelAgeException e) {
			System.out.println(e.getMessage());
			System.out.println("�Ƶ�ǰ̨������Ա�����������ס�Ǽ�");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	 * throw�׳��쳣�Ĵ�������
	 * 1��ͨ��try...catch����throw���--�Լ����Լ�����
	 * 2�� ͨ��throws�ڷ����������׳��쳣����--˭����˭����--�����߿����Լ�����Ҳ���Լ���������
	 * 	  ��ʱ�����׳���throw������ͬ�ĵ����ͻ����丸��
	 */
	//�����Ƶ����ס�����޶����䣺18�����£�80�����ϵ�ס�ͱ�����������ͬ
	/*public static void testAge(){
		
			try {
				System.out.println("����������");
				Scanner input = new Scanner(System.in);
				int age = input.nextInt();
				if(age<18 || age >80){
				throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ");
				}else{
					System.out.println("��ӭ��ס���Ƶ�");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}*/
	
	public static void testAge() throws HotelAgeException{
			System.out.println("����������");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if(age<18 || age >80){
			//throw new Exception("18�����£�80�����ϵ�ס�ͱ�����������ͬ");
				throw new HotelAgeException();
			}else{
				System.out.println("��ӭ��ס���Ƶ�");
			}
}

}
