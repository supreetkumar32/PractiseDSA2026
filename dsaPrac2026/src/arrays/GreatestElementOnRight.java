package arrays;

public class GreatestElementOnRight {

    public static void replaceElements(int[] arr) {
        int maxRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, current);
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        replaceElements(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
