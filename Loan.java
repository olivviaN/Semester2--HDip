import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int noOfYears;
    private double loanAmount;
    private Date loanDate;

    // constructs a Loan object with all default values
    public Loan() {

        annualInterestRate = 2.5;
        noOfYears = 1;
        loanAmount = 1000;
        Date loanDate = new Date();  // date of when the object is created
    }

    //constructs a Loan object with specific values
    public Loan(double annualInterestRate, int noOfYears, double loanAmount) {

        this.annualInterestRate = annualInterestRate;
        this.noOfYears = noOfYears;
        this.loanAmount = loanAmount;
        Date loanDate = new Date();  // date of when the object is created
    }

/*
//    constructs a Loan object with specific interest value all other values are defaulted
public Loan(double annualInterestRate) {

this.annualInterestRate = annualInterestRate;
noOfYears = 1;
loanAmount = 1000;
Date loanDate = new Date();  // date of when the object is created
}
*/

    //    constructs a Loan object with specific number of years all other values are defaulted
    public Loan(int noOfYears) {

        this.noOfYears = noOfYears;
        annualInterestRate = 2.5;
        loanAmount = 1000;
        Date loanDate = new Date();  // date of when the object is created
    }

    //    constructs a Loan object with specific loan amount all other values are defaulted
    public Loan(double loanAmount, double annualInterestRate) {

        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        noOfYears = 1;
        Date loanDate = new Date();  // date of when the object is created
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double result = ((loanAmount * (annualInterestRate / 100)) + loanAmount) / noOfYears / 12;
        return result;
    }

    public double getTotalPayment() {
        return (loanAmount * (annualInterestRate / 100)) + loanAmount;
    }
 // Prints the info of the loan and monthly payment amount
    public void printMonthly(double monthPayment) {

        System.out.printf(" Monthly payment for a loan for %.2f , at %.2f%% for %d year is %.2f \n",
                loanAmount, annualInterestRate, noOfYears, monthPayment);

    }
    // Prints the info of the loan and the total payment amount
    public void printTotal(double totalPayment) {

        System.out.printf(" Total payment for a loan for %.2f , at %.2f%% for %d year is %.2f \n",
                loanAmount, annualInterestRate, noOfYears, totalPayment);

    }
}


