package com.week4;

public class TestWork3 {

	public static void main(String[] args) {
		Calculator cc = new Calculator();
		try {
			cc.mul(4, -1);
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
		}
		try {
			cc.div(4, 0);
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
		} catch (NotDivideZeroException e) {
			System.out.println(e.getMessage());
		}

	}

}
