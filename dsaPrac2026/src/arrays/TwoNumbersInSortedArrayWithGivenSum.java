package arrays;

public class TwoNumbersInSortedArrayWithGivenSum {

	public static void main(String[] args) {
		int a[]= {1,2,7,8,10,12};
		int n=a.length;
		int sum=12;
		int l=0;
		int r=n-1;
		int index1=-1,index2=-1;
		while(l<r) {
			int curSum=a[l]+a[r];
			if (curSum<sum) {
				l++;
			}else if(curSum>sum) {
				r--;
			}else {
				index1=l;
				index2=r;
				break;
			}
		}
		System.out.println("index1 "+index1 +" index2 "+index2);

	}

}
