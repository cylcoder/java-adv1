package thread.control;

import static util.ThreadUtils.sleep;

public class CheckedExceptionMain {

  public static void main(String[] args) throws Exception {

  }

  static class CheckedRunnable implements Runnable {
    @Override
    public void run() /* throws Exception */ { // 주석 풀면 예외 발생
//      throw new Exception(); // 주석 풀면 예외 발생
    }
  }

}
