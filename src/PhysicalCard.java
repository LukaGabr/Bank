public class PhysicalCard {
    private String cardNumber;
    private String expirationDate;
    private String cardType;
    private int cvv;

    public PhysicalCard(String cardNumber, String expirationDate, String cardType, int cvv){
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.cvv = cvv;
    }

    //Get
    public String getCardNumber(){ return this.cardNumber; }
    public String getExpirationDate(){ return this.expirationDate; }
    public String getCardType(){ return this.cardType;}
    public int getCvv(){ return this.cvv; }

    //Set
    public void setCardNumber(String cardNumber){ this.cardNumber = cardNumber; }
    public void setExpirationDate(String expirationDate){ this.expirationDate = expirationDate; }
    public void setCardType(String cardType){ this.cardType = cardType; }
    public void setCvv(int cvv){ this.cvv = cvv; }

}
