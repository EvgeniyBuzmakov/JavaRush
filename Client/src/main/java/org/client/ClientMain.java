package org.client;

//import messages.MessageDocument;
import noNamespace.MessageDocument;
import org.apache.xmlbeans.impl.soap.MessageFactory;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) throws IOException {

//подключение к серверу
        Socket s = null;
        try {
            s = new Socket("localhost", 4999);
        }
         catch (IOException e) {
             //e.printStackTrace();
             System.out.println("не удалось соединиться с сервером");
             System.exit(0);
         }

        final MessageDocument message = MessageDocument.Factory.newInstance();
        MessageDocument.Message message1 =  message.addNewMessage();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите время"); //2058-01-05 16:25:25
        String time = scanner.nextLine();
        System.out.println("Пожалуйста, введите сообщение");
        String text = scanner.nextLine();

        message1.addNewHeader().setTime(time);
        message1.addNewBody().setText(text);

      //  System.out.println(message1);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(message1);
        pr.flush();
        pr.close();

    }
}
