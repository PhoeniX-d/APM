import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int n = sc.nextInt();
		sc.nextLine();
		TreeSet<String> veg = new TreeSet<String>();
		for (int i = 0; i <= n; i++) {
			veg.add(sc.nextLine());
		}
		Iterator itr = veg.iterator();
		while(itr.hasNext()){
			System.out.println((String)itr.next());
		}

		sc.close();
	}
}
