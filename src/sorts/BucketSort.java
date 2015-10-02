package sorts;

import java.util.List;

public class BucketSort<T> extends Sorts<T> {

	public BucketSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		super.start();
		this.bucketSort();
		super.end();
	}

	private void bucketSort() {
		int max = Integer.parseInt(super.getMax().toString());
		Integer[] bucket = new Integer[max+1];
		super.setArrayToSort();
		
		for(int i = 0; i < bucket.length; i++)
			bucket[i] = 0;
		
		for(int i = 0; i < arrayToSort.length; i++)
			bucket[arrayToSort[i]]++;
		
		int outPos = 0;
		for(int i = 0; i < bucket.length; i++)
			//bucket[i] == 0, there is no value
			//bucket[i] == n, there is N value conflict
			for(int j = 0; j < bucket[i]; j++)
				arrayToSort[outPos++] = i;
		
		super.setNumbers((T[])arrayToSort);
	}
	
	@Override
	public String toString() {
		return "BucketSort";
	}
}
