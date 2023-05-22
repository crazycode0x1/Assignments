package AssignmentTask2;
import java.util.Scanner;
public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Write a program in JAVA to break and
		continue if the following cases
		occur:
		If the user enters a negative number
		just break the loop and print “It’s
		Over”
		If the user enters a positive number
		just continue in the loop and print
		“Good Going”  */
		
Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                System.out.println("It's Over");
                break;
            } else if (number > 0) {
                System.out.println("Good Going");
                continue;
            } else {
                // Do nothing for zero input
            }
        }
        
		
	}

}
