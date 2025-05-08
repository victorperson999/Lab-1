public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        doMultiples(i);
    }
    public static void doMultiples(int i) {
        int countmultiples = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                countmultiples++;
                i++;
            }
            i++;
        }
    }



}
