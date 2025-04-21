package Lesson_8;

public class MaxFindGrade {


    int findMaxGrade(int[] elements) {
        int max = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }
}
