package algorithm.selection_sort;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    int[] testArray = {1, 5, 7, 2, 10, 6};

    Solution solution = new Solution();
    int[] result = solution.selectionSort(testArray);

    System.out.println("정렬된 값: " + Arrays.toString(result));
  }

  private int[] selectionSort(int[] arr) {
    int minIndex;
    int temp;

    for (int i = 0; i < arr.length - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      // 4. swap(arr[indexMin], arr[i])
      temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }


    return arr;

  }
  
}
