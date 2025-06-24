public class SplittingStringsMethods {

    public static void main(String[] args) {
        String fruits = "apple,orange,banana,apple,banana,apple";
        String[] fruitsArray = fruits.split(",");
        for(String fruit : fruitsArray) {
            System.out.println(fruit);
        }
        }

}
