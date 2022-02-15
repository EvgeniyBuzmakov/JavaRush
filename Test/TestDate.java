package Test;

import java.util.Date;

public class TestDate
{
    public static void main(String[] args) throws Exception
    {
        Date today = new Date();
        System.out.println("Current date: " + today);
        System.out.println("--------------------------------------------------------------------------------");
        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(2000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");

        System.out.println(newTime.getSeconds());
        System.out.println("--------------------------------------------------------------------------------");
        Date currentTime1 = new Date();
        int hours = currentTime1.getHours();
        int mins = currentTime1.getMinutes();
        int secs = currentTime1.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(System.currentTimeMillis());

    }
}
