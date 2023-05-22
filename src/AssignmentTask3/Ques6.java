package AssignmentTask3;
import java.util.Scanner;
public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a do-while loop that asks the
		user to enter two numbers. The
		numbers should be added and the sum
		displayed. The loop should ask the
		user whether he or she wishes to
		perform the operation again. If so,
		the loop should repeat; otherwise it
		should terminate.
                              */
		 Scanner input = new Scanner(System.in);
	        int num1, num2, sum;
	        char repeat;

	        do {
	            System.out.print("Enter the first number: ");
	            num1 = input.nextInt();

	            System.out.print("Enter the second number: ");
	            num2 = input.nextInt();

	            sum = num1 + num2;
	            System.out.println("The sum is: " + sum);

	            System.out.print("Do you want to perform the operation again? (Y/N): ");
	            repeat = input.next().charAt(0);
	        } while (repeat == 'Y' || repeat == 'y');
	    }
	}
	





		
	
