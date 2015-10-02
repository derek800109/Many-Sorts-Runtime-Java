package sorts;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class RadixSort<T> extends Sorts<T> {
	private static final int LAYERS = 10;

	public RadixSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		super.start();
		this.radixSort();
		super.end();
	}

	private void radixSort() {
		int size = super.numbers.size();
		super.setArrayToSort();
		Queue[] buckets = new Queue[LAYERS];
		
		for(int i = 0; i < LAYERS; i++)
			buckets[i] = new LinkedList();
		
		boolean flag = true;
		int divisor = 1, hashIndex = 0, it = 0;
		Integer ival = 0;
		while(flag){
			flag = false;
			
			for(int i = 0; i < arrayToSort.length; i++){
				hashIndex = (arrayToSort[i]/divisor) % LAYERS;
				if(hashIndex > 0)
					flag = true;
				buckets[hashIndex].add(new Integer(arrayToSort[i]));//use digital in ones to sort the category
			}
			
			divisor *= LAYERS;
			
			it = 0;
			for(int j = 0; j < LAYERS; j++){
				while(!buckets[j].isEmpty()){
					ival = (Integer)buckets[j].poll();
					arrayToSort[it++] = ival.intValue();
				}
			}
		}
		
		super.setNumbers((T[])arrayToSort);
	}

	@Override
	public String toString() {
		return "RadixSort";
	}

}
