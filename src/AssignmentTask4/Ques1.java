package AssignmentTask4;
import java.util.Scanner;
public class Ques1 {

// array entered by the user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the size of the array");
int size=scanner.nextInt();
int []a=new int[size];
for(int i=0; i<size;i++) {
	System.out.print("Element " + (i + 1) + ": ");
	a[i]=scanner.nextInt();
	
}
System.out.println("array mentioned by the user is mentioned below");
for(int i=0;i<size;i++) {
	
	System.out.println(a[i]);
}
	}

}
