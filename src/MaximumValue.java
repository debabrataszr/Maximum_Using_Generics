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

    public static <T> void printMax(T max) {
        System.out.println("Maximum Value is : " + max);
    }

    // main method
    public static void main(String[] args) {
        maximum(23, 78, 36, 45, 23, 2, 5, 78);
        maximum("xyz", "dij", "jsd", "drg", "wdd");
        maximum(23f, 9f, 4.3f, 56.3f, 34.2f);
    }
}
