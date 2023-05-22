package AssignmentTask2;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder); 

	}

}
