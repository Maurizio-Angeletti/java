public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //costruttore:
    //se dichiariamo i parametri uguali agli attributi dobbiamo usare this. altrimenti non c'è bisogno
    public BankAccount(String accountNumber,double balance,String name, String email,String phoneNumber){
        this.accountNumber = accountNumber;
        accountBalance = balance;
        customerName = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("empty constructor called");
    }

    public BankAccount(String customerName,double accountBalance) {
        this("123456789",accountBalance,customerName,"email@email.com","333123456789");
    }

    //concatenamento di costruttori:
    public BankAccount(){
        this("default number", 0.5, "default name","default email", "default phone number");
        System.out.println("constructor whit parameters called");
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        this.accountBalance += deposit;
        System.out.println("the current fund balance  is " + this.accountBalance);
    }

    public void withdrawFunds(double     withdrawFunds){
        if (withdrawFunds <= accountBalance){
            this.accountBalance -= withdrawFunds;
            System.out.println("the current fund balance  is " + this.accountBalance);
        }else {
            System.out.println("you cannot withdraw more than " + this.accountBalance);
        }

    }
}

