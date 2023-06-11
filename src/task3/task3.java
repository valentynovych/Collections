package task3;

import java.util.*;

public class task3 {
    private static Set<String> numbersList = new HashSet<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stringIn;

        do {
            System.out.println("Please enter vehicle number\n" +
                    "\tor List for print all elements\n" +
                    "\tor Stop for exit ");

            stringIn = scanner.next();

            switch (stringIn) {
                case "Stop":
                    System.exit(0);
                    break;
                case "List":
                    printList(numbersList);
                    break;
                default:
                    addElementToPosition(stringIn);

            }
        } while (true);
    }

    private static void addElementToPosition(String number) {

        if (numbersList.add(number)) {
            System.out.println("Vehicle number: " + number + " added to collection");
        } else {
            System.out.println("This number already exist");
        }
    }


    private static void printList(Set<String> numbersList) {
        System.out.println("All vehicle number in list: ");
        for (String number : numbersList) {

            System.out.println(" " + number);
        }
    }
}
