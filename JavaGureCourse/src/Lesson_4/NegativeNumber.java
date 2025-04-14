package Lesson_4;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean result = number > 0;
        System.out.println(result);
    }
}
