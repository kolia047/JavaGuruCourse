package Lesson_5;

public class MaxNumderTestThreeNumbers {
    public static void main(String[] args) {
        MaxNumderTestThreeNumbers maxNumderTestThreeNumbers = new MaxNumderTestThreeNumbers();
        maxNumderTestThreeNumbers.test1();
        maxNumderTestThreeNumbers.test2();
        maxNumderTestThreeNumbers.test3();
    }


    public void test1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxThreeNumbers(5, 8, 9);
        if (result == 9) {
            System.out.println("Test 1 = OK");
        } else {
            System.err.println("est 1 = FAIL");
        }
    }


    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxThreeNumbers(2, 8, 1);
        if (result == 8) {
            System.out.println("Test 2 = OK");
        } else {
            System.err.println("Test 2 = FAIL");
        }
    }

    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxThreeNumbers(11, 8, 9);
        if (result == 11) {
            System.out.println("Test 3 = OK");
        } else {
            System.err.println("est 3 = FAIL");
        }
    }
}
