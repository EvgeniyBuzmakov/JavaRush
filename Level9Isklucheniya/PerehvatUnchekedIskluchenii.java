package Level9Isklucheniya;

/*
Перехват unchecked-исключений
*/

public class PerehvatUnchekedIskluchenii {
    public static void main(String[] args) {
        handleExceptions(new PerehvatUnchekedIskluchenii());
    }

    public static void handleExceptions(PerehvatUnchekedIskluchenii obj) {
      try {
          obj.method1();
          obj.method2();
          obj.method3();
      }
       catch (RuntimeException e) {
           printStack(e);
       }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

