package Test;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CofeMashina {

    public static void main(String[] args) {
        System.out.println("Кофе-машина");
        //TODO: read number from console
        //int moneyAmount = 120;
        System.out.println("Внесите, пожалуйста, деньги за напиток");
        Scanner in = new Scanner(System.in);
        int moneyAmount = in.nextInt();

        System.out.println("Вы внесли: " + moneyAmount + " руб.");

        int[] drinkPrices = {180, 170, 120, 90};
        String[] drinkNames = {"капучино", "латте", "американо", "молоко"};

        boolean canBuySomething = false;

        for(int i = 0; i < drinkPrices.length; i = i + 1) {
            if(moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " +
                        drinkNames[i]);
                canBuySomething = true;
            }
        }
        if(!canBuySomething) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }
        //TODO: 20210607_173958
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(formatter.format(now));

        //TODO: capture screenshot to BufferedImage
        //BufferedImage image = null;
        //System.out.println(image.getWidth() + "x" + image.getHeight());
try {
    Robot robot = new Robot();
    Rectangle screen = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    BufferedImage image = robot.createScreenCapture(screen);
    System.out.println(image.getWidth() + "x" + image.getHeight());
} catch (AWTException e) {
    e.printStackTrace();
}
        //TODO: make screenshots of your code
        //  and result in console and send to
        //  Telegram-chat with hash-code #ilovejava
    }
}