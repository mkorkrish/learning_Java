class BankAccount{
    double balance; //Instance Varianble to store account balance

    //default constructor
    BankAccount(){
        this.balance=0; //Set default to 0;
    }

    //Paramater constructor
    BankAccount(double initialBalance) {
        this.balance = initialBalance; //Set initial balance with provided value
    }

    //Method for deposit
    void deposit(double amount){
        balance += amount; //Adding deposit
        System.out.println("Deposited " + amount + " New Balance: " + balance);
    }

    //Method for withdraw
    void withdraw (double amount){
        if (amount>balance){
            System.out.println("Insufficient Funds");
        }
        else {
           balance -= amount; //Subtracts withdrawn amount 
           System.out.println("Withdrew: " + amount + ". New Balance: "+ balance);
        }
    }
}

public class Main2{
    public static void main(String[] args){
        BankAccount account = new BankAccount(100); //Initial Balance of 100 
        account.deposit(70);
        account.withdraw(100);
    }
}