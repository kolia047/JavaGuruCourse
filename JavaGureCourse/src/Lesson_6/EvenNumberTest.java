package Lesson_6;

public class EvenNumberTest {

    public static void main(String[] args) {

        EvenNumberTest evenNumber = new EvenNumberTest();
        evenNumber.test1();
        evenNumber.test2();
        evenNumber.test3();

    }

    public void test1() {
        //2->true
        EvenNumber evenNumber = new EvenNumber();
        boolean bb = evenNumber.isEven(2);

        checkResult(bb, "1");
    }

    //3->false
    public void test2() {

        EvenNumber evenNumber = new EvenNumber();
        boolean bb = evenNumber.isEven(3);
        checkResult(bb, "2");

    }

    //-1->false
    public void test3() {

        EvenNumber evenNumber = new EvenNumber();
        boolean bb = evenNumber.isEven(-1);
       checkResult(bb, "3");
    }

    private void checkResult(boolean a, String nameTest) {
        if (a == true) {
            System.out.println("Test " + nameTest + " = OK chetnoe");
        } else {
            System.out.println("Test " + nameTest + " = Ne chetnoe");
        }
    }
}
