package DogModel;

import java.util.Random;

public class Dog {
	private String name;
	private Size size;
	private int age;
	
	//generators
	private String setRandomName(Random random){
		return Name.randomName(random);
	}
	
	private Size setRandomSize(Random random){
		return Size.values()[random.nextInt(Size.values().length)];
	}
	
	private int setRandomAge(Random random){
		return random.nextInt(21)+1;
	}
	//setters
	private void setName(String name){
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}
	private void setAge(int age){
		if (age <= 0){
			System.out.println("Your " + this.name + " age dog is too young. Please enter dog age, not a puppy.");
			this.age = 1;
		}
		if (age > 0 && age <= 20){
			this.age = age;
		}
		if (age > 20){
			System.out.println("Your " + this.name + " age dog is too old. 20 is max age.");
			this.age = 1;
		}
	}
	private void setSize(Size size){
		this.size = size;
	}
	//getters
	public String getName(){
		return this.name;
	}
	public Size getSize(){
		return this.size;
	}
	
	public int getAge(){
		return this.age;
	}
	
	@Override
	public String toString(){
		return "Dog Name:\t" + this.getName() + "\t\tDog age:\t" + this.getAge() + "\tDog size:\t" + this.getSize().toString();
	}

	public int compareTo(Dog v) {
		String name1 = this.getName();
		String name2 = v.getName();
		return name1.compareTo(name2);
    }
	
		public Dog(){
			Random random = new Random();
			this.age = this.setRandomAge(random);
			this.name = this.setRandomName(random);
			this.size = this.setRandomSize(random);
		}
		
		public Dog(int age){
			this.setAge(age);
			
			Random random = new Random();
			this.name = this.setRandomName(random);
			this.size = this.setRandomSize(random);
		}
		
		public Dog(Size size){
			this.setSize(size);
			
			Random random = new Random();
			this.age = this.setRandomAge(random);
			this.name = this.setRandomName(random);
		}
		
		public Dog(String name){
			this.setName(name);
			Random random = new Random();
			this.age = this.setRandomAge(random);
			this.size = this.setRandomSize(random);
		}
		
		public Dog(int age, Size size){
			this.setAge(age);
			this.setSize(size);
			
			Random random = new Random();
			this.name = this.setRandomName(random);
		}
		
		public Dog(int age, String name){
			this.setAge(age);
			this.setName(name);
			
			Random random = new Random();
			this.size = this.setRandomSize(random);
		}
		
		public Dog(String name, Size size){
			this.setName(name);
			this.setSize(size);
			
			Random random = new Random();
			this.name = this.setRandomName(random);
		}
		
		public Dog(int age, String name, Size size){
			this.setAge(age);
			this.setName(name);
			this.setSize(size);
		}
	}
 


