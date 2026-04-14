package Java_Bootcamp;

public class Payroll_project {
    static double calculateGross(double hours, double rate) {
        return rate * hours * 28;

    }

    static double calculateTax(double gross, double taxrate) {

        return (taxrate/100) * gross;

    }

    public static void printPayslip(String name, double hours, double rate, double gross, double tax, double net) {
        System.out.println("========================================");
        System.out.println("           OFFICIAL PAYSLIP             ");
        System.out.println("========================================");
        System.out.println("Employee: " + name);
        System.out.println("----------------------------------------");
        System.out.printf("Hours Worked:     %.1f hrs%n", hours);
        System.out.printf("Hourly Rate:      R%.2f%n", rate);
        System.out.printf("Gross Salary:     R%.2f%n", gross);
        System.out.println("----------------------------------------");
        System.out.printf("Deductions (Tax): R%.2f%n", tax);
        System.out.println("----------------------------------------");
        System.out.printf("NET SALARY:       R%.2f%n", net);
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        double gross = calculateGross(8,24);
        double tax = calculateTax(gross, 15);
        double net = gross - tax;

        printPayslip("Sibongakonke Buthelezi", 8, 24, gross, tax, net );


























    }






}
