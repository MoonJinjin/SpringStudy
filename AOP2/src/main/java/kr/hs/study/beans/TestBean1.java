package kr.hs.study.beans;

public class TestBean1 {
	public void add() {
		System.out.println("add ȣ��");
	}
	public int abs() {
		System.out.println("abs ȣ��");
		return 100;
	}
	public void sub() {
		System.out.println("sub ȣ��");
	}
	public void ex() {
		int a = 10/0; // ���� �߻�
	}
}
