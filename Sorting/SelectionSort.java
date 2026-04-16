import java.util.*;
public class SelectionSort {
    public void sort(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            int minIndex = i;
            for(int j = i + 1; j < size; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < size; index++) {
            arr[index] = input.nextInt();
        }
        SelectionSort object = new SelectionSort();
        object.sort(arr, size);
        object.printArray(arr);
        input.close();
    }
}

// Approach: Selection Sort(Select the smallest element and put it in front)
// Time Complexity: O(n^2)
// Space Complexity: O(1)
