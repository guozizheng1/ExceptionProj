package com.imooc.test;

public class FartherTest {
	
	public void test() throws HotelAgeException{
		throw new HotelAgeException();
	}

}

class SubException extends HotelAgeException{
	
}
