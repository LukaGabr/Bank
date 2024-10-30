import java.util.ArrayList;

public class Customer {
    private String firstName, lastName;
    private String dateOfBirth;
    private ArrayList<Account> accountsArrayList = new ArrayList<>();

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
                    "\n\n --- Account associated with the customer --- \n\n" + "(" +
                    this.accountsArrayList.getFirst().getType() + ") -- " +
                    this.accountsArrayList.getFirst().getAccNumber() +
                    " -- Balance : $" + this.accountsArrayList.getFirst().getBalance() +
                    "\nCard Number : " + this.accountsArrayList.getFirst().getPhysicalCard().getCardNumber() +
                    "\nExpiration Date : " + this.accountsArrayList.getFirst().getPhysicalCard().getExpirationDate() +
                    "\nCard Type : " + this.accountsArrayList.getFirst().getPhysicalCard().getCardType() + "\n";
        } else { // If there are more than one element in accountsArrayList
            StringBuilder accNumbersStr = new StringBuilder();
            for(int i = 0; i < accountsArrayList.size(); i++){
                accNumbersStr.append("(")
                        .append(this.accountsArrayList.get(i).getType())
                        .append(") -- ")
                        .append(this.accountsArrayList.get(i).getAccNumber())
                        .append(" -- Balance : $")
                        .append(this.accountsArrayList.get(i).getBalance())
                        .append("\nCard Number : ")
                        .append(this.accountsArrayList.get(i).getPhysicalCard().getCardNumber())
                        .append("\nExpiration Date : ")
                        .append(this.accountsArrayList.get(i).getPhysicalCard().getExpirationDate())
                        .append("\nCard Type : ")
                        .append(this.accountsArrayList.get(i).getPhysicalCard().getCardType())
                        .append("\n\n");
            }
            return "First Name : " + this.firstName +
                    "\nLast Name : " + this.lastName +
                    "\nDate of birth : " + this.dateOfBirth +
                    "\n\n --- Accounts associated with the customer --- \n\n" + accNumbersStr;
        }
    }

    public void addAccount(Account accNumber){ accountsArrayList.add(accNumber); }

    public void internalTransfer(int senderAccount, int receiverAccount, float amount){
        boolean senderAccNumCheck = false;
        boolean receiverAccNumCheck = false;
        int senderAccIndex = -1;
        int receiverAccIndex = -1;

        if(senderAccount == receiverAccount)
            System.out.println("Sender and receiver accounts can't be the same!");
        else {

            for (int i = 0; i < accountsArrayList.size(); i++) {
                if (senderAccount == accountsArrayList.get(i).getAccNumber()) {
                    senderAccNumCheck = true;
                    senderAccIndex = i;
                } else if (receiverAccount == accountsArrayList.get(i).getAccNumber()) {
                    receiverAccNumCheck = true;
                    receiverAccIndex = i;
                }
            }

            if (amount > accountsArrayList.get(senderAccIndex).getBalance())
                System.out.println("Non-Sufficient Founds! -- Transfer Declined! \n");
            else {
                if (senderAccNumCheck && receiverAccNumCheck) {
                    accountsArrayList.get(senderAccIndex).setBalance
                            (accountsArrayList.get(senderAccIndex).getBalance() - amount);
                    accountsArrayList.get(receiverAccIndex).setBalance
                            (accountsArrayList.get(receiverAccIndex).getBalance() + amount);
                    System.out.println("Transfer Succeeded!\n" + "Transfer Amount: $" + amount +
                            "\nSender Account Number : " + senderAccount +
                            " -- New Balance : $" + accountsArrayList.get(senderAccIndex).getBalance() +
                            "\nReceiver Account Number : " + receiverAccount +
                            " -- New Balance : $" + accountsArrayList.get(receiverAccIndex).getBalance() + "\n");
                } else {
                    if (!senderAccNumCheck && !receiverAccNumCheck)
                        System.out.println("Account Numbers : " + senderAccount + ", " +
                                receiverAccount + " not found!");
                    else if (!senderAccNumCheck)
                        System.out.println("Account Number : " +
                                senderAccount + " not found! \n");
                    else
                        System.out.println("Account Number : " +
                                receiverAccount + " not found! \n");
                }
            }
        }
    }
}
