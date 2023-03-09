public class MaximumValue<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T maximum(T... number) {
        T maximumValue = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i].compareTo(maximumValue) > 0) {
                maximumValue = number[i];
            }
        }
        System.out.println("given values are : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        printMax(maximumValue);
        return maximumValue;
    }

    public static <T> void printMax(T maximum) {
        System.out.println("Maximum Value is : " + maximum);
    }

    // main method
    public static void main(String[] args) {
        maximum(28, 78, 38, 68, 98);
        maximum("xyz", "def", "jkl", "dog", "war");
        maximum(27f, 9f, 4.7f, 57.3f, 34.9f);

    }

}
