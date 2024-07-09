package AssigmentMay2024.BankAccountManagment;

public class Account {
    /*
    Project: Bank Account Management

Objective: Apply single inheritance in a financial context.

Steps:

    1. Create a base class called Account.
    2. Define private member variables: accountNumber (type String) and balance (type double).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getAccountNumber() and getBalance() to access these variables.
    5. Create a derived class called SavingsAccount that extends Account.
    6. Add a private member variable: interestRate (type double).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getInterestRate() to access the interest rate.
    9. In a main method, create a SavingsAccount object and display all the details.
     */

    private String accoutNumber;
    private  double balance;

    // constructor
    public Account( String accoutNumber, double balance){
        this.accoutNumber=accoutNumber;
        this.balance=balance;
    }

    // getter \
    public String getAccoutNumber(){return accoutNumber;}
    public double getBalance(){return balance;}
    //setter
    private void setAccoutNumber(String accoutNumber){this.accoutNumber=accoutNumber;}
    private void setBalance(double balance){ this.balance=balance;}
}
