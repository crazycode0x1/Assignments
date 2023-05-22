package AssignmentTask4;
import java.util.Arrays;
import java.util.Scanner;
public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a1=new int[3];
         int[]a2=new int[3];
		Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st array");
for(int i=0;i<a1.length;i++) {
a1[i]=sc.nextInt();
}
System.out.println("Enter 2nd array");
for(int i=0;i<a2.length;i++) {
a2[i]=sc.nextInt();
}
if(a1.length!=a2.length) {
	System.out.println("Arrays are not same");
	
}
else {
	Arrays.sort(a1);
	Arrays.sort(a2);
	for(int i=0;i<a1.length;i++) {
		if(a1[i]==a2[i]) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
			
		}
		
	}
}

	}


