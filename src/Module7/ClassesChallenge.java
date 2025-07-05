package Module7;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(2000,"sadasdad", "Bod", "rplua", "2312");
        account.setBalance(600);
        System.out.println(account.getBalance());

        System.out.println(account.despositMoney(20));
        System.out.println(account.withdrawMoney(610));
    }
}
