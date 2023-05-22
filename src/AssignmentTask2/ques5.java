package AssignmentTask2;

import java.util.Scanner;

public class ques5 {
	/*Write a program to assign the grade
on the basis of percentage
if the percentage is above 90,
assign grade A
if the percentage is above 75,
assign grade B
if the percentage is above 65,
assign grade C */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter percentage: ");
	        double percentage = scanner.nextDouble();
	        
	        char grade;
	        
	        if (percentage > 90) {
	            grade = 'A';
	            System.out.println("Grade: " + grade);
	        } else if (percentage > 75) {
	            grade = 'B';
	            System.out.println("Grade: " + grade);
	        } else if (percentage > 65) {
	            grade = 'C';
	            System.out.println("Grade: " + grade);
	        } else {
	            grade = 'D';
	            System.out.println("Grade: " + grade);
	        }
	        
	        //System.out.println("Grade: " + grade);
	}

}
