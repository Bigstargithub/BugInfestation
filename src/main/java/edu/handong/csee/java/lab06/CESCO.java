package edu.handong.csee.java.lab06; // this is the package that performs the BugInfestation class
import java.util.Scanner; // get the Scanner class from the package java.util

/**
 * This is CESCO class. </br>
 * First, this class get volume of house and inital number of roaches in house. </br>
 * Then compute number of weeks until the house is full of roaches. </br>
 * And display results. </br>
 * @author Bigstar
 *
 */
public class CESCO {

 final double GROWTH_RATE = 0.95; // weekly growth rate of the roach population.
 final double ONE_BUG_VOLUME = 0.002; // volume of an average roach.

 /**
 * this is the main method of BugInfestation class. </br>
 */
 public static void main(String[] args) {


 CESCO myBugInfestation= new CESCO(); // instantiation the class.
 myBugInfestation.computeNumberOfBugsToUseFKiller(); // perform the method.
 }

 /**
 * This method is public method. </br>
 * This method performs actions that calculate number of weeks to exceed the capacity of the house and number and volume of roaches. </br>
 */
 public void computeNumberOfBugsToUseFKiller() {
 Scanner keepWork = new Scanner(System.in); // Prepares to read from the keyboard.

 System.out.print("Enter the total volume of you house\n" 
 + "in cubic feet: "); // display the parenthesis.
 double houseVolume = keepWork.nextDouble(); // volume is might double. so scan in double.
 System.out.print("Enter the estimated number of\n" 
 + " roaches in your house: "); // display the parenthesis
 int startPopulation = keepWork.nextInt(); // scan in integer.

 double population = startPopulation; // declare double type number.
 double totalBugVolume = population * ONE_BUG_VOLUME; // ONE_BUG_VOLUME is already defined.

 int countWeek = 0; // declare integer type number.

 while (totalBugVolume < houseVolume) // totalBugVolume is less than houseVolume. 
 {
 double newBugs = population * GROWTH_RATE; // GROWTH_RATE is double.
 double newBugVolume = newBugs * ONE_BUG_VOLUME; // ONE_BUG_VOLUME is double.
 population = population + newBugs; // add population and newBugs.
 totalBugVolume = population * ONE_BUG_VOLUME; // multiple two double type numbers.
 countWeek = countWeek + 1; // increase 1 to the countWeek which is integer numbers.
 }

 System.out.println("Starting with a roach population of " + startPopulation); // display the integer and parenthesis.
 System.out.println("and a houte with a volume of= " + houseVolume + " cubic feet,"); // display the double and parenthesis.
 System.out.println("after " + countWeek+ " weeks,"); // display count.
 System.out.println("the house will be filled with " + (int)population + " roaches.");// print "population" in int type.
 System.out.println("They will fill a volume of " + (int)totalBugVolume +" cubic feet."); // print "totalBugVolume" in int type.
 System.out.println("Better call Debugging Experts Inc."); // display the parenthesis.
 }
} 