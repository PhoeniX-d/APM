import java.util.Scanner;
public class TestBook {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book name:");
        String bookName = sc.nextLine();

        System.out.println("Enter the price:");
        int bookPrice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Author name:");
        String authorName = sc.nextLine();

        Book bookObj = new Book();
        bookObj.setBookName(bookName);
        bookObj.setBookPrice(bookPrice);
        bookObj.setAuthorName(authorName);

        System.out.println("Book Details");
        System.out.println("Book Name :" + bookObj.getBookName());
        System.out.println("Book Price :" + bookObj.getBookPrice());
        System.out.println("Author Name :" + bookObj.getAuthorName());
        sc.close();
    }

}
