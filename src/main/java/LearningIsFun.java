public class LearningIsFun {

        public static void main(String[] args) {
            boolean isJavaFun = true;
            boolean learningIsHard = false;

            System.out.println("Is Java fun? " + isJavaFun);
            System.out.println("Is learning hard? " + learningIsHard);

            if (isJavaFun) {
                System.out.println("Keep coding!");
            }else if (learningIsHard) {
                System.out.println("Need More Practice!");
            }else {
                System.out.println("Then why did you take this course?");
            }

            if (!learningIsHard) { // ! is the NOT operator
                System.out.println("You're doing great!");
            }
        }
}
