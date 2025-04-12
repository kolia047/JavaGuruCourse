package Lesson_2;

import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введитье число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введитье число: ");
        int number2 = scanner.nextInt();

        System.out.println("Введитье число: ");
        int number3 = scanner.nextInt();

        double p = (double) (number1 + number2 + number3) / 2;

        double s = Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));

        System.out.println(s);
    }
}
