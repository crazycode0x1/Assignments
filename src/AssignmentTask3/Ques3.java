package AssignmentTask3;
import java .util.Scanner;
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to Check Palindrome.
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int num = scanner.nextInt();
	        scanner.close();

	        
	        boolean isPrime = checkPrime(num);

	       
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	    }

	    public static boolean checkPrime(int n) {
	       
	        if (n <= 1) {
	            return false;
	        }

	        
	        for (int i = 2; i <=Math.sqrt(n); i++) {
	        	
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}


