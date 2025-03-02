public class Quick {

  /* You must declare variables to track left and right indices,
   * in case your algorithm requires make comparissons with the 
   * original start and end indices.
   * Choose the pivot
   * Iterate over the array until left crosses right:
   *     While arr[left] ≤ pivot, move left forward
   *     While arr[left] > pivot, swap arr[left] with arr[right] and move right backward 
   * Once left ≥ right, swap the pivot (arr[0]) with arr[left].
  */
  public static int partition( int [] data, int start, int end){
    int rand = ((int) (Math.random()*(end-start+1)) + start);
    int pivot = data[rand]; 
    swap(data, rand, start);
    int left = start + 1;
    int right = end;

    while (left <= right) {
      while (left <= right && data[left] <= pivot ) {
        left++;
      }
      while (left<=right && data[right] > pivot) {
        right--;
      }
      if (left < right) {
        swap(data, left, right);
        left++;
        right--;
      }
    }
    swap(data, start, right);
    return right; 
  }
	
private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
	  
   /* QuickSelect Wrapper Method */
  public static int quickSelect(int[] data, int k) {
	return quickSelect(data, k, 0, data.length - 1);
  }
	
  /* QuickSelect method to find the k-th smallest element
  *  pivot = partition(data, start, end)
  *  if pivot > k - 1
  *    Recursive call to your QuickSelect - parameters: start=?, end=?
  *  else if pivot < k - 1
  *    Recursive call to your QuickSelect - parameters: start=?, end=?
  *  else
  *    Kth element found return  the value [k-1]
  */
  public static int quickSelect(int[] data, int k, int start, int end){
	  if (start==end){
		  return data[start];
	  }
	  int pivot = partition(data,start,end);
	  if (pivot == k-1){
		  return data[pivot];
	  }
	  else if (pivot > k-1){
		  return quickSelect(data, k, start, pivot-1);
	  }
	  else{
		  return quickSelect(data, k, pivot+1, end);
	  }
  }
  public static void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partition(data, start, end); 
            quickSort(data, start, pivot - 1); 
            quickSort(data, pivot + 1, end); 
	}
  }
}
