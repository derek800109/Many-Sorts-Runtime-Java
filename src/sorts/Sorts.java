package sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Sorts<T> implements Comparator<T>, SortsInter{
	protected List<T> numbers;
	protected Integer[] arrayToSort;
	private long startTime;
	private long endTime;

	public Sorts(List<T> list) {
		this.numbers = new ArrayList<>(list);
		toSort();
		showTime();
	}
	
	public void setArrayToSort() {
		int size = numbers.size();
		arrayToSort = new Integer[size];
		
		for(int i = 0; i < size; i++)
			this.arrayToSort[i] = (Integer)numbers.get(i);
	}
	
	public void setNumbers(T[] numbers) {
		this.numbers.clear();
		for(int i = 0; i < numbers.length; i++)
			this.numbers.add(numbers[i]);
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	protected void swap(int i, int j){
		T temp = this.numbers.get(i);
		this.numbers.set(i, this.numbers.get(j));
		this.numbers.set(j, temp);
	}
	
	protected void start(){
		//System.out.println(this.toString() + " start running");
		this.startTime = System.currentTimeMillis();
	}
	
	protected void end(){
		this.endTime = System.currentTimeMillis();
		//System.out.println(this.toString() + " end running");
	}
	
	public void toSort(){
		System.out.println("Sorting in Sorts");
	}
	
	public void showTime(){
		System.out.println("The time of " + this.toString()
				+ " uses (" + (this.getEndTime() - this.getStartTime()) + ") miliseconds");
	}
	
	@Override
	public String toString() {
		return "Sorts";
	}
	
	protected T getMax() {
		T max = numbers.get(0);
		
		for(T number: numbers){
			if(compare(number, max) > 0)
				max = number;
		}
		
		return max;
	}

	public final void showSortedArray(){
		System.out.println(this.numbers);
	}
	
	public final void showReversedSortedArray(){
		List<T> reverse = new ArrayList<>(this.numbers);
		Collections.reverse(reverse);
		System.out.println(reverse);
	}

	@Override
	public int compare(T arg0, T arg1) {
		if(arg0.toString().length() > arg1.toString().length())
			return 1;
		else if(arg0.toString().length() < arg1.toString().length())
			return -1;
		else
			return arg0.toString().compareTo(arg1.toString());
	}
}
