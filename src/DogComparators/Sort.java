package DogComparators;

import java.util.Comparator;

public class Sort {
	public <M> void compareSort(M[] arr, Comparator<M> comp){
		int min;
	    M temp;
	    for (int i = 0; i < arr.length-1; i++){
	        min = i;
	        for (int search = i+1; search < arr.length; search++){
	            if (comp.compare(arr[search], arr[min])<0){
	                min = search;
	            }
	        }
	        temp = arr[min];
	        arr[min] = arr[i];
	        arr[i] = temp;
	        }
	}
}