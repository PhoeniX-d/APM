import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> fruit = new ArrayList<String>();
		for (int i = 0; i <= n; i++) {
			fruit.add(sc.nextLine());
		}
		System.out.println(fruit);
		sc.close();
	}
}
