package DogComparators;

import java.util.Comparator;

import DogModel.Dog;
import DogModel.Size;

public class SortForSize implements Comparator<Dog>{

		@Override
		public int compare(Dog s1, Dog s2) {
	        Size Size1 = s1.getSize();
	        Size Size2 = s2.getSize();
	        return Size1.compareTo(Size2);
	    }

}
