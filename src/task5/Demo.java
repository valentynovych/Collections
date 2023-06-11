package task5;

public class Demo {
    public static void main(String[] args) {
        ArrayListTime arrayListTime = new ArrayListTime();
        LinkedListTime linkedListTime = new LinkedListTime();

        arrayListTime.fillArray();
        linkedListTime.fillArray();
        System.out.println();

        arrayListTime.addLast();
        linkedListTime.addLast();
        System.out.println();

        arrayListTime.addFirstPart();
        linkedListTime.addFirstPart();
        System.out.println();

        arrayListTime.getLast();
        linkedListTime.getLast();
        System.out.println();

        arrayListTime.getFirstPart();
        linkedListTime.getFirstPart();
        System.out.println();

        arrayListTime.removeLast();
        linkedListTime.removeLast();
        System.out.println();

        arrayListTime.removeFirstPart();
        linkedListTime.removeFirstPart();
        System.out.println();
    }
}
