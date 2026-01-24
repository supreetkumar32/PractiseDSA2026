package arrays;

import java.util.Arrays;

public class ThreeNumbersWithGivenSum {

	public static void main(String[] args) {
        int[] a = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int n = a.length;

        Arrays.sort(a);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currSum = a[i] + a[left] + a[right];

                if (currSum == sum) {
                    System.out.println(
                        "Triplet found: " + a[i] + ", " + a[left] + ", " + a[right]
                    );
                    break;
                } else if (currSum < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
       
	}

}
