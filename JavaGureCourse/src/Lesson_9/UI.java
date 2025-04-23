package Lesson_9;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        UI ui = new UI();
        BusinessLogic bs = new BusinessLogic();
        while (true) {
            ui.printMenu();
            int userChoice = ui.getUserChoice();
            ui.executeUserChoice(bs, userChoice);
        }
    }

    private void printMenu() {
        System.out.println("Program menu: ");
        System.out.println("1. Add new mark");
        System.out.println("2. Show All Marks");
        System.out.println("3. Show best mark by subject");
        System.out.println("4. Exit");
    }

    private int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select menu item to execute:");
        return scanner.nextInt();
    }

    private void executeUserChoice(BusinessLogic businessLogic, int userChoice) {
        if (userChoice == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter subject:");
            String subject = sc.nextLine();
            System.out.println("Enter mark:");
            int mark = Integer.parseInt(sc.nextLine());
            businessLogic.addMark(subject, mark);
        }
        if (userChoice == 2) {
            System.out.println("All marks:");
            for (Mark mark : businessLogic.getAllMarks()) {
                System.out.println(mark.getSubject() + " " + mark.getMark());
            }
        }
        if (userChoice == 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("All subject:");
            String subject = sc.nextLine();
            int bestMark = businessLogic.findBestMark(subject);
            System.out.println("Best mark " + bestMark);
        }
        if (userChoice == 4) {
            System.exit(0);
        }
    }
}
