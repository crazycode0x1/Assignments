package AssignmentTask2;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the electricity unit charges: ");
        int units = scanner.nextInt();
        
        double totalBill = 0.0;
        
        if (units <= 60) {
            totalBill = units * 0.30;
        } else if (units <= 150) {
            totalBill = 60 * 0.30 + (units - 60) * 0.75;
        } else if (units <= 270) {
            totalBill = 60 * 0.30 + 90 * 0.75 + (units - 150) * 1.10;
        } else {
            totalBill = 60 * 0.30 + 90 * 0.75 + 120 * 1.10 + (units - 270) * 2.50;
        }
        
        double surcharge = 0.20 * totalBill;
        double finalBill = totalBill + surcharge;
        
        System.out.println("Total Electricity Bill: " + finalBill);
        

	}

}
