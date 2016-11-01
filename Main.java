
/****************************************************************************
 *     
 * Created by Michael Weedmark
 * Assignment 4b, ICS4U
 * This program lets the user input a triangle,
 * the program then tells info about the user's triangle.
 *
 ****************************************************************************/

public class Main {

	public static void main(String[] args) {
		
		TriangleClass newTriangle = new TriangleClass(5,5,5);
			
		if (newTriangle.isTriangle() == true){
			
		System.out.print(newTriangle.currentTriangle());
		
		} else {
			
			System.out.println("That is not a triangle!");
			
		}
		
	}

}
