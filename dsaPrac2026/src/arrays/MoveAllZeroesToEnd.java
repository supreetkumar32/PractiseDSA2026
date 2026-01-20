package arrays;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int[] arr = {8, 0, 1, 3, 0, 0, 5};
		int pos = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        // Fill remaining positions with zero
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
