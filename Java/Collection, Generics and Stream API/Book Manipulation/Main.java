import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Library lobj = new Library();
        int i = 0;
        while (i != 5) {
            System.out.println(
                    "1.Add Book\n2.Display all book details\n3.Search Book by author\n4.Count number of books - by book name\n5.Exit");
            System.out.println("Enter your choice:");
            int n = Integer.parseInt(sc.nextLine());
            if (n == 1) {
                Book bobj = new Book();
                System.out.println("Enter the isbn no:");
                bobj.setIsbnno(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter the book name:");
                bobj.setBookName(sc.nextLine());
                System.out.println("Enter the author name:");
                bobj.setAuthor(sc.nextLine());
                lobj.addBook(bobj);
            } else if (n == 2) {
                if (lobj.isEmpty()) {
                    System.out.println("The list is empty");
                } else {
                    ArrayList<Book> b = lobj.viewAllBooks();
                    for (Book a : b) {
                        System.out.println("ISBN no:" + a.getIsbnno());
                        System.out.println("Book name:" + a.getBookName());
                        System.out.println("Author name:" + a.getAuthor());
                    }
                }
            } else if (n == 3) {
                System.out.println("Enter the author name:");
                String aname = sc.nextLine();
                for (Book b : lobj.viewBooksByAuthor(aname)) {
                    if (lobj.viewBooksByAuthor(aname).isEmpty()) {
                        System.out.println("None of the book published by the author " + aname);

                    } else {
                        System.out.println("ISBN no:" + b.getIsbnno());
                        System.out.println("Book name:" + b.getBookName());
                        System.out.println("Author name:" + b.getAuthor());
                    }
                }
            } else if (n == 4) {
                System.out.println("Enter the book name:");
                String bname = sc.nextLine();
                System.out.println("Count is " + lobj.countnoofbook(bname));
            }
        }
    }
}