package arrays;

public class FindConsecutive1 {

	public static void main(String[] args) {
		 int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
		   int maxCount = 0;
	       int currentCount = 0;

	        for (int num : arr) {
	            if (num == 1) {
	                currentCount++;
	                maxCount = Math.max(maxCount, currentCount);
	            } else {
	                currentCount = 0;
	            }
	        }

	        System.out.println(maxCount);

	}

}
