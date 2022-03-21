package Week1.Day2;

public class AssignmentNewMyCalculator {
	public static void main(String[] args) {
		AssignmentCalculator assign = new AssignmentCalculator();
		int addition=assign.add(10, 5, 4);
		System.out.println(addition);
		int subtraction=assign.sub(45, 20);
		System.out.println(subtraction);
		double multiplication=assign.mult(5.25, 2.05);
		System.out.println(multiplication);
		float divide=assign.divide(10.50f, 2.00f);
		System.out.println(divide);
	}
}
