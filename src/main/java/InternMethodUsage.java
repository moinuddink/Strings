public class InternMethodUsage {

    public static void main(String[] args) {

        String A = "Hello World";
        String B = "Hello World";
        String C = "Hi";
        System.out.println(A);
        System.out.println(B);
        System.out.println(A == B);
        System.out.println(B == C);

        String objectA = new String("Hello World").intern();
        String objectB = "Hello World";
        System.out.println(objectA.equals(objectB));
        System.out.println(objectA.equals(A));
    }
}
