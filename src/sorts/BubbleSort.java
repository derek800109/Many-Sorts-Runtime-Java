package sorts;

import java.util.List;

public class BubbleSort<T> extends Sorts<T>{
	
	public BubbleSort(List<T> list) {
		super(list);
	}

	@Override
	public void toSort() {
		super.start();
		this.bubbleSort();
		super.end();
	}
	
	public void bubbleSort(){
		boolean swapped = false;
		int size = super.numbers.size();
		
		for(int i = 0; i < size; i++){
			swapped = false;
			for(int j = size-1; j > i; j-- ){
				if(compare(super.numbers.get(j), super.numbers.get(j-1)) < 0){
					super.swap(j, j-1);
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
	}

	@Override
	public String toString() {
		return "BubbleSort";
	}
	
}
