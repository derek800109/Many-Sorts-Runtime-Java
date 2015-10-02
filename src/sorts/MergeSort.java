package sorts;

import java.util.ArrayList;
import java.util.List;
/*
 * 1. left and right sub array compare and put a smaller element to the temp array
 * 2. put the rest of element(either from left or right side) to temp array
 * 3. put the element back from rightEnd during num
 * (hint: rightEnd is the end of a sub mergeSort)
 */
public class MergeSort<T> extends Sorts<T> {

	public MergeSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		super.start();
		this.mergeSort();
		super.end();
	}

	private void mergeSort() {
		ArrayList<T> temp = new ArrayList<>(this.numbers);
		this.mergeSort(temp, 0, this.numbers.size()-1);
	}

	private void mergeSort(ArrayList<T> temp, int left, int right) {
		if(left < right){
			int center = (left + right)/2;
			this.mergeSort(temp, left, center);
			this.mergeSort(temp, center+1, right);
			this.merge(temp, left, center+1, right);
		}
	}

	private void merge(ArrayList<T> temp, int left, int right, int rightEnd) {
		int leftEnd = right - 1;//the end od left sub array
		int k = left;
		int num = rightEnd - left + 1;//the length of writing back
		
		while(left <= leftEnd && right <= rightEnd){
			if(super.compare(super.numbers.get(left), super.numbers.get(right)) <= 0)
				temp.set(k++, super.numbers.get(left++));
			else
				temp.set(k++, super.numbers.get(right++));
		}
		while(left <= leftEnd)
			temp.set(k++, super.numbers.get(left++));
		while(right <= rightEnd)
			temp.set(k++, super.numbers.get(right++));
		
		for(int i = 0; i < num; i++, rightEnd--)
			super.numbers.set(rightEnd, temp.get(rightEnd));
			
	}

	@Override
	public String toString() {
		return "MergeSort";
	}

}
