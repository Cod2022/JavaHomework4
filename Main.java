public class Main {
    public static void main(String[] args) {
        
        System.out.println("Задача 1: ");
        TaskI taskI = new TaskI();
        taskI.reversedList();
        System.out.println();

        System.out.println("Задача 2: ");
        TaskII taskII = new TaskII();
        taskII.enqueue();
        System.out.println();
        taskII.dequeue();
        System.out.println();
        taskII.first();
    }
}
