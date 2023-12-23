import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int factorialNum = scanner.nextInt();
        int total = 1;
        for (int count = 1; count <= factorialNum; count++) {
            total = total * count;
        }
        System.out.println(total);
    }
}