package sorts;

import java.util.List;

public class SelectionSort<T> extends Sorts<T>{

	public SelectionSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		super.start();
		this.selectionSort();
		super.end();
	}
	
	private void selectionSort(){
		int size = super.numbers.size();
		int k = 0;
		
		for(int i = 0; i < size; i++){
			k = i;
			for(int j = i+1; j < size; j++){
				if(compare(super.numbers.get(j), super.numbers.get(k)) < 0){
					k = j;
					super.swap(i, k);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "SelectionSort";
	}
	
	
}
