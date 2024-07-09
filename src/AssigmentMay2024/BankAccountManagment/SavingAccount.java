package AssigmentMay2024.BankAccountManagment;

public class SavingAccount extends Account {

    private double interstrat;

    public static void main(String[] args) {
        var savingAccoutObj=new SavingAccount("100300400", 4530,10);
        savingAccoutObj.printAccountInfo();
    }

    //constructor

    public SavingAccount( String accoutNumber, double balance, double interstrat){
        super(accoutNumber,balance);
        this.interstrat=interstrat;
    }
    //getter
    public double getInterstrat(){return interstrat;}
    //setter
    private void setInterstrat(double interstrat){this.interstrat=interstrat;}

    public void printAccountInfo(){
        System.out.println("Account Number: "+getAccoutNumber());
        System.out.println("Account Balance: "+getBalance()+" $");
        System.out.println("Account Interset Rate: "+getInterstrat()+" %");
    }
}
