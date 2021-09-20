import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int n = sc.nextInt();
		sc.nextLine();
		String str = "";
		ArrayList<String> fruit = new ArrayList<>();
		for (int i = 1; i <= n; i++){
			str = sc.nextLine();
			fruit.add(str);
		}
		Iterator itr = fruit.iterator();
		while(itr.hasNext()){
			System.out.println((String)itr.next());
		}
		
		sc.close();
	}

}