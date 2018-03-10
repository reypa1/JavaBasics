package com.krish.interview;

public class TryCatchFinallyBlockReturn {
	@SuppressWarnings("finally")
	public int name() {
		try {
			return 1/0;
		} catch (Exception e) {
			System.out.println("Catch Block");
			return 2;
		} finally {
			System.out.println("finally Block");
			return 3;
		}
	}

	public static void main(String[] args) {
		System.out.println(new TryCatchFinallyBlockReturn().name());
	}
}
