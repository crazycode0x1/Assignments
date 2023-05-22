package AssignmentTask4;
import java.util.Arrays;
public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     

		int[] array = {1, 2, 4, 5, 6};
        int target = 6;

        findSumOfTwoElements(array, target);
    }

    public static void findSumOfTwoElements(int[] array, int target) {
        Arrays.sort(array); 

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == target) {
                System.out.println("The sum " + target + " is obtained by adding elements " + array[left] + " and " + array[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No two elements in the array sum up to " + target);
    }
}


