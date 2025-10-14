import edu.bank.*;

public class prog5 {
    public static void main(String[] args) {
        Loan l1 = new HomeLoan();
        l1.getInterestRate(7.5);
        l1.calculateEMI(500000, 10);

        Loan l2 = new CarLoan();
        l2.getInterestRate(9.0);
        l2.calculateEMI(300000, 5);
    }
}
