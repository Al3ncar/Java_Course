public class twoSun {

    public static void main(String[] args) {

        class Solution {
            public int[] twoSum(int[] nums, int target) {

                for (int i = 0; i < nums.length; i++) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] + nums[j] == target) {
                            return new int[]{i, j};
                        }
                    }
                }

                return new int[]{};
            }
        }

        Solution s = new Solution();

        int[] nu = {2, 7, 11, 15};
        s.twoSum(nu, 17);
        System.out.println("R: [0, 3]");
        System.out.println("==================================================");
        System.out.println(" ");

        int[] nu2 = {3, 2, 4};
        s.twoSum(nu2, 6);
        System.out.println("R: [1, 2]");
        System.out.println("==================================================");

        System.out.println(" ");
        int[] nu3 = {2, 4, 11, 3};
        s.twoSum(nu3, 6);
        System.out.println("R: [0, 1]");
        System.out.println("==================================================");
        System.out.println(" ");

        int[] nu4 = {3, 3};
        s.twoSum(nu4, 6);
        System.out.println("R: [0, 1]");
        System.out.println("==================================================");
        System.out.println(" ");

        int[] nu5 = {2,5,5,11};
        s.twoSum(nu5, 10);
        System.out.println("R: [1, 2]");
        System.out.println("==================================================");
        System.out.println(" ");

    }
}
