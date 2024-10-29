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
    public void setBalance(String type){ this.type = type; }

}
