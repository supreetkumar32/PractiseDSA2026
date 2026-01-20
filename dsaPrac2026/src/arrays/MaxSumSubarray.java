package arrays;

public class MaxSumSubarray {

	public static void main(String[] args) {
		
		int a[] = {-11, -2, -3, -4, -2, -5, -6};

		int max = a[0];
		int sum = a[0];

		int start = 0, ansStart = 0, ansEnd = 0;

		for (int i = 1; i < a.length; i++) {
		    if (sum + a[i] < a[i]) {
		        sum = a[i];
		        start = i;
		    } else {
		        sum += a[i];
		    }

		    if (sum > max) {
		        max = sum;
		        ansStart = start;
		        ansEnd = i;
		    }
		}
        System.out.println(max);
        System.out.println(ansStart);
        System.out.println(ansEnd);
        
//		int nums[]= {-2,7,-6,4,1,-3,8};
//		int n=nums.length;
//        int maxSum = nums[0];
//        int currentSum = nums[0];
//
//        for (int i = 1; i < n; i++) {
//            currentSum = Math.max(nums[i], currentSum + nums[i]);
//            maxSum = Math.max(maxSum, currentSum);
//        }
//		
//        System.out.println(maxSum);

	}

}
