package arrays;

//in an array a[],find the maximun j-i such that a[j]>a[i]
public class findMaxjminusi {

	public static void main(String[] args) {
		 int[] a = {5,4,1,7,2,8,6,3,4};
		 int n = a.length;
		 
		 //brute force
//	       int maxDiff = -1;
//
//	        for (int i = 0; i < n; i++) {
//	            for (int j = n - 1; j > i; j--) {
//	                if (a[j] > a[i]) {
//	                    maxDiff = Math.max(maxDiff, j - i);   
//	                }
//	            }
//	        }
//	        System.out.println("maxDiff is :"+maxDiff);
		 
		 //optimise 
		 int[] LMin = new int[n];
	        int[] RMax = new int[n];

	        LMin[0] = a[0];
	        for (int i = 1; i < n; i++) {
	            LMin[i] = Math.min(a[i], LMin[i - 1]);
	        }

	        RMax[n - 1] = a[n - 1];
	        for (int j = n - 2; j >= 0; j--) {
	            RMax[j] = Math.max(a[j], RMax[j + 1]);
	        }
	        
	        //RMax = {8, 8, 8, 8, 8, 8, 6, 4, 4}
	       //          j
	        // LMin = {5, 4, 1, 1, 1, 1, 1, 1, 1}
            //          i
	        int i = 0, j = 0;
	        int maxDiff = -1;
	        int ansI = -1, ansJ = -1;

	        while (i < n && j < n) {
	            if (LMin[i] < RMax[j]) {
	                if (j - i > maxDiff) {
	                    maxDiff = j - i;
	                    ansI = i;
	                    ansJ = j;
	                }
	                j++;
	            } else {
	                i++;
	            }
	        }
	        System.out.print("maxDiff "+maxDiff);
	        
	        
	        //more optimised
//	        int minVal = a[0];
//	        int maxDiff = -1;
//
//	        for (int j = 1; j < a.length; j++) {
//
//	            if (a[j] > minVal) {
//	                int diff = j - indexOfMin; 
//	                maxDiff = Math.max(maxDiff, diff);
//	            }
//
//	            if (a[j] < minVal) {
//	                minVal = a[j];
//	            }
//	        }
//	        System.out.print("maxDiff "+maxDiff);
		 
	}

}
