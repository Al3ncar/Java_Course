public class twoSun {
    public static void main(String[] args) {
        int[] nu = {2, 7, 11, 15};
        System.out.println(TwoSum(nu, 17));
        System.out.println("R: [0, 3]");
        System.out.println("==================================================");
        System.out.println(" ");

        int[] nu2 = {3, 2, 4};
        System.out.println(TwoSum(nu2, 6));
        System.out.println("R: [1, 2]");
        System.out.println("==================================================");

        System.out.println(" ");
        int[] nu3 = {2, 4, 11, 3};
        System.out.println(TwoSum(nu3, 6));
        System.out.println("R: [0, 1]");
        System.out.println("==================================================");
        System.out.println(" ");

        int[] nu4 = {3, 3};
        System.out.println(TwoSum(nu4, 6));
        System.out.println("R: [0, 1]");
        System.out.println("==================================================");
        System.out.println(" ");

        int[] nu5 = {2, 5, 5, 11};
        System.out.println(TwoSum(nu5, 10));
        System.out.println("R: [1, 2]");
        System.out.println("==================================================");
        System.out.println(" ");

    }

    public static String TwoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return "[" + result[0] + ", " + result[1] + "]";

    }

}
