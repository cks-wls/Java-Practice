package middle2.collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> scheduler = new ArrayDeque<>();

    public void addTask(Task task) {
        scheduler.offer(task);
    }

    public int getRemainingTasks() {
        return scheduler.size();
    }

    public void processNextTask() {
        scheduler.poll().execute();
    }
}
