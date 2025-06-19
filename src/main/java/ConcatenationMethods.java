public class ConcatenationMethods {
    public static void main(String[] args) {

        String name = "Sohail".concat(" ");
        String age = "18".concat("");
        String sentence = "My name is " + name + " and I am " + age + " years old.";
        System.out.println(sentence);
        String con = "Moin";
        System.out.println(sentence+" "+con);
    }
}
