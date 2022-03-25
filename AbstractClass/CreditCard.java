public class CreditCard{

  private String name;
  private String creditCardNumber;
  private String expirationDate;
  private int cvv;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
  
// 1. Create the remaining getters and setters

  public void setCreditCardNumber(String cardNumber)
  {
    creditCardNumber = cardNumber;
  }

  public String getCreditCardNumber()
  {
    return creditCardNumber;
  }

  public void setExpirationDate(String exp)
  {
    expirationDate = exp;
  }

  public String getExpirationDate()
  {
    return expirationDate;
  }

  public void setCVV(int cvv)
  {
    this.cvv = cvv;
  }

  public int getCVV()
  {
    return cvv;
  }
}