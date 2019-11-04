
public class execution {
	
	long time;
	int swaps;
	int comparisons;
	String sortName;
	
	public execution(long time, int swaps, int comparisons) {
 		this.time = time;
		this.swaps = swaps;
		this.comparisons = comparisons;
		
	}

	
	public execution() {
		
	}
	
	public int getComparisons(){
		return comparisons; 
	}
	
	public void setComparisons(int comparisons) {
		this.comparisons = comparisons; 
	}
	
	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getSwaps() {
		return swaps;
	}

	public void setSwaps(int swaps) {
		this.swaps = swaps;
	}
	
	public String getSortName() {
		return sortName;
	}
	
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}


	public String print() {
		return "the winning alogrithim is :" + sortName +  " [time=" + time + ", swaps=" + swaps + ", comparisons=" + comparisons +  "]";
	}
	

	
	

}
