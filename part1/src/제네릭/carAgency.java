package 제네릭;

public class carAgency implements RenTable<Car>{
	public Car rent () {
		return new Car();
	}

}
