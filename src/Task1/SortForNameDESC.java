package Task1;

import java.util.Comparator;

public class SortForNameDESC implements Comparator<Dog> {

		@Override
		public int compare(Dog name1, Dog name2) {
		     String str1 = name1.getName();
	         String str2 = name2.getName();
	        
	         return str2.compareTo(str1);
		}

	}