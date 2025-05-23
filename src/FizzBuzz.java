/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        doFizzBuzz(i);
    }
    // ya man
    public static void doFizzBuzz(int i) {

        while (i < 6) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");
                i++;

            } else if (divisibleBy3) {

                System.out.println("Fizz");
                i++;

            } else if (divisibleBy5) {

                System.out.println("Buzz");
                i++;

            } else {

                System.out.println(i);
                i++;

            }
        }
    }
}
