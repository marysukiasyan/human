package academy.learnprogramming;

public class FunctionManager {

    //1
    public int sum(int x, int y) {
        return x + y;
    }

    //2

    public double multiply(double x, double y){
        return x*y;
    }

    //3

    static void printIfFirstIsGreater(float a, float b) {
        if(a>b){
            System.out.println("Yes");
        }
        System.out.println("No");
    }

    //4

    static void printGreatestNumber(long a,long b, long c) {
        long max= a>b? (a>c? a : c):(b>c ? b :c);
        System.out.println(max);
    }

    //5




}
