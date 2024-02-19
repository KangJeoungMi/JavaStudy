package 람다식;

public class MethodREferenceExample {
	public static void main(String[] args) {
		Person2 person2 = new Person2();
		person2.ordering(String :: compareToIgnoreCase);
	}
}
