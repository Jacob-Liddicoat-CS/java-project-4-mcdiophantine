import java.io.*;
import java.util.*;

public class mcNuggets {
	public static void main(String args[]) {
	Scanner kbReader = new Scanner(System.in);//Scanner to scan the number you input
	System.out.print("Enter the max amount of Mcnuggets the program will run to: ");
	int Nuggets = kbReader.nextInt();
	for (int sum = 1; sum <= Nuggets; sum++) { //Highest amount of nuggets less than or equal to the user input
		for (int S = 0; S * 6 <= sum; S++) { //Highest amount of 6 pack nuggets until the amount is greater than or equal to user input"
			

