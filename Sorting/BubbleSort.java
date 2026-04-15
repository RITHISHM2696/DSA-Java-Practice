import java.util.*;
public class BubbleSort {
    public void sort(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < size; index++) {
            arr[index] = input.nextInt();
        }
        BubbleSort object = new BubbleSort();
        object.sort(arr, size);
    }
}

// Approach: Bubble Sort(Compare adjacent element and swap them if needed)
// Time Complexity: O(n^2)
// Space Complexity: O(1)
