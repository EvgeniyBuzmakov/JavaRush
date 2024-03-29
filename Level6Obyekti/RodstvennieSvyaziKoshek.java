package Level6Obyekti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Родственные связи кошек
*/
public class RodstvennieSvyaziKoshek {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrandFather,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat pap;
        private Cat mam;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat pap, Cat mam)
        {
            this.name = name;
            this.pap = pap;
            this.mam = mam;
        }

        @Override
        public String toString()
        {
            if (mam == null && pap == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (mam == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + pap.name;
            else if (pap == null)
                return "The cat's name is " + name + ", mother is " + mam.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mam.name + ", father is " + pap.name;
        }
    }

}