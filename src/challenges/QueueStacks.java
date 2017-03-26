package challenges;

import java.util.Scanner;
import java.util.Stack;
/**
 * Created by Gustavo on 24/03/17.
 */
public class QueueStacks {

        public static class MyQueue<T> {
            Stack<T> stackNewestOnTop = new Stack<T>();
            Stack<T> stackOldestOnTop = new Stack<T>();

            public void enqueue(T value) { // Push onto newest stack
                stackNewestOnTop.add(value);
            }

            public T peek() {
                return stackNewestOnTop.get(0);
            }

            public T dequeue() {
                T obj = stackNewestOnTop.get(0);
                stackOldestOnTop.add(obj);
                stackNewestOnTop.remove(obj);
                return obj;
            }
        }


        public static void main(String[] args) {
            MyQueue<Integer> queue = new MyQueue<Integer>();

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                int operation = scan.nextInt();
                if (operation == 1) { // enqueue
                    queue.enqueue(scan.nextInt());
                } else if (operation == 2) { // dequeue
                    queue.dequeue();
                } else if (operation == 3) { // print/peek
                    System.out.println(queue.peek());
                }
            }
            scan.close();
        }

}
