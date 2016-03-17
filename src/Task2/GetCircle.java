package Task2;

import java.util.Scanner;

public class GetCircle {
	private double x;
    private double y;
    private double radius;
    private double inputX;
    private double inputY;
    private double pointX;
    private double pointY;
    public void newCircle(){
    	System.out.print("Please enter X coordinate for circle location: ");
    	System.out.println();
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	if (scan.hasNextDouble()) {
            x = scan.nextDouble();
        } else {
            System.out.println ("Please enter correct double value!");
        }
    	System.out.print("Please enter Y coordinate for circle location: ");
    	System.out.println();
    	@SuppressWarnings("resource")
		Scanner scan1 = new Scanner(System.in);
    	if (scan1.hasNextDouble()) {
            y = scan1.nextDouble();
        } else {
            System.out.println ("Please enter correct double value!");
        }
    	System.out.print("Please enter radius for desired circle: ");
    	System.out.println();
    	@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(System.in);
    	if (scan2.hasNextDouble()) {
            radius = scan2.nextDouble();
        } else {
            System.out.println ("Please enter correct double value!");
        }
    	Circle cir = new Circle(x,y,radius);
		cir.calculatePerimeter();
		cir.calculateSquare();
		cir.printCircle();
		
		System.out.print("Please enter X coordinate to move circle: ");
    	System.out.println();
    	@SuppressWarnings("resource")
		Scanner scan3 = new Scanner(System.in);
    	if (scan3.hasNextDouble()) {
            inputX = scan3.nextDouble();
        } else {
            System.out.println ("Please enter correct double value!");
        }
    	System.out.print("Please enter Y coordinate to move circle: ");
    	System.out.println();
    	@SuppressWarnings("resource")
		Scanner scan4 = new Scanner(System.in);
    	if (scan4.hasNextDouble()) {
            inputY = scan4.nextDouble();
        } else {
            System.out.println ("Please enter correct double value!");
        }
    	cir.moveX(inputX);
    	cir.moveY(inputY);
    	cir.printCircle();
    	System.out.print("Please enter X coordinate for desired point: ");
    	System.out.println();
    	@SuppressWarnings("resource")
		Scanner scan5 = new Scanner(System.in);
    	if (scan5.hasNextDouble()) {
            pointX = scan5.nextDouble();
        } else {
            System.out.println ("Please enter correct double value!");
        }
    	System.out.print("Please enter Y coordinate for desired point: ");
    	System.out.println();
    	@SuppressWarnings("resource")
		Scanner scan6 = new Scanner(System.in);
    	if (scan6.hasNextDouble()) {
            pointY = scan6.nextDouble();
        } else {
            System.out.println ("Please enter correct double value!");
        }
    	cir.isInside(pointX, pointY);
    	cir.boundingBox();
    }
}
