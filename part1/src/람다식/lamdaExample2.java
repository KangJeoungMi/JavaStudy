package 람다식;

public class lamdaExample2 {
	public static void main(String[] args) {
		Person person = new person();
		
		person.action((x,y)-> {
			double result = x+y;
			return result;
		});
		
		person.action((x,y) -> (x+y));
		
		person.action((x,y)-> sum(x,y));
	}
	public static double sum(double x, double y) {
		return(x+y);
	}
}
