package sorts;

import java.util.List;

public class CountingSort<T> extends Sorts<T>{
	private Integer[] finalSortedArray;
	private Integer[] temp;

	public CountingSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		if(!this.isNumber()){
			System.out.println("Numbes have to be integer.");
			return;
		}
		super.start();
		this.countingSort();
		super.end();
	}

	private void countingSort() {
		int size = super.numbers.size();
		int max = Integer.parseInt(super.getMax().toString()) + 1;
		finalSortedArray = new Integer[size];
		temp = new Integer[max + 1];
		
		super.setArrayToSort();
		initialArray(temp);
		initialArray(finalSortedArray);
		
		for(int i = 0; i < size; i++) {
			temp[arrayToSort[i]]++;
		}
		
		for(int i = 1; i <= max; i++)
			temp[i] += temp[i-1];
		
		for(int i = size - 1; i >= 0; i--)
			finalSortedArray[--temp[arrayToSort[i]]] = arrayToSort[i];
		
		super.setNumbers((T[])finalSortedArray);
	}
	private void initialArray(Integer[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = 0;
		}
	}
	
	private boolean isNumber(){
		for(T number: super.numbers)
			for(int i = 0; i < number.toString().length(); i++)
				if( number.toString().charAt(i) < '0' || number.toString().charAt(i) > '9')
					return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountingSort";
	}

}
