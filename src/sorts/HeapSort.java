package sorts;

import java.util.ArrayList;
import java.util.List;

public class HeapSort<T> extends Sorts {
	private int n;

	public HeapSort(List list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toSort() {
		super.start();
		this.heapSort();
		super.end();
	}

	private void heapSort() {
		this.buildHeap();
		
		for(int i = n; i > 0; i--){
			super.swap(0, i);//0 is the biggest one but we don't know the i
			this.n--;
			this.maxHeap(0);
		}
		
	}

	private void buildHeap() {
		this.n = super.numbers.size() - 1;
		
		for(int i = n/2; i >= 0; i--)//n/2 -- second floor from the buttom
			this.maxHeap(i);
	}

	private void maxHeap(int i) {
		int left = 2*i;//i's left child
		int right = 2 * i + 1;//i's right child
		int largest = 0;
		
		if(left < n && super.compare(super.numbers.get(left), super.numbers.get(i)) > 0)//left > i
			largest = left;
		else
			largest = i;
		
		if(right <= n && super.compare(super.numbers.get(right), super.numbers.get(largest)) > 0)
			largest = right;
		if(largest != i){
			super.swap(i, largest);
			this.maxHeap(largest);
		}
	}

	@Override
	public String toString() {
		return "HeapSort";
	}

}
