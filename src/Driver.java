import java.util.Random;
import java.util.Scanner;

public class Driver {
	
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		
			execution [] executionArray = new execution[6];
			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Enter in an array size");
				int size = scanner.nextInt();
				int selection = listSelector();
				int[] arr = generateArray(selection , size);
				
				executionArray[0] = insertionSort(arr);
				executionArray[1] = selectionSort(arr);
				executionArray[2] = heapSort(arr);
				executionArray[3] = radixSort(arr);
				executionArray[4] = selectionSort(arr);
				executionArray[5] = quickSort(arr);

				  compareValue(executionArray);
 				
				
				System.out.println("Do you want to quit , 1 for yes 2 for no ");
				int input = scanner.nextInt();
 				if(input == 1) {
					exit = true;
				}
			}
			
			System.out.println("Goodbye");
			scanner.close();

		}
		
		public static void compareValue (execution[] executions) {
			
			execution max = executions[0]; 
 			for(int i = 0 ; i < 6 ; i++) {
 				if(i == 0) {
 					
 					max = executions[i];
 					
 				}
 				else if(max.time > executions[i].time) {
 						max = executions[i];
 				}
 				else if(max.time == executions[i].time) {
 					if(max.swaps > executions[i].swaps) {
 						max = executions[i];
 					}
 					else if(max.swaps == executions[i].swaps) {
 						if(max.comparisons > executions[i].comparisons) {
 							max = executions[i];
 						}
 					}
 				}
 			}
			
			String winner = max.getSortName();
 			System.out.println("The winner is " + winner);
 			
			
			
			
		}
		
		public static execution heapSort(int[] array) {
			execution heapExecution = new execution();
			int size = array.length;
			int[] heapArray = new int[size];
			heapArray = array;
			Heap_Sort heapSort = new Heap_Sort();
			heapExecution = heapSort.doSort(heapArray);
			System.out.println("HEAP SWAP");
			int heapSwaps = heapExecution.getSwaps();
			long heapTime = heapExecution.getTime();
			int heapComparison = heapExecution.getComparisons();
			
			System.out.println("The swap count is " + heapSwaps );
			System.out.println("The time is  " + heapTime );
			System.out.println("the comparison count is" + heapComparison);
			return heapExecution;
		}
		
		public static execution radixSort(int[] array) {
			
			int size = array.length;
			int[] radixArray = new int[size];
			
			radixArray = array;
			execution radixExecution = new execution();
			Radix_Sort radixSort = new Radix_Sort();
			radixExecution = radixSort.doSort(radixArray);
			System.out.println("RADIX SWAP");
			int radixSwaps = radixExecution.getSwaps();
			long radixTime = radixExecution.getTime();
			int radixComparison = radixExecution.getComparisons();
			
			System.out.println("The swap count is " + radixSwaps );
			System.out.println("The time is  " + radixTime );
			System.out.println("the comparison count is" + radixComparison);
			return radixExecution;
			
			
		}
		
		public static execution mergeSort(int[] array) {
			int size = array.length;
			int[] mergeArray = new int[size];
			
			mergeArray = array;
			execution mergeExecution = new execution();
			Merge_Sort mergeSort = new Merge_Sort();
			mergeExecution = mergeSort.doSort(mergeArray);
			int mergeSwaps = mergeExecution.getSwaps();
			long mergeTime = mergeExecution.getTime();
			int mergeComparison = mergeExecution.getComparisons();
			System.out.println("MERGE SWAP");
			System.out.println("The swap count is " + mergeSwaps );
			System.out.println("The time is  " + mergeTime );
			System.out.println("the comparison count is" + mergeComparison);
			return mergeExecution;
			
		}
		
		public static execution insertionSort(int[] array){
			System.out.println("INSERTION SWAP");
			int size = array.length;
			int[] insertionArray = new int[size];
			
			insertionArray = array;
 			Insertion_Sort insertionSort = new Insertion_Sort();
			execution insertionExecution = new execution();
			insertionExecution = insertionSort.doInsertionSort(insertionArray);
			int insertionSwaps = insertionExecution.getSwaps();
			long insertionTime = insertionExecution.getTime();
			int insertionComparison = insertionExecution.getComparisons();
			
			System.out.println("The swap count is " + insertionSwaps );
			System.out.println("The time is  " + insertionTime );
			System.out.println("the comparison count is" + insertionComparison);
			
			return insertionExecution;
			
		}
		
		public static execution selectionSort(int[] array) {
			System.out.println("SELECTION SWAP");
			int size = array.length;
			int[] selectionArray = new int[size];
			
			selectionArray = array;

			Selection_Sort selectionSort = new Selection_Sort();
			execution selectionexecution = new execution();
			selectionexecution = selectionSort.doSort(selectionArray);
			int selectionSwaps = selectionexecution.getSwaps();
			int selectionComparissons = selectionexecution.getComparisons();
			long selectionTime = selectionexecution.getTime();
			
			System.out.println("The swap count is " + selectionSwaps );
			System.out.println("The time is  " + selectionTime );
			System.out.println("The comparisson count is " + selectionComparissons );
 			
			
			return selectionexecution;
		}

		public static execution quickSort(int[] array) {
			int size = array.length;
			int[] quickArray = new int[size];
			
			quickArray = array;
			execution quickExecution = new execution();
			Quick_Sort quickSort = new Quick_Sort();
			quickExecution = quickSort.doSort(quickArray);
			System.out.println("QUICK SWAP");
			int quickSwaps = quickExecution.getSwaps();
			long quickTime = quickExecution.getTime();
			int quickComparison = quickExecution.getComparisons();
			
			System.out.println("The swap count is " + quickSwaps );
			System.out.println("The time is  " + quickTime );
			System.out.println("the comparison count is" + quickComparison);
			return quickExecution;
		}

		public static int[] generateArray(int input, int arraySize) {
 			Random rand = new Random();
			int[] array = new int[arraySize];
			if(input == 1) {
				for(int i = 0 ; i < array.length ; i++) {
					array[i] = i;
				}
		 
			}
			
			else if(input == 2) {
				for(int i = array.length ; i > 0 ; i--) {
					 int j = array.length - i;
					 array[j] = i;  
					
				}
				
				 
			}
			
			else if(input == 3) {
				for(int i = 0 ; i < array.length ; i++) {
					if ( i < (array.length/2)-1) {
						array[i] = i ;
					}
					else {
						
						int randomNum = 0 + rand.nextInt((5000 - 0) + 1);
						array[i] = randomNum;
						
					}
				}
				
			}
			else if(input == 4) {
				for(int i = array.length-1 ; i > 0 ; i--) {
					int randomNum = 0 + rand.nextInt((5000 - 0) + 1);

					array[i] = randomNum ;
				}
			}
			else {
				System.out.println("Invalid selection)");
				System.exit(0);
			}
			
			
			return array;
			
		}

		public static int listSelector() {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Press 1 for Inorder list\n"
					+ "Press 2 for ReverseOrder list\n"
					+ "Press 3 for AlmostOrder list\n"
					+ "Press 4 for RandomOrder list\n" );
			int userinput =input.nextInt();
			
			return userinput;
			
			}
			
		
			
			
			 
			
		
		
		
		
}
