package AssignmentTask2;

import java.util.Scanner;

public class Ques2 {
public static void main(String[]args) {
	//check wheteher the char is alphabet or not
	char ch;
	System.out.println("enter the input");
	Scanner sc=new Scanner(System.in);
      ch=sc.nextLine().charAt(0);
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
          System.out.println(ch + " is an alphabet.");
      } else {
          System.out.println(ch + " is not an alphabet.");
      }
}
}
