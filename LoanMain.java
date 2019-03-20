public class LoanMain {
    public static void main(String[] args){

Loan loanDef1 = new Loan();    //  loan with default values
        loanDef1.printMonthly(loanDef1.getMonthlyPayment()); //printing out loan info and monthly payment
        loanDef1.printTotal(loanDef1.getTotalPayment());  //printing out loan info and total payment

Loan loanDef2 = new Loan();   //  loan with default values

        loanDef2.printMonthly(loanDef2.getMonthlyPayment());    //printing out loan info and monthly payment
        loanDef2.printTotal(loanDef2.getTotalPayment());    //printing out loan info and total payment

Loan loan2k = new Loan(2000, 3.5);

        loan2k.printMonthly(loan2k.getMonthlyPayment());
        loan2k.printTotal(loan2k.getTotalPayment());

Loan loan3yrs = new Loan(3);

        loan3yrs.printMonthly(loan3yrs.getMonthlyPayment());
        loan3yrs.printTotal(loan3yrs.getTotalPayment());

//2 loans with default values by passing interest rate as a string
LoanString loanStringdef1 = new LoanString();
 
      loanStringdef1.printMonthly(loanStringdef1.getMonthlyPayment());    //printing out loan info and monthly payment
      loanStringdef1.printTotal(loanStringdef1.getTotalPayment());    //printing out loan info and total payment

   
LoanString loanStringdef2 = new LoanString();

        loanStringdef2.printMonthly(loanStringdef2.getMonthlyPayment());    //printing out loan info and monthly payment
        loanStringdef2.printTotal(loanStringdef2.getTotalPayment());    //printing out loan info and total payment

LoanString loanString2k = new LoanString(2000, "3.5%");
 
    loanString2k.printMonthly(loanString2k.getMonthlyPayment());    //printing out loan info and monthly payment
    loanString2k.printTotal(loanString2k.getTotalPayment());    //printing out loan info and total payment

    LoanString loanString3yrs = new LoanString(3);
    
    loanString3yrs.printMonthly(loanString3yrs.getMonthlyPayment());    //printing out loan info and monthly payment
    loanString3yrs.printTotal(loanString3yrs.getTotalPayment());    //printing out loan info and total payment






    }
}
