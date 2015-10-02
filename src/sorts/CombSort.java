package sorts;

import java.util.List;

public class CombSort<T> extends Sorts<T> {

	public CombSort(List<T> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void toSort() {
		super.start();
		this.CombSort();
		super.end();
	}
	
	private void CombSort() {
		int i = 0;
		int gap = super.numbers.size();
		int size = super.numbers.size();
		boolean swapped = true;
		
		while(gap > 1 || swapped){
			//1.3 is a shrink factor
			//use gap-- is fine
			if(gap > 1)
				gap /= 1.3;
			
			for(i = 0, swapped = false; (i+gap) < size; i++){
				if(super.compare(super.numbers.get(i), super.numbers.get(i+gap)) > 0){
					super.swap(i, i+gap);
					swapped = true;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "CombSort";
	}
}
