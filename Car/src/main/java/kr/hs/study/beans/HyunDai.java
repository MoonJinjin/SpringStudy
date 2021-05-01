package kr.hs.study.beans;

public class HyunDai implements Car {
	
	String name;
	String color;

	public int money(int money) {
		return money;
	}

	public void order() {
		System.out.println(this.getName() + " 주문하다");
	}

	public HyunDai(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
