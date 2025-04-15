package Lesson_5;

public class Calculator {

    boolean isEven(int number) {
        return (number % 2) == 0;
    }

    int findAverage(int number1, int number2) {
        return (number1 + number2) / 2;
    }

    int maxNumber(int number1, int number2) {
        return Math.max(number1, number2);
    }
}
