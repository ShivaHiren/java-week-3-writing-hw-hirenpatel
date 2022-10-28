package week3writinghw;

import java.util.Scanner;

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        //Scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your EmployeeID:  ");
        int employeeID = scanner.nextInt();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
                //Calculating HRA, DA, TA, and PF
        double hRa = calculatorHRA(basicSalary);
        double da = calculatorDA(basicSalary);
        double ta = calculatorTA(basicSalary);
        double pf = calculatorPF(basicSalary);
    // Calculating the gross salary
        double grossSalary = basicSalary + hRa + da + ta - pf;
        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeID + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + hRa + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
    }
    //Calculating HRA
    public static double calculatorHRA(double basicSalary){
        return (basicSalary*10/100);
    }
    //Calculating DA
    public static double calculatorDA(double basicSalary){
      return (basicSalary*8/100);
    }
    //Calculating TA
    public static double calculatorTA(double basicSalary){
        return (basicSalary*9/100);
    }
    //Calculating PF
    public static double calculatorPF(double basicSalary){
        return (basicSalary * 20/100);
    }


}
