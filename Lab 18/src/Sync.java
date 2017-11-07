import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Sync {
public static Integer sum = 0;

public static void main(String[] args) {
	ExecutorService executor = Executors.newFixedThreadPool(1000);
	Task[] tasks = new Task[1000];
	long startTime = System.currentTimeMillis();
	for (int i = 0; i < tasks.length; i++) {
		tasks[i] = new Task();
		executor.execute(tasks[i]);
	}	
	executor.shutdown();
	while (!executor.isTerminated()) {

        try {

                        Thread.sleep(1);

        } catch (InterruptedException ex) {

                        ex.printStackTrace();

        }

}
	long endTime = System.currentTimeMillis();
	System.out.println("Time Spent: " + (endTime-startTime));
	System.out.println(sum);
}
public static synchronized void incr() {
	sum++;
}
static class Task implements Runnable {
	public Task() {
		
	}
	public void run() {
		Sync.incr();
	}
}
}
