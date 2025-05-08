public class Reduce {
    public static int iterations = 0;

    public static void main(String[] args) {
        System.out.println(reduce(100));
        System.out.println(iterations);
    }

    public static int reduce(int n) {
        iterations++;
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return reduce(n/2);
        }else{
            return reduce(n-1);
        }
    }
}
