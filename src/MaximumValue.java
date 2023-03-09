public class MaximumValue {
    public Float maximumFloat(Float a, Float b, Float c) {
        Float maximumValue = a;
        if (b.compareTo(maximumValue) > 0)
            maximumValue = b;
        if (c.compareTo(maximumValue) > 0)
            maximumValue = c;
        return maximumValue;

    }
    public static void main(String[] args){
        MaximumValue maximumValue=new MaximumValue();
        System.out.println(maximumValue.maximumFloat(30.50F,15.05F,19.58F));
    }
}
