import java.util.Arrays;
import java.util.Random;

/*
 * Author: Steven Sommer
 * Date: 8/22/22
 * Class: CS 341 Data Structures
 * Assignment: Lab0
 * Description: a) Creates an integer array of size 25.
				b) Store random numbers (integers) in the range 1 to 250.
				c) Outputs all the number – nice column format.
				d) Selects, and prints out, the largest and the smallest. (Also, prints out the position of the largest and smallest.)
				e) Selects, and prints out, the second largest, and the second smallest. (Also, prints out the position of these elements.)
				f) Selects, and prints out, the fifth largest, and the fifth smallest. (Also, prints out the position of these elements.)
				g) Selects, and prints the median of the elements. (Also, prints out the position of this median element.)
 * 
 */


public class Lab0 {

	public static void main(String[] args) {
		
		// a) Creates an integer array of size 25.
		int[] data = new int[25];
		
		// b) Store random numbers (integers) in the range 1 to 250.
		Random gen = new Random();
	
		for (int i = 0; i < data.length; i++) 
		{
		  	data[i] = gen.nextInt(250);
		}
		
		// c) Outputs all the number – nice column format.
		int count = 1;
		while (count < data.length + 1) 
		{
			System.out.printf("%6d ",data[count -1]);
			if(count % 5 == 0) 
				System.out.println();
				count++;
		}	
		
		// d) Selects, and prints out, the largest and the smallest. (Also, prints out the position of the largest and smallest.)
			int largest = -1, smallest = 251;
			int smallpos = 0, largepos = 0;
			
			for (int i = 0; i < data.length; i++) 
			{
				if (data[i] < smallest) 
				{
					smallest = data[i];
					smallpos = i;
				}
				
				if (data[i] > largest) 
				{
					largest = data[i];
					largepos = i;
				}
			}
			
			System.out.println("");
			System.out.println("The Largest is " + largest + " at position " + largepos );
			System.out.println("The Smallest is " + smallest + " at position " + smallpos );
			
			
			
			//e) Selects, and prints out, the second largest, and the second smallest. (Also, prints out the position of these elements.)
			int seclargest = -1, secsmallest = 251;
			int secsmallpos = 0, seclargepos = 0;
			
			for (int i = 0; i < data.length; i++) 
			{
				if (data[i] < secsmallest && data[i] > smallest) 
				{
					secsmallest = data[i];
					secsmallpos = i;
				}
				if (data[i] > seclargest && data[i] < largest) 
				{
					seclargest = data[i];
					seclargepos = i;
				}
			}
			
			System.out.println("");
			System.out.println("The 2nd Largest is " + seclargest + " at position " + seclargepos );
			System.out.println("The 2nd Smallest is " + secsmallest + " at position " + secsmallpos );
			
			
			// f) Selects, and prints out, the fifth largest, and the fifth smallest. (Also, prints out the position of these elements.)
			int thirdlargest = -1, thirdsmallest = 251;
			int thirdsmallpos = 0, thirdlargepos = 0;
			
			for (int i = 0; i < data.length; i++) 
			{
				if (data[i] < thirdsmallest && data[i] > secsmallest) 
				{
					thirdsmallest = data[i];
					thirdsmallpos = i;
				}
				if (data[i] > thirdlargest && data[i] < seclargest) 
				{
					thirdlargest = data[i];
					thirdlargepos = i;
				}
			}
			
			int fourthlargest = -1, fourthsmallest = 251;
			int fourthsmallpos = 0, fourthlargepos = 0;
			
			for (int i = 0; i < data.length; i++) 
			{
				if (data[i] < fourthsmallest && data[i] > thirdsmallest) 
				{
					fourthsmallest = data[i];
					fourthsmallpos = i;
				}
				if (data[i] > fourthlargest && data[i] < thirdlargest) 
				{
					fourthlargest = data[i];
					fourthlargepos = i;
				}
			}
			
			int fifthlargest = -1, fifthsmallest = 251;
			int fifthsmallpos = 0, fifthlargepos = 0;
			
			for (int i = 0; i < data.length; i++) 
			{
				if (data[i] < fifthsmallest && data[i] > fourthsmallest) 
				{
					fifthsmallest = data[i];
					fifthsmallpos = i;
				}
				if (data[i] > fifthlargest && data[i] < fourthlargest) 
				{
					fifthlargest = data[i];
					fifthlargepos = i;
				}
			}
			
			System.out.println("");
			System.out.println("The 5th Largest is " + fifthlargest + " at position " + fifthlargepos );
			System.out.println("The 5th Smallest is " + fifthsmallest + " at position " + fifthsmallpos );
			
			
			//g) Selects, and prints the median of the elements. (Also, prints out the position of this median element.)
			int median = 0;
			int medianpos = 0;
			
			for (int i = 0; i < data.length/2; i++) {
				if (data[i] > fifthsmallest && data[i] < fifthlargest) 
				{
					median = data[i];
					medianpos = i;
				}
			}
			
			System.out.println("");
			System.out.println("The Median is " + median + " at position " + medianpos);
		}
	}
