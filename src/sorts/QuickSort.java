package sorts;

import java.util.List;

public class QuickSort<T> extends Sorts<T> {

	public QuickSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		super.start();
		this.quickSort(0,(super.numbers.size()-1));
		super.end();
	}

	private void quickSort(int low, int high) {
		if(super.numbers.isEmpty() || super.numbers.size() == 0)// in case there is nothing in he super.numbers
			return;
		if(low >= high)//wrong input 
			return;
		
		//pick the pivot
		int middle = low + (high - low)/2;
		T pivot = super.numbers.get(middle);
		
		//make left < pivot and right > pivot
		int i = low, j = high;//check from low to high
		while(i <= j){
			//for getting a T bigger than pivot or touch the pivot on higher side
			while(super.compare(super.numbers.get(i), pivot) < 0)
				i++;
			//for getting a T smaller than pivot or touch the pivot on lower side
			while(super.compare(super.numbers.get(j), pivot) > 0)//for 
				j--;
			
			if(i <= j)//when i == j, enter for breaking, when i < j,(there has T(s) not in order) enter for swap
				super.swap(i++, j--);
		}
		
		//recursively sort two sub parts
		if(low < j)
			this.quickSort(low, j);
		if(high > i)
			this.quickSort(i, high);
	}

	@Override
	public String toString() {
		return "QuickSort";
	}

}
