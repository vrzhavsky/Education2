package DogComparators;

import java.util.Comparator;

import DogModel.Dog;

public class SortForSizeDESC implements Comparator<Dog>{

	@Override
	public int compare(Dog size1, Dog size2) {
		int dog1 = size1.getAge();
		int dog2 = size2.getAge();

        if(dog1 < dog2) {
               return 1;
        }
        else if(dog1 > dog2) {
               return -1;
        }
        else {
               return 0;
        }
	}
}
