public class Driver { 
  public static void main(String[] args) {
    int[]arr=new int[]{5,1,7,2,4};
    int pivot_position = Quick.partition(arr, 0, arr.length - 1);
    System.out.println(pivot_position);
    int[]arr=new int[]{5,1,7,8,4};
    int pivot_position = Quick.partition(arr, 0, arr.length - 1);
    System.out.println(pivot_position);
    /* Partition Test Cases 
    *  Test your code multiple times
    *  pivot_position = Quick.partition(yourArray, 0, yourArray.length - 1));
   */ 
    
    /* Quickselect Test Cases 
    *  Test your code multiple times
    *  k_element = Quick.quickSelect(yourArray, k);
   */ 
    
  }
} 
