package Level9Isklucheniya;
/*
Кто меня вызывал?
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
*/
public class KtoMenyaVuzval {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
     //   System.out.println(stackTraceElements[2].getMethodName());
     //   System.out.println(stackTraceElements[2].getLineNumber());
        return  /*напишите тут ваш код*/ stackTraceElements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //    System.out.println(stackTraceElements[2].getMethodName());
     //   System.out.println(stackTraceElements[2].getLineNumber());
        return  /*напишите тут ваш код*/ stackTraceElements[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //    System.out.println(stackTraceElements[2].getMethodName());
    //    System.out.println(stackTraceElements[2].getLineNumber());
        return  /*напишите тут ваш код*/ stackTraceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //    System.out.println(stackTraceElements[2].getMethodName());
     //   System.out.println(stackTraceElements[2].getLineNumber());
        return  /*напишите тут ваш код*/ stackTraceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //    System.out.println(stackTraceElements[2].getMethodName());
    //    System.out.println(stackTraceElements[2].getLineNumber());
        return  /*напишите тут ваш код*/ stackTraceElements[2].getLineNumber();
    }
}