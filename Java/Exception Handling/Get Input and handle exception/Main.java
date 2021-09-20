import java.util.*;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println("The input is " + n);
		} catch (InputMismatchException e) {
			System.out.println("Input should be a number");
		}
	}
}
