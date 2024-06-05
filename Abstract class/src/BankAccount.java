abstract class BankAccount {
    private final String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
         return balance;
    }
    double setBalance(double amount) {
        balance=balance;
        return amount;
    }
    public void deposit(double amount){

    }
    public void withdraw(double amount){

    }


}
class main{
    public static void main(String[] args) {
        SavingAccount obj=new SavingAccount("543521",5000);
        obj.deposit(200);

    }
}


