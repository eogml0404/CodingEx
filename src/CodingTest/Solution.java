package CodingTest;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public void printQueue(Queue<Integer> queue, int location) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            if (i == location) {
                System.out.print("(" + queue.poll() + ") ");
            } else {
                System.out.print(queue.poll() + " ");
            }
        }
        System.out.println("(location)");
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Queue<Integer> pri_qu = new LinkedList<>();
        pri_qu.add(2);
        pri_qu.add(4);
        pri_qu.add(3);
        pri_qu.add(1);
        int location = 0;
        //2 4 3 1

        solution.printQueue(pri_qu, location);

    }
}