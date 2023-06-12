package task6;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        Person person1 = new Person(12, "Ron", 26);
        Person person2 = new Person(2, "Kolya", 23);
        Person person3 = new Person(132, "Sasha", 21);
        Person person4 = new Person(15, "Sergiy", 43);
        Person person5 = new Person(121, "Olia", 18);
        Person person6 = new Person(15, "Misha", 34);
        Person person7 = new Person(68, "Dima", 15);
        Person person8 = new Person(48, "Artur", 7);
        Person person9 = new Person(2, "Jack", 35);
        Person person10 = new Person(100, "Piter", 23);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);


        System.out.println("Unsorted collection persons: ");
        for (Person person : personList) {
            System.out.println(person);
        }
        Set<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
        personSet.add(person7);
        personSet.add(person8);
        personSet.add(person9);
        personSet.add(person10);

        System.out.println("\n=================================\n");
        System.out.println("TreeSet persons sorted by id");
        for (Person person : personSet) {
            System.out.println(person);
        }

        personList.sort(new IdComparator());
        System.out.println("\n=================================\n");
        System.out.println("Collection sorted by id");
        for (Person person : personList) {
            System.out.println(person);
        }

        personList.sort(new AgeComparator());
        System.out.println("\n=================================\n");
        System.out.println("Collection sorted by age");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
