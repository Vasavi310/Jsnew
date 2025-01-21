class SampleThread extends Thread{
public void run() {
System.out.println("Inside SampleThread");
System.out.println("Current Thread: " +
Thread.currentThread().getName());
System.out.println("Current Thread: " +
Thread.currentThread().getPriority());
}
}
public class MyThreadTest {
public static void main(String[] args) {
SampleThread threadObject1 = new SampleThread();
SampleThread threadObject2 = new SampleThread();
threadObject1.setName("first");
threadObject2.setName("second");
threadObject1.setPriority(4);
threadObject2.setPriority(Thread.MAX_PRIORITY);
threadObject1.start();
threadObject2.start();
}
}
