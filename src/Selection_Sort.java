
public class Selection_Sort {
	
	//DONE
	
	public execution doSort(int arr[])
    {
		
        int n = arr.length;
        long starttime = System.nanoTime();
        execution exec = new execution();
        exec.setSortName("Selection Sort");
     	long time = 0;
    	int swap = 0;
    	int comparisons = 0;
    	
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                    comparisons++;
                    exec.setComparisons(comparisons);
            }
                else {
                	 comparisons++;
                     exec.setComparisons(comparisons);
                }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            swap++;
            exec.setSwaps(swap);
        }
        
        time = System.nanoTime()-starttime;
        exec.setTime(time);
		return exec;
		
    }
}
