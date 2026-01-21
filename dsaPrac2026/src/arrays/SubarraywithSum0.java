package arrays;

import java.util.HashSet;
import java.util.*;

public class SubarraywithSum0 {

	public static void main(String[] args) {
		int[] a = {4, 2, -3, 1, 6};
		  int n = a.length;
		  
		  //optimal solution
//		  HashSet<Integer> hs=new HashSet<>();
//		  int sum=0;
//		  for(int i=0;i<n;i++) {
//			  sum+=a[i];
//			  if(hs.contains(sum)) {
//				  System.out.println("Present");
//				  break;
//			  }
//			  hs.add(sum);
//
//		  }

		  //tracing the index also
	        Map<Integer, Integer> map = new HashMap<>();
	        int prefixSum = 0;

	        for (int i = 0; i < a.length; i++) {
	            prefixSum += a[i];

	            // Case 1: sum from 0 to i is zero
	            if (prefixSum == 0) {
	                System.out.println("Subarray found from index 0 to " + i);
	                return;
	            }

	            // Case 2: prefix sum repeated
	            if (map.containsKey(prefixSum)) {
	                int start = map.get(prefixSum) + 1;
	                int end = i;
	                System.out.println("Subarray found from index " + start + " to " + end);
	                return;
	            }

	            // Store prefix sum with index
	            map.put(prefixSum, i);
	        }

	        System.out.println("No subarray with sum 0 found");
		  //brute force
//	        for (int i = 0; i < n; i++) {
//	            int sum = 0;
//	            
//	            for (int j = i; j < n; j++) {
//	                sum += arr[j];
//
//	                if (sum == 0) {
//	                    System.out.println("Subarray with sum 0 found from index " + i + " to " + j);
//	                    return;
//	                }
//	            }
//	        }

	}

}
