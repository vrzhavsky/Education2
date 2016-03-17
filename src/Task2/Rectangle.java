package Task2;

public class Rectangle {
	private double x; // rectangle top left corner coordinate
    private double y; // rectangle top left corner coordinate
    private double width; 
    private double height;
    private double square;
    private double perimeter;
	boolean c;
	public void printRectangle(){
		System.out.println("Rectangle coordinates: " + "x= " + x + " y= " + y);
		System.out.println("width: " + width + " height: " + height + " square: " + square + " perimeter: " + perimeter);
	}
    public Rectangle(double x, double y, double width, double height) {
    	this.x = x;
        this.y = y;
    	this.width = width;
        this.height = height;
    }
    public boolean isInside(double pointX, double pointY){
    	double a = x + width;
    	double b = y - height;
    	if(pointX <= a){
    		c = true;
    	}
    	else c = false;
    	if(pointX >= x){
    		c = true;
    	}
    	else c = false;
    	if (pointY >= b){
    		c = true;
    	}
    	else c = false;
    	if(pointY <= y){
    		c = true;
    	}
    	else c = false;
    	if (c == true){
    		System.out.println("Point is inside of rectangle! =)");	
    	}
    	else if(c == false){
    		System.out.println("Point is outside of rectangle! =(");
    	}
   	return c;
    }
   public void moveX(double moveX){
	   this.x = moveX;
   }
   public void moveY(double moveY){
	   this.y = moveY;
   }
   public void calculatePerimeter() {
        perimeter = 2 * (width + height);
        }
    
    public void calculateSquare() {
        square = width * height;
    }
    
}

