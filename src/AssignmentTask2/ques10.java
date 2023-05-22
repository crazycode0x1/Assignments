package AssignmentTask2;
import java.util.Scanner;
public class ques10 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program to input basic
salary of an employee and calculate
its Gross salary according to
following:
Basic Salary <= 15000 : HRA = 25%,
DA = 82%
Basic Salary <= 20200 : HRA = 27%,
DA = 90%
Basic Salary > 20200 : HRA = 36%, DA
= 95%
*/
	   
    System.out.print("Enter the basic salary: ");
    Scanner scanner=new Scanner(System.in);
    double basicSalary = scanner.nextDouble();
    
    double hra = 0.0;
    double da = 0.0;
    
    if (basicSalary <= 15000) {
        hra = 0.25 * basicSalary;
        da = 0.82 * basicSalary;
    } else if (basicSalary <= 20200) {
        hra = 0.27 * basicSalary;
        da = 0.90 * basicSalary;
    } else {
        hra = 0.36 * basicSalary;
        da = 0.95 * basicSalary;
    }
    
    double grossSalary = basicSalary + hra + da;
    
    System.out.println("Gross Salary: " + grossSalary);
		
	}

}
