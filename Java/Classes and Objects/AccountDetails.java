import java.util.Scanner;
public class AccountDetails {
    public static Account getAccountDetails(){
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id:");
        int accountId = sc.nextInt();

        System.out.println("Enter account type:");
        String accountType = sc.next();
        int balance = 0;
        do{
            System.out.println("Enter balance:");
            balance = sc.nextInt();
            if(balance <= 0)
                System.out.println("Balance should be positve");
        }while(balance <= 0);
        ac.setAccountId(accountId);
        ac.setAccountType(accountType);        
        ac.setBalance(balance);
        return ac;
    }

    public static int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        do{
            System.out.println("Enter amount to be withdrawn:");
            amount = sc.nextInt();
            if(amount <= 0){
                System.out.println("Amount should be positve");
            }            
        }while(amount <= 0);
        sc.close();
        return amount;
    }
    public static void main(String[] args) {
        Account account = getAccountDetails();
        int withdraw_amount = getWithdrawAmount();
        boolean bret = account.withdraw(withdraw_amount);
        if(bret == true){
            System.out.println("Balance amount after withdraw:" + account.getBalance());
        }else{
            System.out.println("Sorry!!!! No enough balance");
        }
    }
}
