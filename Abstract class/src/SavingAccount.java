class SavingAccount extends BankAccount{

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void  deposit(double amount){
              setBalance(getBalance()+amount);
        System.out.println("Deposit amount is "+amount+ " and current balance is "+ getBalance());
    }
    public void withdraw(double amount){}

}
