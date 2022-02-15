package Test;

public class TelevizorMain
{
    public static void main(String[] args)
    {
        //Televizor.on();
        Televizor sony = new Televizor();

        sony.on("55555555555555");

        Televizor.test();
        System.out.println("-------------------------------------------");

        int c = 10;
        int b = 99999;

     //   totem(c, b);
     //   totem(55, 45);

       // totem(sony);



    }

    static void totem(Televizor o)
    {
        System.out.println(o.visota);
        o.off();
    }


}
