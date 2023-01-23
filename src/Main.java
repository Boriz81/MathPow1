import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double x = (double) (b / a);


        System.out.println(x);


       /* System.out.println(Math.pow(a, b));
        // второй вариант
        System.out.println(Math.pow(scanner.nextDouble(), scanner.nextDouble()));
        // третий вариант, но здесь не надо делать ввод каждый раз с новой строки
        System.out.println(Math.pow(new Scanner(System.in).nextDouble(), new Scanner(System.in).nextDouble()));*/

    }
}