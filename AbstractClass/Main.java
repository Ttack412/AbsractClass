class Main {
  public static void main(String[] args) {

    // 1. Create the getters and setters in CreditCard.java


    // 2. Create a new credit card object
    CreditCard myCard = new CreditCard();


    // 3. Set the name to "Annabeth Chase"
    // 4. Set the number to "3242542123112744"
    // 5. Set the expiration date to "01/25"
    // 6. set the CVV to "633"
    myCard.setName("Annabeth Chase");
    myCard.setCreditCardNumber("3242542123112744");
    myCard.setExpirationDate("01/25");
    myCard.setCVV(633);


    // 7. Create a print out using getters that prints out the material in the following way: 
    // Your card details:
    // Cardholder Name: Peach Blossom
    // Card Number: 3242342123112344
    // Expiration Date: 06/24
    // CVV: 633
    System.out.println("Your card details: ");
    System.out.println("Cardholder Name: " + myCard.getName());
    System.out.println("Card Number: " + myCard.getCreditCardNumber());
    System.out.println("Expiration Date: " + myCard.getExpirationDate());
    System.out.println("CVV: " + myCard.getCVV());

  }
}