package basic;

import java.util.Arrays;

public class HighestAndLowest {

	static String sample;
	static int s;

	public static void main(String[] args) {

		int[] arr = { -3, 12, 5, 7, 19, 15, 12 };

        System.out.println("Highest value in the array = " + findHighest(arr)); // return 19
        System.out.println("Lowest value in the array  = " + findLowest(arr)); // return 0
	}

	public static int findHighest(int[] array) {
		return Arrays.stream(array).max().getAsInt();
	}

	public static int findLowest(int[] array) {
		return Arrays.stream(array).min().getAsInt();
	}

}