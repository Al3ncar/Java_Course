public class Main {
    public static void main(String[] args) {
        class Solution {
            public int[] resultArray(int[] nums) {
                int[] result = new int[nums.length];
                int[] arr1 = new int[nums.length];
                int[] arr2 = new int[nums.length];

                arr1[0] = nums[0];
                arr2[0] = nums[1];


                int indexArr1 = 0;
                int indexArr2 = 0;

                for (int i = 0; i < nums.length; i++) {
                    int nextValue = i + 2;
                    if (nextValue == nums.length) break;

                    System.out.println("arr1: " + arr1[indexArr1]);
                    System.out.println("arr2: " + arr2[indexArr2]);

                    if (arr1[indexArr1] > arr2[indexArr2]) {
                        arr1[indexArr1 + 1] = nums[nextValue];
                        indexArr1++;
                    } else {
                        arr2[indexArr2 + 1] = nums[nextValue];
                        indexArr2++;
                    }

                }

                int idx = 0;

                for(int n : arr1) {
                    if (n == 0) break;
                    result[idx++] = n;
                }
                for(int n : arr2) {
                    if (n == 0) break;
                    result[idx++] = n;
                }   ""

                for (int n : result) {
                    System.out.print(n + ", ");
                }

//                for (int j = 0; j < result.length; j++) {
//                    result[j] = nums[j];
//                    if(arr1[j] == 0) continue;
//
//                    if()q
//                }


//
//                for (int i = 0; i < nums.length; i++) {
//                    result[i] = arr1[i];
//                }
//
//                for (int i = 0; i < arr2.length; i++) {
//                    result[arr1.length - arr2.length] = arr2[i];
//                }
//
//                System.out.println("res " + arr1.length - arr2.length);
//                for (int n : result) {
//                    System.out.print(n + ", ");
//                }
//

                return result;
            }
        }

        Solution s = new Solution();

        int[] vect = {2, 1, 3};
        s.resultArray(vect);
        System.out.println(" ");
        System.out.println("---------------------------------");
        int[] vect2 = {5, 4, 3, 8};
        s.resultArray(vect2);
    }
}
