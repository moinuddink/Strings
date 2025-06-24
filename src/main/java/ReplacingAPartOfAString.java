public class ReplacingAPartOfAString {

    public static void main(String[] args) {
        String originalString = "abababab";
        String replacedString = originalString.replace("ab", "X");
        System.out.println(replacedString);

        /*
        * The replaceAll(String regex, String replacement)
        * The replaceFirst(String regex, String replacement)
        * */

        String originalString2 = "Java is fun!";
        String replacedString2 = originalString2.replace("a|e|i|o|u", "*");
        System.out.println(replacedString2);

        String originalString3 = "apple orange apple banana apple";
        String replacedString3 = originalString3.replaceFirst("apple", "orange");
        System.out.println(replacedString3);



    }
}
