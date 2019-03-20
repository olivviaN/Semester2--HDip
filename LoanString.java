import java.util.Date;

public class LoanString {

        private String annualInterestRate; // interest rate including % symbol
        private int noOfYears;
        private double loanAmount;
        private Date loanDate;

     // constructs a Loan object with default values
        public LoanString(){
            
            annualInterestRate = "2.5";  //without the % sign
            noOfYears = 1;
            loanAmount = 1000.0;
            Date loanDate = new Date();  // date of when the object is created
        }

    //constructs a Loan object with specific values
        public LoanString( String annualInterestRate, int noOfYears, double loanAmount){

            this.annualInterestRate = annualInterestRate;
            this.noOfYears = noOfYears;
            this.loanAmount = loanAmount;
            Date loanDate = new Date();  // date of when the object is created
            
        }

    //    constructs a Loan object with specific number of years all other values are defaulted
    public LoanString(int noOfYears) {

        this.noOfYears = noOfYears;
        annualInterestRate = "2.5%";
        loanAmount = 1000;
        Date loanDate = new Date();  // date of when the object is created
    }

    //    constructs a Loan object with specific loan amount all other values are defaulted
    public LoanString(double loanAmount, String annualInterestRate) {

        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        noOfYears = 1;
        Date loanDate = new Date();  // date of when the object is created
    }

        public String getAnnualInterestRate() {
            return annualInterestRate;
        }
        public int getNoOfYears(){
            return noOfYears;
        }
        public double getLoanAmount(){
            return loanAmount;
        }
        public Date getLoanDate(){
            return loanDate;
        }

        public void setAnnualInterestRate(String annualInterestRate){

            //String pattern = "\d{1,2}.\d{1,2}%";  // make sure the input rate matches the allowed format

            this.annualInterestRate = annualInterestRate;
        }

        public void setNoOfYears(int noOfYears) {
            this.noOfYears = noOfYears;
        }
        public void setLoanAmount(double loanAmount){
            this.loanAmount = loanAmount;
        }
 //calculates monthly payment
        public double getMonthlyPayment(){
        	 String number;
        
        	 if(annualInterestRate.contains("%")) {    //removes the % sign to stop system from crashing
           	   annualInterestRate = annualInterestRate.replace("%", "");
              }
          
        	   
            double rate = Double.parseDouble(annualInterestRate);
            //System.out.println();
            double monthly = (((loanAmount * (rate/ 100)) + loanAmount) / noOfYears / 12);
            return monthly;
        }
 //calculates total payment
        public double getTotalPayment(){
        	if(annualInterestRate.contains("%")) {    //removes the % sign to stop system from crashing
          	   annualInterestRate = annualInterestRate.replace("%", "");
             }
            double rate = Double.parseDouble(annualInterestRate);
            return (loanAmount * (rate / 100)) + loanAmount;
        }

  // Prints the info of the loan and monthly payment amount
    public void printMonthly(double monthPayment) {
        double rate = Double.parseDouble(annualInterestRate);
        System.out.printf(" Monthly payment for a loan for %.2f , at %.2f for %d year is %.2f \n",
                loanAmount, rate, noOfYears, monthPayment);

    }

 // Prints the info of the loan and the total payment amount
    public void printTotal(double totalPayment) {

        System.out.printf(" Total payment for a loan for %.2f , at %s for %d year is %.2f\n",
        	
                loanAmount, annualInterestRate, noOfYears, totalPayment);

    }
    }


