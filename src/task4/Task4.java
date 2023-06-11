package task4;

import java.util.*;

public class Task4 {
    private static Map<String, String> numbersMap = new HashMap();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter vehicle number and owner \n" +
                "\tor List for print all elements\n" +
                "\tor Stop for exit ");

        String stringIn;
        String number;
        String owner;

        do {
            System.out.print("Please enter vehicle number ");

            stringIn = scanner.next();
            switch (stringIn) {
                case "Stop":
                    System.exit(0);
                    break;
                case "List":
                    printList(numbersMap);
                    break;
                case "Vehicles":
                    printListVehicle(numbersMap.keySet());
                    break;
                case "Owners":
                    printListOwners(numbersMap.values());
                    break;
                default:
                    System.out.print("Please enter owner this vehicle number ");
                    number = stringIn;
                    owner = scanner.next();
                    addElementToPosition(number, owner);
            }


        } while (true);
    }

    private static void addElementToPosition(String number, String owner) {

        if (numbersMap.containsKey(number)) {
            numbersMap.replace(number, owner);
            System.out.println("In vehicle: " + number + "has updated owner to: " + owner);
        } else {
            numbersMap.put(number, owner);
            System.out.println("Vehicle number: " + number + " with owner " + owner + " added to collection");
        }
    }

    private static void printList(Map<String, String> numbersMap) {
        System.out.println("All vehicle number with owner list: ");
        //numbersMap.forEach((s, s2) -> System.out.println("Vehicle: " + s + " Owner: "  + s2));
        for (Map.Entry<String, String> entry : numbersMap.entrySet()) {
            System.out.println("Vehicle: " + entry.getKey() + " Owner: " + entry.getValue());
        }
    }


    private static void printListVehicle(Set<String> listVehicle) {
        System.out.println("All vehicle number in list: ");
        for (String vehicle : listVehicle) {
            System.out.println(" " + vehicle);
        }
    }

    private static void printListOwners(Collection<String> listOwners) {
        System.out.println("All vehicle number in list: ");
        for (String owner : listOwners) {
            System.out.println(" " + owner);
        }
    }
}
