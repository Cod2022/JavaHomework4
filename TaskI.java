/* Задача 1. 
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.LinkedList;
import java.util.Random;

public class TaskI {
    
    public void reversedList() {
        LinkedList<Integer> myList = new LinkedList<>();
        LinkedList<Integer> reversedList = new LinkedList<>();
        Random random = new Random();
        int listSize = random.nextInt(10);


        for (int i = 0; i < listSize + 2; i++) {
            int listValues = random.nextInt(10);
            myList.add(listValues);
        }
        System.out.println("Исходный список: " + myList);

        for (int j = myList.size() - 1; j >= 0; j--) {
            reversedList.add(myList.get(j));
        }
        System.out.println("Перевёрнутый список: " + reversedList);
    }
}
