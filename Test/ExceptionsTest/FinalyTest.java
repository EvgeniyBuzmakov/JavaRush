package Test.ExceptionsTest;

import java.io.File;

public class FinalyTest {

    public static void main(String[] args) {

        FinalyTest testFile = new FinalyTest();
        System.out.println(testFile.ma());

    }

    public  String[] ma() {

        try{
            System.out.println("TRY");

           // int a = 4 / 0;
            return new String[1];
        }
        catch(Exception e) {
            System.out.println("CATCH");
            return new String[2];
        }
        finally {
            System.out.println("FINALLY");
            return new String[3];
        }
    }

}
