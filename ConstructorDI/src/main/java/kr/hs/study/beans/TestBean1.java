package kr.hs.study.beans;

public class TestBean1 {
	private int data1;
	private double data2;
	private String data3;
	
	public TestBean1() {
		this.data1=0;
		this.data2=0.0;
		this.data3="spring1";
	}
	public TestBean1(int data1) {
		System.out.println("TestBean1의 int 생성자");
		this.data1=data1;
		this.data2=22.22;
		this.data3="spring2";
	}
	public TestBean1(double data2) {
		System.out.println("TestBean1의 double 생성자");
		this.data1=30;
		this.data2=data2;
		this.data3="spring3";
	}
	public TestBean1(String data3) {
		System.out.println("TestBean1의 String 생성자");
		this.data1=55;
		this.data2=55.55;
		this.data3=data3;
	}
	public TestBean1(int data1, double data2, String data3) {
		System.out.println("TestBean1의 모든 매개변수 생성자");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public double getData2() {
		return data2;
	}
	public void setData2(double data2) {
		this.data2 = data2;
	}
	public String getData3() {
		return data3;
	}
	public void setData3(String data3) {
		this.data3 = data3;
	}
	
	public void prData() {
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);

	}
	
	
}
