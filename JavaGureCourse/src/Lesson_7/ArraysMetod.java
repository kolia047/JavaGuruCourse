package Lesson_7;

public class ArraysMetod {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 36, 48, 96, 54, 12};
        ArraysMetod arraysMetod = new ArraysMetod();
        String s = arraysMetod.arrayPrint(numbers);
        System.out.println(s);

    }


    String arrayPrint(int[] arr) {
        String str = "";
        for (int n : arr) {
            str = str + n + " ";

        } return str;
    }
}
