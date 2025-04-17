package Lesson_7;

public class ArraysMetodTest {
    public static void main(String[] args) {
        ArraysMetodTest arraysMetodTest = new ArraysMetodTest();
        arraysMetodTest.test1();
        arraysMetodTest.test2();


    }

    // add arrays[3]{1,2,3} -> 1 2 3

    void test1() {
        int[] arr = {1, 2, 3};
        ArraysMetod arraysMetod = new ArraysMetod();
        String s = arraysMetod.arrayPrint(arr);
        if (s.equals("1 2 3 ")) {
            System.out.println("test 1 = OK");
        } else {
            System.out.println("test 1 = FAIL");
        }
    }

    // add arrays[3]{3,2,1} -> 3 2 1
    void test2() {
        int[] arr = {3, 2, 1};
        ArraysMetod arraysMetod = new ArraysMetod();
        String s = arraysMetod.arrayPrint(arr);
        if (s.equals("3 2 1 ")) {
            System.out.println("test 2 = OK");
        } else {
            System.out.println("test 2 = FAIL");
        }
    }
}
