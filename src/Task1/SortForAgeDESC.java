package Task1;

import java.util.Comparator;

public class SortForAgeDESC implements Comparator<Dog>{
	
	@Override
	public int compare(Dog age1, Dog age2) {
		 int dog1 = age1.getAge();
		 int dog2 = age2.getAge();

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