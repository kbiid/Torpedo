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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return false;
//		}
//		Car car = (Car) obj;
//
//		if (name.equals(car.getName()) && (price == car.getPrice()) && color.equals(car.getColor())
//				&& (year == car.getYear()) && (weight == car.getWeight()) && list.equals(car.getList())) {
//			return true;
//		}
//		return false;
//	}

}
