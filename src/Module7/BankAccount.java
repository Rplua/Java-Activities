package Module7;

public class BankAccount {
    private String accountNo;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(double balance, String accountNo, String name, String email, String phoneNumber) {
        this.balance = balance;
        this.accountNo = accountNo;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String despositMoney(int number){
        if (number < 0) { return  "Not valid number"; }

        double total =  (this.balance + number);

        return  "You ammount is " + String.format("%.2f", total);

    }

    public String withdrawMoney(int number){
        if (number < 0) { return  "Not valid number"; }
        double total =  (this.balance - number);
        if (total < 0) { return  "Not valid number"; }
        return  "You ammount is " + String.format("%.2f", total);
    }

}
