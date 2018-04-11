package com.accenture.adf.entity;

public class Triangle implements Shape {
	private String type;
	private int height;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(getType()+" Triangle drawing of Height: "+getHeight());
		//System.out.println("Triangle drawing...");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Triangle Erasing...");
	}

}
