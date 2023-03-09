import java.util.Arrays;

public class MaximumValue<T extends Comparable<T>> {
    T[] maximumValue;

    public MaximumValue(T[] maximumValue) {
        this.maximumValue = maximumValue;

    }

    public static <T extends Comparable<T>> T[] maximum(T... maximumValue) {
        System.out.println("Given elements -> ");
        for (T element : maximumValue) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("After Sorting -> ");
        Arrays.sort(maximumValue);
        for (T element : maximumValue) {
            System.out.print(element + " ");
        }
        System.out.println();
        return maximumValue;
    }

    public static void main(String[] args) {
        maximum(10, 34, 85, 28, 45);
        maximum("xyz", "dew", "jkl", "res", "abc");
        maximum(25.8f, 40.9f, 57.2f, 12.3f, 5.4f);
    }
}
