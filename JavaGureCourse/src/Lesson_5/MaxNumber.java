package Lesson_5;

public class MaxNumber {

    int findMax(int number1, int number2) {
        return Math.max(number1, number2);
    }

    int findMaxThreeNumbers(int number1, int number2, int number3) {
        return Math.max(Math.max(number1, number2), number3);
    }
}
