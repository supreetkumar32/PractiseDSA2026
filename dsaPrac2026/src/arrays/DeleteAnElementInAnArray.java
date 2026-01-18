package arrays;

public class DeleteAnElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		int index = 2; // delete element 3
		int n = arr.length; // logical size

		for (int i = index; i < n - 1; i++) {
		    arr[i] = arr[i + 1];
		}
		n--;
		
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
