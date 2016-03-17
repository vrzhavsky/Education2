package Task2;

public class Circle {
private double x; // central coordinate of the circle
private double y; // central coordinate of the circle
private double radius;
private double square;
private double perimeter;
boolean c;
double boxWeight;
double boxHeight;
public void printCircle(){
	System.out.println("Circle coordinates: " + "x= " + x + " y= " + y);
	System.out.println("radius: " + radius + " square: " + square + " perimeter: " + perimeter);
}
public Circle(double x, double y, double r){
	this.x = x;
    this.y = y;
	this.radius = r;
}

public void calculateSquare(){
	square = Math.PI * Math.pow(radius, 2);
}
public void calculatePerimeter(){
	perimeter = 2 * Math.PI * radius;
}
public void moveX(double moveX){
	   this.x = moveX;
}
public void moveY(double moveY){
	   this.y = moveY;
}
public void isInside(double pointX, double pointY){
	double a = Math.sqrt(Math.pow(pointX - x,2) + Math.pow(pointY - y,2));
	if(a <= radius){
		c = true;
	}
	else c = false;
	if (c == true){
		System.out.println("Point is inside of circle! =)");	
	}
	else if(c == false){
		System.out.println("Point is outside of circle! =(");
	}
}
public void boundingBox(){
	boxWeight = (x + radius) - (x - radius);
	boxHeight = (y + radius) - (y - radius);
	System.out.println("Min bounding box:");
	System.out.println("weight: " + boxWeight);
	System.out.println("height: " + boxHeight);
}
}
