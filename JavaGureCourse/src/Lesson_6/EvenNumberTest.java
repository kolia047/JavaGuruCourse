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

        if (evenNumber.isEven(2) == true) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }
//3->false
    public void test2() {

        EvenNumber evenNumber = new EvenNumber();

        if (evenNumber.isEven(3) == false) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }


    //-1->false
    public void test3() {

        EvenNumber evenNumber = new EvenNumber();

        if (evenNumber.isEven(-1) == false) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
}
