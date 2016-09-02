package ch06.lab12;

public class Car {
	int speed;
	double hour;
	
	public void getComment() {
		System.out.println("此車走了" + speed * hour + "公里");
	}
}
