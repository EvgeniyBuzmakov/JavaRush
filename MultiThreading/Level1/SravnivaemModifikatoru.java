package MultiThreading.Level1;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
Сравниваем модификаторы


public class SravnivaemModifikatoru {


    public static void main(String[] args) {
        int classModifiers = SravnivaemModifikatoru.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {

        return false;
    }

    private static Method getMainMethod() {
        Method[] methods = SravnivaemModifikatoru.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
   class Modifier {}
}

*/