package roomdetailgenerator;

import java.util.Scanner;

public class roomdetailgenerator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		String choice = "";
		
		do{
			System.out.println("Enter Length:");				
			length = sc.nextDouble();
			
			System.out.println("Enter Width:");
			width = sc.nextDouble();
			
			System.out.println("Enter Height:");
			height = sc.nextDouble();
							
			double area = (length * width); 
			double perimeter = (length*2 + width*2);
			double volume = (length * width * height);
		
			System.out.println("Area:" + area);
			System.out.println("Perimeter:" + perimeter);
			System.out.println("Volume:" + volume);
			
			System.out.println("Continue (y/n) ?:");
			choice = sc.next();
			
			}while (choice.equals("y") || choice.equals("Y") );
		sc.close();
	}	
}
