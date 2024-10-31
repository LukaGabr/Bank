public class PhysicalCard {
    private String cardNumber;
    private String expirationDate;
    private int cvv;

    public PhysicalCard(String cardNumber, String expirationDate, int cvv){
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    //Get
    public String getCardNumber(){ return this.cardNumber; }
    public String getExpirationDate(){ return this.expirationDate; }
    public int getCvv(){ return this.cvv; }

    //Set
    public void setCardNumber(String cardNumber){ this.cardNumber = cardNumber; }
    public void setExpirationDate(String expirationDate){ this.expirationDate = expirationDate; }
    public void setCvv(int cvv){ this.cvv = cvv; }

}
