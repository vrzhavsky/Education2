package Task1;


import java.util.Arrays;
import java.util.Scanner;

public class DogList {
	String[] name = {"bamb","skip","oz","bra","swe","bud","fun","ted","cod","mo"};
	String[] addName = {"ble","py","zy","za","ety","dy","ky","dy","dy","ody"};
	
	int nameLength = name.length;
	int addNameLength = addName.length;
	int s;
	String q;
	String[] fullName;
	String[] fullSize;
	String[] inputtedDogs;
	int[] fullAge;
	String sizePrint;

	public void Dogs () {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		s = scan.nextInt();
		
		@SuppressWarnings("resource")
		Scanner scan1 = new Scanner(System.in);
		q = scan1.nextLine();
		
		inputtedDogs = q.split(" ");
		
		System.out.println("Doggy name |" + " Doggy size |" + " Doggy age |");
			
		Dog[] dogs = new Dog[s];
		
		for(int i =0; i < dogs.length;i++){
			//age
			int age = this.getAge();
			//size
			if(age > 0 && age <= 5) {
				sizePrint = "small";
			}
			if(age > 5 && age <= 12) {
				sizePrint = "medium";
			}
			if(age > 12 && age <= 20 ) {
				sizePrint = "big";
			}
			//new dogs
			dogs[i] = new Dog((name[(int) (Math.random() * nameLength)]+this.addName[(int) (Math.random() * addNameLength)]),
					sizePrint, age);
		}
		
		for (int i = 0; i < this.inputtedDogs.length; i++){
			dogs[i].setName(inputtedDogs[i]);
		}
		
		this.printDogs(dogs);
		System.out.println();
		System.out.println("Please select sorting type which is you desire:");
		System.out.println("1 - Name ASC");
		System.out.println("2 - Name DESC");
		System.out.println("3 - Size ASC");
		System.out.println("4 - Size DESC");
		System.out.println("5 - Age ASC");
		System.out.println("6 - Age DESC");
		
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(System.in);
		int z = scan2.nextInt();
		if(z == 1){
			System.out.println("Name ASC sorting:");
			Arrays.sort(dogs, new SortForName());
			this.printDogs(dogs);
		}
		if(z == 2){
			System.out.println("Name DESC sorting:");
			Arrays.sort(dogs, new SortForNameDESC());
			this.printDogs(dogs);
		}
		if(z == 3){
			System.out.println("Size ASC sorting:");
			Arrays.sort(dogs, new SortForSize());
			this.printDogs(dogs);
		}
		if(z == 4){
			System.out.println("Size DESC sorting:");
			Arrays.sort(dogs, new SortForSizeDESC());
			this.printDogs(dogs);
		}
		if(z == 5){
			System.out.println("Age ASC sorting:");
			Arrays.sort(dogs, new SortForAge());
			this.printDogs(dogs);
		}
		if(z == 6){
			System.out.println("Age DESC sorting:");
			Arrays.sort(dogs, new SortForAgeDESC());
			this.printDogs(dogs);
		}
		
	}
	private int getAge(){
		int age = (int) (Math.random() * 20) + 1;
		return age;
	}
	
	private void printDogs(Dog[] dogs){
		for (int i = 0; i< dogs.length; i++){
			dogs[i].printDog();
		}
	}
}


		
	