public class simpleInterest {
        private double principal;
        private double annualRate;
        private int years;
    
        public simpleInterest(double principal, double annualRate, int years) {
            this.principal = principal;
            this.annualRate = annualRate;
            this.years = years;
        }
    
        public double calculateSimpleInterest() {
            double simpleInterest = (principal * annualRate * years) / 100;
            return simpleInterest;
        }
    
        public static void main(String[] args) {
            double principal = 100000.0; // Initial deposit amount
            double annualRate = 5.0;   // Annual interest rate (5%)
            int years = 5;             // Number of years
    
            simpleInterest deposit = new simpleInterest(principal, annualRate, years);
            double simpleInterest = deposit.calculateSimpleInterest();
    
            System.out.println("Simple Interest after " + years + " years: " + simpleInterest + " RWF");
        }
    }

