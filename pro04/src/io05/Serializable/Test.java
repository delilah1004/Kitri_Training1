package io05.Serializable;

import java.io.Serializable;

// 임의의 객체 만들기

public class Test implements Serializable {
	private int c;
	private float x;
	private char z;
	
	public Test() { }

	public Test(int c, float x, char z) {
		this.c = c;
		this.x = x;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Test [c=" + c + ", x=" + x + ", z=" + z + "]";
	}	
}
