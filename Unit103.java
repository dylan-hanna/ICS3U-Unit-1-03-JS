// This program calculates the energy prduced by an object based on the weight in kilograms
//

import java.util.Scanner;

class Unit103 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Enter mass of object in kilograms:");

    // Numerical input
    float massInKg = myObj.nextFloat();
    
    float result = massInKg * 299792458;

    // Output input by user
    System.out.println(result + " joules of energy would be produced.");
  }
}
/**  Code from https://www.w3schools.com/java/java_user_input.asp */