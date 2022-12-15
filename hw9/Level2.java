package HWs.hw9;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Level2 {
    //TODO:
    // Дан односвязный список. Написать функцию или блок схему, определяющую,
    // образуют ли его элементы симметричную последовательность.
    // Для решения задачи использовать стек и очередь.
    // Функция будет возвращать значение true, если список является симметричным, false – в противном случае.
    // По определению пустой список является симметричным.
    // Поэтому, если список пуст, то возвращаем значение true.
    // Для проверки симметричности списка нужно проверить на равенство все пары элементов, равностоящих от середины списка.
    // Каждая пара содержит один элемент из первой половины списка и один – из второй.
    // Элементы первой половины списка последовательно заносятся в очередь, второй половины в стек.
    // Если количество элементов списка будет нечетным, то серединный элемент будет симметричен сам себе
    // и не будет помещен ни в очередь, ни в стек и не будет влиять на результат.
    public static void main(String[] args) {

        LinkedList<String> listStr = new LinkedList<>(){{
            add("a");
            add("b");
            add("c");
            add("c");
            add("b");
            add("a");

        }};

        LinkedList<Integer> listInt = new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(3);
            add(2);
            add(1);
        }};

        LinkedList<String> listStr1 = new LinkedList<>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("c");
            add("b");
            add("a");

        }};

        LinkedList<Integer> listInt1 = new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(3);
            add(2);
            add(1);
        }};

        LinkedList<String> listStr2 = new LinkedList<>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
            add("g");

        }};

        LinkedList<Integer> listInt2 = new LinkedList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};


        System.out.println(checkLinkedList(listStr)); //true
        System.out.println(checkLinkedList(listInt)); //true
        System.out.println(checkLinkedList(listStr1)); //true
        System.out.println(checkLinkedList(listInt1)); //true
        System.out.println(checkLinkedList(listStr2)); //false
        System.out.println(checkLinkedList(listInt2)); //false




    }

    public static <T> boolean checkLinkedList(LinkedList<T> list){
        int size = list.size();
        Stack<T> stack = new Stack<>();
        Queue<T> queue = new ArrayDeque<>();
        if (size % 2 == 0){
            for (int i = 0; i < size/2; i++) {
                stack.push(list.get(i));
            }
            for (int i = size/2; i < size; i++) {
                queue.add(list.get(i));
            }



        } else {
            for (int i = 0; i < size/2; i++) {
                stack.push(list.get(i));
            }
            for (int i = size/2+1; i < size; i++) {
                queue.add(list.get(i));
            }
        }
        while (!(stack.isEmpty() && queue.isEmpty())){
            if (stack.peek().equals(queue.peek())){
                stack.pop();
                queue.poll();
            } else break;
        }
        return (stack.isEmpty() && queue.isEmpty());

    }
}
