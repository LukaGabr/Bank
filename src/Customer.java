import java.util.ArrayList;

public class Customer {
    private String firstName, lastName;
    private String dateOfBirth;
    private ArrayList<Account> accountsArrayList = new ArrayList<Account>();

    public Customer(String firstName, String lastName, String dateOfBirth, Account accNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        accountsArrayList.add(accNumber);
    }

    // Set
    public void setFirstName(String firstName){ firstName = this.firstName; }
    public void setLastName(String lastName){ lastName = this.lastName; }
    public void setDateOfBirth(String dateOfBirth){ dateOfBirth = this.dateOfBirth; }


    // Get
    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }
    public String getDateOfBirth(){ return this.dateOfBirth; }
    public ArrayList<Account> getAccNumber(){ return this.accountsArrayList; }

    public String toString(){
        if(accountsArrayList.size() == 1){ // If there is only one element in accountsArrayList
            return "First Name : " + this.firstName +
                    "\nLast Name : " + this.lastName +
                    "\nDate of birth : " + this.dateOfBirth +
                    "\nAccount Number : \n" + "(" + this.accountsArrayList.getFirst().getType() + ") -- " +
                    this.accountsArrayList.getFirst().getAccNumber() +
                    " -- Balance : $" + this.accountsArrayList.getFirst().getBalance() + "\n";
        } else { // If there are more than one element in accountsArrayList
            StringBuilder accNumbersStr = new StringBuilder();
            for(int i = 0; i < accountsArrayList.size(); i++){
                accNumbersStr.append("(")
                        .append(this.accountsArrayList.get(i).getType())
                        .append(") -- ")
                        .append(this.accountsArrayList.get(i).getAccNumber())
                        .append(" -- Balance : $")
                        .append(this.accountsArrayList.get(i).getBalance())
                        .append("\n");
            }
            return "First Name : " + this.firstName +
                    "\nLast Name : " + this.lastName +
                    "\nDate of birth : " + this.dateOfBirth +
                    "\nAccount Numbers : \n" + accNumbersStr;
        }
    }

    public void addAccount(Account accNumber){ accountsArrayList.add(accNumber); }

}
