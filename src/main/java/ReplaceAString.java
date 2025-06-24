public class ReplaceAString {

    public static void main(String[] args) {

        String name = "Sohail";
        String replacedName = name.replace("a", "A");
        System.out.println(replacedName);

        String name2 = "Moinuddin Khan";
        String replacedName2 = name2.replace(" ", "*");
        System.out.println(replacedName2);

        String name3 = "Hello, World";
        String replacedName3 = name3.replace("World", "Java i want to learn more it is interesting");
        System.out.println(replacedName3);
    }
}
