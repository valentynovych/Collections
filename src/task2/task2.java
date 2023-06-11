package task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    private static List<String> numbersList = new LinkedList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stringIn;
        int position = 0;

        do {
            System.out.println("Please enter vehicle number and insert position \n" +
                    "\tor List for print all elements\n" +
                    "\tor Stop for exit ");
            stringIn = scanner.nextLine();

            Scanner scanner1 = new Scanner(stringIn);
            String number = scanner1.next();

            if (scanner1.hasNextInt()) {
                position = scanner1.nextInt();
            }

            switch (number) {
                case "Stop":
                    System.exit(0);
                    break;
                case "List":
                    printList(numbersList);
                    break;
                default:
                    addElementToPosition(number, position);

            }
        } while (true);
    }

    private static void addElementToPosition(String number, int position) {
        if (position > 0 && position <= numbersList.size()) {
            numbersList.add(position - 1, number);
            System.out.println("Vehicle number: " + number + " added to collection in to position: " + position);
        } else {
            numbersList.add(number);
            System.out.println("Vehicle number: " + number + " added to collection");
        }
    }

    private static void printList(List<String> numbersList) {
        System.out.println("All vehicle number in list: ");
        for (String number : numbersList) {
            System.out.println((numbersList.indexOf(number) + 1) + ") " + number);
        }
    }
}
