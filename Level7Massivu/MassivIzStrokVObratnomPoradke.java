package Level7Massivu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MassivIzStrokVObratnomPoradke {

    public static void main(String[] args) throws Exception {

        String[] intArray = new String [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++ ) {
            intArray[i] = reader.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
    }
}
