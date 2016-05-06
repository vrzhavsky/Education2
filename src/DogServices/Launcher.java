package DogServices;

import java.util.Scanner;
import DogComparators.Sort;
import DogComparators.SortForName;
import DogModel.Dog;

public class Launcher {
	InputData value;
	Scanner s;
	Dog[] dogs;
	public static void main(String[] args){
		Launcher dogLaunch = new Launcher();
		dogLaunch.dogLauncher();
	}
	private void dogLauncher(){
		this.s = new Scanner(System.in);
		value = new InputData();
		value.UserInput(s);
		this.createDogsArray(value.count(), value.names());
		
		Sort sort = new Sort();
		
		sort.compareSort(this.dogs, new SortForName());

		for (Dog d: this.dogs){
			System.out.println(d.toString());
		}
	}
	private void createDogsArray(int count, String[] names){
		this.dogs = new Dog[count];
		if (names.length > count){
			System.out.println("Dog names more then dogs count exist. Extra names won't be used.");
		}
		for (int i = 0 ; i < this.dogs.length; i++){
			if (i < names.length){
				this.dogs[i] = new Dog(names[i]);
			} 
			else 
				this.dogs[i] = new Dog();
		}
	}
	
}
