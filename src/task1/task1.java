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
            System.out.println("Please enter car number or List or Stop: ");
            number = scanner.next();
            switch (number) {
                case "Stop":
                    System.exit(0);
                    break;
                case "List":
                    System.out.println(numbersList);
                default:
                    numbersList.add(number);
            }
        } while (true);
    }
}