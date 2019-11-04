
public class Insertion_Sort {
	    //DONE
 	    public Insertion_Sort( ) {
		
 	    }

		public execution doInsertionSort(int[] input){
			long startTime = System.nanoTime();
	    	long time = 0;
	    	int swap = 0;
	    	int comparisons = 0;
	        execution exec = new execution();
	        exec.setSortName("Insertion Sort");
	        int temp;
	        
	        for (int i = 1; i < input.length; i++) {
	        	
	            for(int j = i ; j > 0 ; j--){
	            	
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                    swap++;
	                    exec.setSwaps(swap);
	                    comparisons++;
		            	exec.setComparisons(comparisons);
	                   
	                }else {
	                	comparisons++;
		            	exec.setComparisons(comparisons);
	                }
	            }
	        }
	        time = System.nanoTime() - startTime;
            exec.setTime(time);
			return exec;
	    }
	    
	    
	   
}

