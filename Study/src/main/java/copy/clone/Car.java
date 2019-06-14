package copy.clone;

import java.util.ArrayList;

public class Car implements Cloneable {
	private String name;
	private int price;
	private String color;
	private int year;
	private double weight;
	private ArrayList<String> list = new ArrayList<>();

	public Car(String name, int price, String color, int year, double weight) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.year = year;
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public double getWeight() {
		return weight;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public void listAddValue(String str) {
		list.add(str);
	}

	/**
	 * shallow cloning -> 객체의 레퍼런스가 아닌 primitive타입이나 immutable 한 것들에 사용하는 것이 좋다.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * deep cloning
	 */
	@SuppressWarnings("unchecked")
	public Car copy() throws CloneNotSupportedException {
		Car car = (Car) clone();
		car.setList((ArrayList<String>) getList().clone());
		return car;
	}

	public void showCarInfo() {
		System.out.println("차 이름 : " + name + " " + "차 가격" + price + " " + "차 색깔 : " + color + " " + "차 제조년도 : " + year
				+ " " + "차 무게 : " + weight + "\\n");
	}

	public void showList() {
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Car car = (Car) obj;

		if (name.equals(car.getName()) && (price == car.getPrice()) && color.equals(car.getColor())
				&& (year == car.getYear()) && (weight == car.getWeight()) && list.equals(car.getList())) {
			return true;
		}
		return false;
	}

}
