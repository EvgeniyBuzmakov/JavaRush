package Level9Isklucheniya;
/*
Все свои, даже исключения
*/
public class VseSvoiDasheIsklucheniya {
    public static void main(String[] args) {
    }

    static class MyException extends Exception {
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends MyException3{
    }
}




