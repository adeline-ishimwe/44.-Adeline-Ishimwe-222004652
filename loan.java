public class loan {
    private double principal;
    private double annualRate;
    private int years;
    private int monthsPerYear;

    public loan(double principal, double annualRate, int years, int monthsPerYear) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
        this.monthsPerYear = monthsPerYear;
    }

    public double calculateTotalPayment() {
        double monthlyRate = (annualRate / 100) / monthsPerYear;
        int totalPayments = years * monthsPerYear;
        double totalPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) / (Math.pow(1 + monthlyRate, totalPayments) - 1);
        return totalPayment;
    }

    public static void main(String[] args) {
        double principal = 500000.0; // Loan amount
        double annualRate = 18.0;   // Annual interest rate (18%)
        int years = 3;              // Number of years
        int monthsPerYear = 12;     // Monthly compounding

        loan loan = new loan(principal, annualRate, years, monthsPerYear);
        double totalPayment = loan.calculateTotalPayment();

        System.out.println("Total Payment after " + years + " years with compound interest: " + totalPayment + " RWF");
    }
}
