package basic;

public class HighestAndLowest {

	static String sample;
	static int s;

	public static void main(String[] args) {

		int[] arr = { -3, 12, 5, 7, 19, 15, 12 };

		int sample = 'c';
		System.out.println(sample);

        //System.out.println("Highest value in the array = " + findHighest(arr)); // return 19
        //System.out.println("Lowest value in the array  = " + findLowest(arr)); // return 0
	}

	public int findHighest(int[] array) {
		int result = array[0];

		for (int i = 1; i < array.length; i++) {
			if (result < array[i])
				result = array[i];
		}

		return result;
	}

	public int findLowest(int[] array) {
		int result = array[0];

		for (int i = 1; i < array.length; i++) {
			if (result > array[i])
				result = array[i];
		}

		return result;
	}

}