package kr.hs.study.beans;

public class DataBean {
	private int a;
	private int b;
	
	public DataBean() {
		System.out.println("DataBean�� �⺻������");
	}
	
	public void prData() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
