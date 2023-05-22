package AssignmentTask2;

import java.util.Scanner;

public class Ques1 {
public static void main(String[]args) {
//number is positive or negatvie
	Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is positive");
		}
		
	}
}

