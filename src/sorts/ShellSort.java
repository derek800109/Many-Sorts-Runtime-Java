package sorts;

import java.util.List;

public class ShellSort<T> extends Sorts<T>{

	public ShellSort(List<T> list) {
		super(list);
	}

	@Override
	public void toSort() {
		super.start();
		this.shellSort();
		super.end();
	}
	
	public void shellSort() {
		int h = 1, j;
		int size = this.numbers.size();
		T s;
		
		for(;(h*3+1) < size;h = (h*3+1));
		
		while(h > 0){
			for(int i = h - 1; i < size; i++){//h is the distance
				s = super.numbers.get(i);//set to that last one which is set to further pos

				for(j = i; (j >= h) && compare(super.numbers.get(j-h), s) > 0; j -= h)//trace to left
					super.numbers.set(j, super.numbers.get(j-h));
				super.numbers.set(j, s);
			}
			h /= 3;
		}
	}

	@Override
	public String toString() {
		return "ShellSort";
	}

}
