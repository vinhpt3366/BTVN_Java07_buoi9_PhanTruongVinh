package baitap4.oop;

public class BaiTap4Application {
	public static void main(String[] args) {
		XeHoi car = new XeHoi("Honda", "Xanh", 1890);
		car.printInfo();

		XeMay motobike = new XeMay("Yamaha", "Xanh", 1980);
		motobike.printInfo();
	}

}
