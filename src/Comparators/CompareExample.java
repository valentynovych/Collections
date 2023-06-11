package Comparators;

public class CompareExample {
    public static void main(String[] args) {

        Person person = new Person("Jon", 20);
        Person person1 = new Person("Weak", 30);
        Person person2 = person;
        Person person3 = new Person("Jon", 20);

        System.out.println(person1.equals(person));
        System.out.println(person1.equals(person1));
        System.out.println(person2.equals(person));
        System.out.println(person3.equals(person));


        System.out.println("======================");

        PersonComparator example = new PersonComparator();
        int res = example.compare(person, person1);
        System.out.println(res);

        System.out.println("======================");

        Integer x = 2;
        System.out.println(x.compareTo(2));
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(1));

        System.out.println("======================");

        String string = "Test";
        System.out.println(string.compareTo("Test"));
        System.out.println(string.compareTo("Test1"));
        System.out.println(string.compareTo("Tes"));



    }
}
