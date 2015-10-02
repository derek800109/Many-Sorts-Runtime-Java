package sorts;

import java.util.List;

public class InsertionSort<T> extends Sorts<T>{
	public InsertionSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		// TODO Auto-generated method stub
		super.start();
		this.insertionSort();
		super.end();
	}
	
	public void insertionSort(){
		int size = super.numbers.size();
		
		for(int i = 1; i < size; i++){
			for(int k = i; k > 0 && compare(super.numbers.get(k), super.numbers.get(k-1)) < 0; k--){
				super.swap(k, k-1);
			}
		}
	}

	@Override
	public String toString() {
		return "InsertionSort";
	}
}
