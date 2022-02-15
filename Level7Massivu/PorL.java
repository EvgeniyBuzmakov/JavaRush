package Level7Massivu;
import java.util.ArrayList;
/*Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.*/
public class PorL
{
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings)
    {
        //напишите тут ваш код
        for (int i = 0; i < strings.size(); )
        { //нет увеличения i внутри цикла
            if (strings.get(i).contains("р") && !strings.get(i).contains("л"))  //если содержится р и нет л
            {
                strings.remove(i); //удаляем этот элемент и поэтому не изменяем значение счетчика
            }
            else
                {
                if (!strings.get(i).contains("р") && strings.get(i).contains("л"))
                {//если содержится л и нет р
                    strings.add(i + 1, strings.get(i)); //дублируем слово  следом за этим элементом

                    i += 2;//увеличиваем счетчик на 2, так как произвели вставку
                }
                else //для всех остальных вариантов комбинации букв
                    i++; //счетчик увеличиваем на 1 только если оставляем слово без изменений
                }
        }
        return strings;
    }
}