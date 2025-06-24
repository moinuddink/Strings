public class FormattedStringMethod {

    public static void main(String[] args) {

        String formattedString = String.format("%s %s", "Hello", "World");
        String formattedString2 = String.format("%d %d", 1, 2);
        System.out.println(formattedString);
        System.out.println(formattedString2);

        String message = "Hello, %s ! You have %d new messages.";
        String name = "Sohail";
        int newMessages = 5;
        String formattedMessage = String.format(message, name, newMessages);
        System.out.println(formattedMessage);

        double pi = 3.14159265358979323846;
        String formattedPi = String.format("%f", pi);
        System.out.println(formattedPi);

        String formattedPrice = String.format("The price is $%f", pi);
        System.out.println(formattedPrice);

        String formattedPrice2 = String.format("The price is $%.2f", pi);
        System.out.println(formattedPrice2);

        int number = 123;
        String paddedNumber = String.format("The number is %5d", number);
        System.out.println(paddedNumber);

        String nameOfPerson = "Sohail";
        int age = 21;
        String formattedString3 = String.format("My name is %2$s, I am %1$d years old, and I live in %3$s.", age, nameOfPerson, "City");
        System.out.println(formattedString3);

    }
}
