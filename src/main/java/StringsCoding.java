public class StringsCoding {

    public static void main(String[] args) {
        String a = "Hello World";
        String b = "Hello World";
        String c = "Hi";
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(b == c);
*/
        String objectA = new String("Hello World").intern();
        String objectB = new String("Hello World");
//        System.out.println(objectA == objectB);
        System.out.println(objectA == a);
        /*System.out.println(objectA);
        System.out.println(objectB);*/
    }
}
