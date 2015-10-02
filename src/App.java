import java.util.ArrayList;
import java.util.List;

import sorts.*;


class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		addAll(list);
		
		Sorts<Integer> numbers1 = new BubbleSort(list);
		Sorts<Integer> numbers2 = new InsertionSort<>(list);
		Sorts<Integer> numbers3 = new SelectionSort<>(list);
		Sorts<Integer> numbers4 = new ShellSort<>(list);
		Sorts<Integer> numbers5 = new MergeSort<>(list);
		Sorts<Integer> numbers6 = new HeapSort<>(list);
		Sorts<Integer> numbers7 = new QuickSort<>(list);
		Sorts<Integer> numbers8 = new CombSort<>(list);
		Sorts<Integer> numbers9 = new CountingSort<>(list);
		Sorts<Integer> numbers10 = new BucketSort<>(list);
		Sorts<Integer> numbers11 = new RadixSort<>(list);
		//numbers11.showSortedArray();
		//numbers.showReversedSortedArray();
		//numbers11.showTime();
		
	}
	
	public static void addAll(List<Integer> list){
		/*
		Integer[] numbers = {34,34,56,78,90,87,65,5,43,34,5,6765,123,0,2343,6765,11321,22,12,21,78};
		for(Integer number: numbers){
			list.add(number);
		}
		*/
		
		for(int i = 200; i >= 0; i--){
			list.add(i);
		}
		
	}

}
