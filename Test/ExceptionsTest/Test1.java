package Test.ExceptionsTest;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            throw new RuntimeException();
        }
        catch (NullPointerException ex) {
            System.out.println(2);
        }
        catch (Error ex) {
            System.out.println(4);
        }
        catch (Exception e) {
            System.out.println(3);
        }
        Throwable ggg = new RuntimeException();


        System.out.println(5);
    }

}
