package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileFlagMain {

  public static void main(String[] args) {
    MyTask task = new MyTask();
    Thread thread = new Thread(task);
    log("isRunning = " + task.isRunning);
    thread.start();

    sleep(1000);
    log("isRunning을 false로 변경 시도");
    task.isRunning = false;
    log("isRunning = " + task.isRunning);
    log("main 종료");
  }

  static class MyTask implements Runnable {
    boolean isRunning = true;

    @Override
    public void run() {
      log("task start");
      while (isRunning) {
        // isRunning이 false면 탈출
      }
      log("task 종료");
    }
  }

}
