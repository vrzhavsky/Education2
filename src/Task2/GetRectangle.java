package Task2;

import java.util.Scanner;

public class GetRectangle {
	private double x;
    private double y;
    private double width;
    private double height;
	private double inputX;
	private double inputY;
	private double pointX;
	private double pointY;
	    
	 public void newRectangle(){
	    	System.out.print("Please enter X coordinate for rectangle location: ");
	    	System.out.println();
	    	@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	    	if (scan.hasNextDouble()) {
	            x = scan.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			
	    	System.out.print("Please enter Y coordinate for rectangle location: ");
	    	System.out.println();
	    	@SuppressWarnings("resource")
			Scanner scan1 = new Scanner(System.in);
	    	if (scan1.hasNextDouble()) {
	           y = scan1.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			
			System.out.print("Please enter Width of rectangle: ");
			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan2 = new Scanner(System.in);
			if (scan2.hasNextDouble()) {
	            width = scan2.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			
			System.out.print("Please enter Height of rectangle: ");
			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan3 = new Scanner(System.in);
			if (scan3.hasNextDouble()) {
	            height = scan3.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			
			Rectangle rec = new Rectangle(x,y,width,height);
			rec.calculatePerimeter();
			rec.calculateSquare();
			rec.printRectangle();
			System.out.print("Please enter X coordinate to move triangle: ");
			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan4 = new Scanner(System.in);
			if (scan4.hasNextDouble()) {
	            inputX = scan4.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			System.out.print("Please enter Y coordinate to move triangle: ");
			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan5 = new Scanner(System.in);
			if (scan5.hasNextDouble()) {
	            inputY = scan5.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			rec.moveX(inputX);
			rec.moveY(inputY);
			rec.printRectangle();
			System.out.print("Please enter X coordinate for desired point: ");
			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan6 = new Scanner(System.in);
			if (scan6.hasNextDouble()) {
	            pointX = scan6.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			System.out.print("Please enter Y coordinate for desired point: ");
			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan7 = new Scanner(System.in);
			if (scan7.hasNextDouble()) {
	            pointY = scan7.nextDouble();
	        } else {
	            System.out.println ("Please enter correct double value!");
	        }
			rec.isInside(pointX, pointY);
	    }
	 
}
