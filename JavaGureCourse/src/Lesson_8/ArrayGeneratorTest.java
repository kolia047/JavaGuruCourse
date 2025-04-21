package Lesson_8;

public class ArrayGeneratorTest {
    public static void main(String[] args) {
        ArrayGeneratorTest arrays1Test = new ArrayGeneratorTest();
        arrays1Test.Test1();
    }

    void Test1() {

        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] arr = arrayGenerator.arraysCreate(7);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("TEST 1 = FAIL");
            }
        }
        System.out.println("TEST 1 = OK");
    }
}
