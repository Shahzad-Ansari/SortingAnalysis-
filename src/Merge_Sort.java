
public class Merge_Sort {
	 //DONE
    private int[] array;
    private int[] tempMergArr;
    private int length;
    
    execution exec = new execution();
    long startTime = System.nanoTime();
 	long time = 0;
 	int swap = 0;
 	int comparisons = 0;
     
    public execution doSort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        time = System.nanoTime() - startTime;
        exec.setTime(time);
        comparisons = (int) ((Math.log(length)/Math.log(2)) - (Math.pow(2, (Math.log(length)/Math.log(2))))+1);
        exec.setComparisons(comparisons);
        exec.setSwaps(swap);
        return exec;
        
    }
    
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
        	
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
