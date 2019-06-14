package copy.clone;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car = new Car("소나타", 5000000, "흰색", 2012, 80.98);
		car.listAddValue("a");
		car.listAddValue("b");
		car.listAddValue("c");

		Car cloneCar = (Car) car.clone();
		Car cloneCar2 = car.copy();

		System.out.println("값 변경 전");
		car.showCarInfo();
		car.showList();
		cloneCar.showCarInfo();
		cloneCar.showList();
		cloneCar2.showCarInfo();
		cloneCar2.showList();

		car.setName("마티즈");
		car.listAddValue("d");

		System.out.println("값 변경 후");
		car.showCarInfo();
		car.showList();
		cloneCar.showCarInfo();
		cloneCar.showList();
		cloneCar2.showCarInfo();
		cloneCar2.showList();

		System.out.println("Equals 검사");
		System.out.println("car와 cloneCar : " + car.equals(cloneCar));
		System.out.println("car와 cloneCar2 : " + car.equals(cloneCar2));
		System.out.println("cloneCar와 cloneCar2 : " + cloneCar.equals(cloneCar2));
	}
}
