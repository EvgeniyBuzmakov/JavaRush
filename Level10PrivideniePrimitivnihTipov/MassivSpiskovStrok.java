package Level10PrivideniePrimitivnihTipov;

import java.util.ArrayList;

/*
Массив списков строк
*/

public class MassivSpiskovStrok {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
   //     ArrayList<String> list = new ArrayList<String>();
        ArrayList[] list = new ArrayList[3];
        list[0] = new ArrayList();
        list[0].add("a");
        list[0].add("b");
        list[0].add("c");
        list[1] = new ArrayList();
        list[1].add("aa");
        list[1].add("bb");
        list[1].add("cc");
        list[2] = new ArrayList();
        list[2].add("test");
        list[2].add("proba");
        list[2].add("pera");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}