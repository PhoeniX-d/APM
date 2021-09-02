import java.util.*;
public class Login{

    private String userName;
    private String password;
    
    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate(){
        if(this.userName.equals("john") && this.password.equals("123abc"))
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = null;
        System.out.println("Enter the useranme:");
        String userName = sc.next();

        System.out.println("Enter the password:");
        String password = sc.next();
        login = new Login(userName, password);
        if(login.validate())
            System.out.println("Valid user");
        else
            System.out.println("Invalid user");
        sc.close();
    }
}
