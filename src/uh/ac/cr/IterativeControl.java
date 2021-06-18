package uh.ac.cr;

import java.io.InputStream;
import java.util.Scanner;

public class IterativeControl {


    public void whileAndForMethod() {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        int i = 0;
        //Asking how many times user wants to print "Hello World."
        System.out.println("¿Cuantas veces desea imprimir el mensaje 'Hello World'?");
        amount = scanner.nextInt();
        //While loop for printing the message.
        while (amount != 0) {
            System.out.println("Hello World.");
            amount = amount-1;
        }
        for (i=0; i < amount; i++) {
            System.out.println("Hello World.");
        }
    }

    public void doWhileMethod() {

        Scanner input = new Scanner( System.in );
        String answer = null;

        do{
            System.out.println("Hello World");
            System.out.println( "¿Imprimir de nuevo? (Y/N)" );
            answer = input.nextLine();

        } while( answer.equalsIgnoreCase("y" ) );
    }


}
