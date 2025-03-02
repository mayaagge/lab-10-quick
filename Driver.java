import java.util.Arrays;
public class Driver { 
  public static void main(String[] args) {
    /* Partition Test Cases 
    *  Test your code multiple times
    *  pivot_position = Quick.partition(yourArray, 0, yourArray.length - 1));
   */ 
    System.out.println("Testing pivot_position method: ");
    int[]arr=new int[]{5,1,7,2,4};
    int pivot_position = Quick.partition(arr, 0, arr.length - 1);
    System.out.println(pivot_position);
    int[]arr1=new int[]{5,1,7,8,4};
    int pivot_position1 = Quick.partition(arr1, 0, arr1.length - 1);
    System.out.println(pivot_position1);
    int[] arr2 = new int[]{3, 6, 2, 7, 5, 8, 4, 1};
    int pivot_position2 = Quick.partition(arr2,0,arr2.length-1);
    System.out.println(pivot_position2);
    System.out.println("------------------------------------");
    /* Quickselect Test Cases 
    *  Test your code multiple times
    *  k_element = Quick.quickSelect(yourArray, k);
   */ 
    System.out.println("Arr: " + Arrays.toString(arr));
    System.out.println("Arr1: " + Arrays.toString(arr1));
    System.out.println("Arr2: " + Arrays.toString(arr2));
    System.out.println("------------------------------------");
    System.out.println("Testing Quickselect method: ");
    int k_element = Quick.quickSelect(arr, 3);
    System.out.println("Expected 4 for arr: " + k_element);
    int k1_element = Quick.quickSelect(arr1, 2);
    System.out.println("Expected 4 for arr1: " + k1_element);
    int k2_element = Quick.quickSelect(arr2, 7);
    System.out.println("Expected 7 for arr2: " + k2_element);
    System.out.println("------------------------------------");
    /* QuickSort Test Cases 
    */
    System.out.println("Testing Quicksort method: ");
    Quick.quickSort(arr, 0, arr.length-1);
    System.out.println("Arr: " + Arrays.toString(arr));
    Quick.quickSort(arr1, 0, arr1.length-1);
    System.out.println("Arr1: " + Arrays.toString(arr1));
    Quick.quickSort(arr2, 0, arr2.length-1);
    System.out.println("Arr2: " + Arrays.toString(arr2));
    System.out.println("------------------------------------");
  }
} 
