package arrays;

public class InsertAnElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4};
		int index = 2;
		int value = 3;

		int[] newArr = new int[arr.length + 1];

		for (int i = 0, j = 0; i < newArr.length; i++) {
		    if (i == index) {
		        newArr[i] = value;
		    } else {
		        newArr[i] = arr[j];
		        j++;
		    }
		}
		for(int x:newArr) {
			System.out.print(x+" ");
		}

	}

}
