public class if_statement {

        public class IfStatementExample {
            public static void main(String[] args) {
                int number = 15;

                // 1. Simple if statement
                if (number > 10) {
                    System.out.println("Simple if: Number is greater than 10");
                }

                // 2. if-else statement
                if (number % 2 == 0) {
                    System.out.println("if-else: Number is even");
                } else {
                    System.out.println("if-else: Number is odd");
                }

                // 3. if-else-if ladder
                if (number < 0) {
                    System.out.println("if-else-if ladder: Number is negative");
                } else if (number == 0) {
                    System.out.println("if-else-if ladder: Number is zero");
                } else if (number > 0 && number <= 10) {
                    System.out.println("if-else-if ladder: Number is between 1 and 10");
                } else {
                    System.out.println("if-else-if ladder: Number is greater than 10");
                }

                // 4. Nested if statement
                if (number > 0) {
                    if (number < 20) {
                        System.out.println("Nested if: Number is positive and less than 20");
                    }
                }
            }
        }

    }

