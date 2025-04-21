package Lesson_8;

public class ArrayGenerator {

    int[] arraysCreate(int arrayLength) {
        int[] arraysNew = new int[arrayLength];

        for (int i = 0; i < arraysNew.length; i++) {
            arraysNew[i] = 0;
        }
        return arraysNew;
    }
}
