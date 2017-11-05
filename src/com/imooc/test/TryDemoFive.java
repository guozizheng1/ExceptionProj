package com.imooc.test;

public class TryDemoFive {

	public static void main(String[] args) {
		try {
			testThree();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testOne() throws HotelAgeException{
		throw new HotelAgeException();
	}
	
	public static void testTwo() throws Exception{
		try {
			testOne();
		} catch (HotelAgeException e) {
			throw new Exception("�����²������쳣1",e);
		}
	}
	
	public static void testThree() throws Exception{
		try {
			testTwo();
		} catch (Exception e) {
			Exception e1 = new Exception("�����²������쳣2");
			e1.initCause(e);
			throw e1;
			//throw new Exception("�����²������쳣2",e);
		}
	}
}
