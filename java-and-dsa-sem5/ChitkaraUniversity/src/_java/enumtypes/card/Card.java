package _java.enumtypes.card;

public enum Card {
//    CARD_TYPE (annualFee, cardLimit, annualSalary)
    DEBIT_CARD (100, 00.00, 50_000.00),
    CREDIT_CARD (1000, 100_000, 200_000.0),
    SHOPPING (1500, 150_000, 300_000),
    BUSINESS (2500, 250_000, 500_000),
    INTERNATIONAL (5000, 500_000, 1_000_000);

    private final int annualFee;
    private final double cardLimit;
    private final double annualSalary;


//    No public constructor allowed in enum type
//    Enum constructor private by default
    private Card(int annualFee, double cardLimit, double annualSalary) {
        this.annualFee = annualFee;
        this.cardLimit = cardLimit;
        this.annualSalary = annualSalary;
    }

//    Enums are final by default and cannot be inherited (property of final)
//    it's methods are package-private by default

//    protected int getAnnualFee() {
    int getAnnualFee() {
        return annualFee;
    }

//    protected double getCardLimit() {
    double getCardLimit() {
        return cardLimit;
    }

//    protected double getAnnualSalary() {
    double getAnnualSalary() {
        return annualSalary;
    }

}
