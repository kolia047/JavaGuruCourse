package Lesson_5;

public class maxNumberTest {

    public static void main(String[] args) {
        maxNumberTest maxNumberTest = new maxNumberTest();
        maxNumberTest.test1();
        maxNumberTest.test2();
        maxNumberTest.test3();
    }

    // 2, 5 -> 5

    public void test1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(2, 5);
        if (result == 5) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // 5, 2 -> 5
    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(5, 2);
        if (result == 5) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    // 5, 5 -> 5
    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(5, 5);
        if (result == 5) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
}
