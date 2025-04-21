package Lesson_8;

public class MaxIntTest {
    public static void main(String[] args) {
        MaxIntTest maxIntTest = new MaxIntTest();
        maxIntTest.Test1();
    }

    void Test1() {
        int[] elements = {5, 6, 4, 6, 9, 7, 1, 3, 6, 5};
        MaxFindGrade maxInt = new MaxFindGrade();
        int max = maxInt.findMaxGrade(elements);
        if (max == 9) {
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }
}
