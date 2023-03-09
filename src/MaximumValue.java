public class MaximumValue {
    public Integer maximumInteger(Integer a, Integer b, Integer c) {
        Integer maximumValue = a;
        if (b.compareTo(maximumValue) > 0)
            maximumValue = b;
        if (c.compareTo(maximumValue) > 0)
            maximumValue = c;
        return maximumValue;
    }
    public static void main(String[] args){
        MaximumValue maximumValue=new MaximumValue();
        System.out.println("Maximum Value of Integer : "+ maximumValue.maximumInteger(20,10,25));
    }
}
