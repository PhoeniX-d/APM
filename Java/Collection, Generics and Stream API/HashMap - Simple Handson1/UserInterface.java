import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int n = sc.nextInt();
		String country = "";
		int countryCode = 0;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (i = 0; i < n; i++) {
			System.out.println("Enter the country code");
			countryCode = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the country name");
			country = sc.nextLine();
			map.put(countryCode, country);
		}
		System.out.println(map);
	}
}
