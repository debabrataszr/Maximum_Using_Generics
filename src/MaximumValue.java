public class MaximumValue<T extends Comparable<T>> {
    T num1;
    T num2;
    T num3;

    public static <T extends Comparable<T>> T maximumGeneric(T num1, T num2, T num3) {
        T maximumValue = num1;
        if (num2.compareTo(maximumValue) > 0)
            maximumValue = num2;
        if (num3.compareTo(maximumValue) > 0)
            maximumValue = num3;
        System.out.println(num1 + " " + num2 + " " + num3);
        return maximumValue;
    }

    public static void main(String[] args) {
        MaximumValue maximumValue = new MaximumValue();
        System.out.println("Maximum Integer value : " + maximumGeneric(10, 34, 28));
        System.out.println("Maximum Float value : " + maximumGeneric(25.8f, 40.9f, 57.2f));
        System.out.println("Maximum String value : " + maximumGeneric("xyz", "dew", "res"));

    }
}
