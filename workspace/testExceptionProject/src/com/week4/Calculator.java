package com.week4;

public class Calculator {
	public Calculator() {
		super();
	}

	public int sum(int a, int b) throws NumberRangeException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			return a + b;
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	public double sum(double a, double b) throws NumberRangeException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			return a + b;
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	public int sub(int a, int b) throws NumberRangeException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			return a - b;
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	public double sub(double a, double b) throws NumberRangeException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			return a - b;
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	public int mul(int a, int b) throws NumberRangeException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			return a * b;
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	public double mul(double a, double b) throws NumberRangeException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			return a * b;
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	public int div(int a, int b) throws NumberRangeException, NotDivideZeroException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			if (b != 0) {
				return a / b;
			} else {
				throw new NotDivideZeroException("0 으로 나눌 수 없습니다.");
			}
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

	public double div(double a, double b) throws NumberRangeException, NotDivideZeroException {
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			if (b != 0) {
				return a / b;
			} else {
				throw new NotDivideZeroException("0 으로 나눌 수 없습니다.");
			}
		} else {
			throw new NumberRangeException("두 정수값은 반드시 1~100사이의 값이어야 합니다.");
		}
	}

}
