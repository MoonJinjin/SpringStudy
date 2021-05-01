package kr.hs.study.beans;

public class TestBean1 {
	public void add() {
		System.out.println("add 호출");
	}
	public int abs() {
		System.out.println("abs 호출");
		return 100;
	}
	public void sub() {
		System.out.println("sub 호출");
	}
	public void ex() {
		int a = 10/0; // 예외 발생
	}
}
