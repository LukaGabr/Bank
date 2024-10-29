public class Account {
    private int accNumber;
    private float balance;
    private String type;

    public Account(int accNumber, float balance, String type){
        this.accNumber = accNumber;
        this.balance = balance;
        this.type = type;
    }

    // Get
    public int getAccNumber(){ return this.accNumber; }
    public float getBalance(){ return this.balance; }
    public String getType(){ return this.type; }

    // Set
    public void setAccNumber(int accNumber){ this.accNumber = accNumber; }
    public void setBalance(float balance){ this.balance = balance; }
    public void setType(String type){ this.type = type; }

    public void deposit(float amount){
        if(amount <= 0){ System.out.println("Deposit amount must be more than 0!\n");}
        else {
            balance += amount;
            System.out.println("Deposit Succeeded! \nDeposit Amount: $" +
                    amount + "\nAccount number: " + this.getAccNumber() +
                    "\nNew Balance: $" + this.getBalance() + "\n");
        }
    }

    public void withdraw(float amount){
        if(amount > balance){ System.out.println("Non-Sufficient Founds!\n"); }
        else {
            balance -= amount;
            System.out.println("Withdrawal Succeeded! \nWithdraw Amount: $" +
                    amount + "\nAccount number: " + this.getAccNumber() +
                    "\nNew Balance: $" + this.getBalance() + "\n");
        }
    }
}
