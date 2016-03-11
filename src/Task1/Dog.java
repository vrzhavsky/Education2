package Task1;

public class Dog {
String name;
String size;
int age;
public String getName(){
	return name;
}
public void setName(String name){
	this.name = name;
}
public String getSize(){
	return size;
}
public void setSize(String size){
	this.size = size;
}
public int getAge(){
	return age;
}
public void setAge(int age){
	this.age = age;
}

public Dog(String name, String size, int age){
	this.name = name;
	this.size = size;
	this.age = age;
}
public void printDog(){
	System.out.println(this.name +" | " + this.size +" | " + this.age);
}


  
}

