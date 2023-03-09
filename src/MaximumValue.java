public class MaximumValue {
    public static String maximumString(String a, String b, String c) {
        String maximumValue = a;
        if (b.compareTo(maximumValue) > 0)
            maximumValue = b;
        if (c.compareTo(maximumValue) > 0)
            maximumValue = c;
        System.out.println(a + " " + b + " " + c);
        return maximumValue;
    }

    public static void main(String[] args) {
        MaximumValue maximumValue = new MaximumValue();
        System.out.println("Maximum value of String : " + maximumValue.maximumString("grapes", "mango", "orange"));
    }
}
