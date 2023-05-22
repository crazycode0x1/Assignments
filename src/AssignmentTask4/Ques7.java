package AssignmentTask4;

import java.util.Arrays;
/*7.Write a program to remove the
duplicates from a sorted array,
change them into 0 and add 0 in the
*/
public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};

        int[] output = removeDuplicatesAndAddZeros(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(output));
    }

    public static int[] removeDuplicatesAndAddZeros(int[] input) {
        int n = input.length;
        int[] result = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (input[i] != input[i + 1]) {
                result[j] = input[i];
                j++;
            }
        }

        result[j] = input[n - 1];
        j++;

        while (j < n) {
            result[j] = 0;
            j++;
        }

        return result;

	}

}
