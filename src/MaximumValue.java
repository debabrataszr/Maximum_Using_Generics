public class MaximumValue<T extends Comparable<T>> {
    T num1;
    T num2;
    T num3;

    public MaximumValue(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

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
        Integer intValue = maximumGeneric(10, 34, 28);
        Float floatValue = maximumGeneric(25.8f, 40.9f, 57.2f);
        String stringValue = maximumGeneric("xyz", "dew", "res");
        System.out.println("Maximum Integer value : " + intValue);
        System.out.println("Maximum Float value : " + floatValue);
        System.out.println("Maximum String value : " + stringValue);

    }
}
