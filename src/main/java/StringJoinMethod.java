import java.util.Collections;
import java.util.List;

public class StringJoinMethod {

    public static void main(String[] args) {

        //The join method is introduced in Java 8.
        String result = String.join(" ", "Hello", "World", "!");
        System.out.println(result);

        String result2 = String.join("","Java is ","fun and ", "powerful");
        System.out.println(result2);

        List<String> emptyList = Collections.emptyList();
        String result3 = String.join(",", emptyList);
        System.out.println(result3);
    }
}
