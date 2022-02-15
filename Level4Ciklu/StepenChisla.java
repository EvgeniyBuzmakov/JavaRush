package Level4Ciklu;

public class StepenChisla {
    public static void main(String[] args) {

        System.out.println(functionStepen(3, 5));

    }
    public static int functionStepen (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)

        result = result * a;
        return result;
        //System.out.println(result);
    }
}
