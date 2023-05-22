package AssignmentTask4;

public class Ques9 {
	public static int[] findTwoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {1, 4, 10, -3};
	        int target = 14;

	        int[] indices = findTwoSum(nums, target);
	        if (indices[0] == 0 && indices[1] == 0) {
	            System.out.println("No solution found.");
	        } else {
	            System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
	        }
	}

}
