package task1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        MyLinkedList<Long> list = new MyLinkedList<>();
        Random random = new Random(System.currentTimeMillis());
        Long range = random.nextLong(50L);
        for (int i = 0; i < range; i++) {
            list.add(random.nextLong(100L));
        }
        list.printList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для удаления или -1 для выхода");
        Long value = scanner.nextLong();
        while (value != -1) {
            list.delete(value);
            list.printList();
            value = scanner.nextLong();
        }
    }
}
