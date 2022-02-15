package Level9Isklucheniya;
/*
Там, в синих глубинах стек-трейса…
Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/
public class TamVSinihGlubinahSteckTrasa {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код

/*        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement element : stackTraceElements)
        {
     //       System.out.println(element.getMethodName());
            count++;
        }
        System.out.println(count);
        return count;
 */
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        System.out.println(stack.length);
        return stack.length;
    }
}