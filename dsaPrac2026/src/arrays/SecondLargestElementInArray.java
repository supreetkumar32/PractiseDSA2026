package arrays;

public class SecondLargestElementInArray {
	public static void main (String[] args) {

	   int nums[]= {3, 3, 6, 1,-1,99,99,8,45,67,7};
	   int n=nums.length;
	   int largest=nums[0];
	   int secondlargest=Integer.MIN_VALUE;
	   for(int i=1;i<n;i++) {
		   if(nums[i]>largest ) {
			   secondlargest=largest;
			   largest=nums[i];
		   }else if(nums[i]<largest && nums[i]>secondlargest) {
			   secondlargest=nums[i];
		   }
	   }
	   
	   System.out.println("largest "+largest);
	   System.out.println("second largest "+secondlargest);

}
}
