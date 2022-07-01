public class HighestAndLowest {
    public static void main(String[] args) {

        int[] arr = {3, 12, 5, 7, 15};
        System.out.println("Highest value in the array = " + findHighest(arr));
        System.out.println("Lowest value in the array  = " + findLowest(arr));
    }

    static int findHighest(int[] array) {
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (result < array[i])
                result = array[i];
        }

        return result;
    }

    static int findLowest(int[] array){
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (result > array[i])
                result = array[i];
        }

        return result;
    }
}