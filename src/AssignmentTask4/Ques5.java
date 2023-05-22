package AssignmentTask4;
//Write a Java program to add two
//matrices of the same size.
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = input.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int columns = input.nextInt();

	        int[][] matrix1 = new int[rows][columns];
	        int[][] matrix2 = new int[rows][columns];
	        int[][] sumMatrix = new int[rows][columns];

	        System.out.println("Enter the elements of the first matrix:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Element at position (" + i + ", " + j + "): ");
	                matrix1[i][j] = input.nextInt();
	            }
	        }

	        System.out.println("Enter the elements of the second matrix:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Element at position (" + i + ", " + j + "): ");
	                matrix2[i][j] = input.nextInt();
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        System.out.println("The sum of the matrices is:");

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(sumMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
