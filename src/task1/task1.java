package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        List<String> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String number;

        do {
            System.out.println("Please enter vehicle number or List or Stop: ");
            number = scanner.next();
            switch (number) {
                case "Stop":
                    System.exit(0);
                    break;
                case "List":
                    printList(numbersList);
                default:
                    numbersList.add(number);
                    System.out.println("Vehicle number: " + number + " added to collection");
            }
        } while (true);
    }

    private static void printList(List<String> numbersList) {
        System.out.println("All vehicle number in list: ");
        for (String number : numbersList) {
            System.out.println((numbersList.indexOf(number) + 1) + ") " + number);
        }
    }
}