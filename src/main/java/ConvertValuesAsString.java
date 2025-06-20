public class ConvertValuesAsString {

    public static void main(String[] args) {

        int intValue = 123;
        double doubleValue = 123.456;
        boolean boolValue = true;

        String str1 = String.valueOf(intValue);
        String str2 = String.valueOf(doubleValue);
        String str3 = String.valueOf(boolValue);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
