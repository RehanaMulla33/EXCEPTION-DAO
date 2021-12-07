package com.xworkz.Assignment3.Exception.Helmet.dto;

public class HelmetDto  {
	private String brand;
	private int price;
	private String color;
	private char size;
	private double wieght;
	


	public HelmetDto(String brand, int price, String color, char size, double wieght) {
		System.out.println("Inside helmet class");
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.wieght = wieght;
	}

	
	public String getBrand() {
		return brand;
	}

	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
	public char getSize() {
		return size;
	}

	
	public void setSize(char size) {
		this.size = size;
	}


	public double getWieght() {
		return wieght;
	}
	public void setWieght(double wieght) {
		this.wieght = wieght;
	}

	
	public String toString() {
		return "helmet [brand=" + brand + ", price=" + price + ", color=" + color + ", size=" + size + ", wieght="
				+ wieght + "]";
	}
	
	
	

}
