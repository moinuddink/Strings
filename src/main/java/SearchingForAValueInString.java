public class SearchingForAValueInString {

    public static void main(String[] args) {

        String originalString = "Sohail";
        String falseString = "False";
        boolean isFound = originalString.contains("Sohail");
        boolean isFound2 = originalString.contains("f");
        //true
        System.out.println(isFound);
        //false
        System.out.println(isFound2);
    }
}
