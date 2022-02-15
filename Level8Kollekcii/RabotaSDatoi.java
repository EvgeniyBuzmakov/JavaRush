package Level8Kollekcii;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать два метода.
•	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
•	Метод main() должен вызывать метод isDateOdd().
*/

public class RabotaSDatoi {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date date1 = new Date();
        date1.setMonth(0);
        date1.setDate(1);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        Date datee = new Date(date);

        long over = datee.getTime() - date1.getTime();
        long msday = 24*60*60*1000;

        int daycount = (int)(over/msday);
        if(daycount%2==0){
            return true;
        }
        else return false;
    }
}