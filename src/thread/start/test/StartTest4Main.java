package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {

  public static void main(String[] args) {
    Thread threadA = new Thread(new PrintWork('A', 1000), "Thread-A");
    Thread threadB = new Thread(new PrintWork('B', 500), "Thread-B");
    threadA.start();
    threadB.start();
  }

  static class PrintWork implements java.lang.Runnable {
    private char content;
    private int sleepMs;

    public PrintWork(char content, int sleepMs) {
      this.content = content;
      this.sleepMs = sleepMs;
    }

    @Override
    public void run() {
      while (true) {
        log(content);
        try {
          Thread.sleep(sleepMs);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

}
