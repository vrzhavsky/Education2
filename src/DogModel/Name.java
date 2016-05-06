package DogModel;

import java.util.Random;

public class Name {
	static public String[] pt1 = {"Bamb","Skip","Oz","Bra","Swe","Bud","Fun","Ted","Cod","Mo"};
	static public String[] pt2 = {"ble","py","zy","za","ety","dy","ky","dy","dy","ody"}; 
	public static String randomName(Random random){
		return Name.pt1[random.nextInt(Name.pt1.length)] + Name.pt2[random.nextInt(Name.pt2.length)];
	}
}