/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: 
 * enqueue() - помещает элемент в конец очереди. 
 * dequeue() - возвращает первый элемент из очереди и удаляет его. 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
import java.util.LinkedList;
import java.util.Random;

public class TaskII {
    Random random = new Random();

    public void enqueue() {
        LinkedList<Integer> myList = new LinkedList<>();
        int listSize = random.nextInt(7);
        int randomValue = random.nextInt(10);

        for (int i = 0; i < listSize + 2; i++) {
            int listValues = random.nextInt(10);
            myList.add(listValues);
        }
        System.out.println("Исходный список: " + myList);

        myList.add(randomValue);

        System.out.println("Добавлен элемент в конец: " + randomValue);
        System.out.println("Конечный список: " + myList);
    }

    public Integer dequeue() {
        LinkedList<Integer> myList2 = new LinkedList<>();
        int listSize = random.nextInt(5);

        for (int i = 0; i < listSize + 2; i++) {
            int listValues = random.nextInt(10);
            myList2.add(listValues);
        }
        System.out.println("Исходный список: " + myList2);

        int firstElement = myList2.pop();

        System.out.println("Удалён 1-ый элемент: " + firstElement);
        System.out.println("Конечный список: " + myList2);
        return firstElement; 
    }

    public Integer first() {
        LinkedList<Integer> myList3 = new LinkedList<>();
        int listSize = random.nextInt(6);

        for (int i = 0; i < listSize + 2; i++) {
            int listValues = random.nextInt(10);
            myList3.add(listValues);
        }
        System.out.println("Исходный список: " + myList3);

        int firstElement = myList3.get(0);

        System.out.println("Возвращён 1-ый элемент: " + firstElement);
        System.out.println("Исходный список остаётся без изменений: " + myList3);
        return firstElement;
    }
}
