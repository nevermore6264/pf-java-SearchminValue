public class SearchMinValue {
    public static void main(String[] args) {
        int[] arrNumber = {7, 8, 9, 1, 5, 3, 2};
        int index = minValue(arrNumber);
        System.out.println("The smallest element : " + arrNumber[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

}