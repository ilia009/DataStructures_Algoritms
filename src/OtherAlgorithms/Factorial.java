package OtherAlgorithms;

/**
 * Created by Admin on 10.08.2019.
 */
public class Factorial {
    public static void main(String[] args) {

       // iterativeFactorial(0);
        System.out.println(recursiveFactorial(5));

    }

    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

}
