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
        //While loop for printing half the messages.
        while (amount != 0) {
            System.out.println("Hello World.");
            amount = amount-1;
        }
        //For loop for printing the other half of the messages.
        for (i=0; i < amount; i++) {
            System.out.println("Hello World.");
        }
    }

    public void doWhileMethod() {

        Scanner input = new Scanner( System.in );
        //Allows to input a Yes or No answer.
        String answer = null;

        //Do While loop with request to continue or finish every cycle.
        do{
            System.out.println("Hello World");
            System.out.println( "¿Imprimir de nuevo? (Y/N)" );
            answer = input.nextLine();

        } while( answer.equalsIgnoreCase("y" ) );
    }

    public void whileInfiniteMethod() {

        Scanner scanner = new Scanner (System.in);
        int inicio = 0;
        System.out.println("Presione '1' y 'enter' para iniciar \n Nota: Para finalizar el programa debe utilizar el boton de 'detener' o Ctrl+F2.");
        inicio = scanner.nextInt();
        //Infinite While loop (must be stopped with the "Stop Main" button or Ctrl+F2
        while (inicio == 1) {
            System.out.println("Hello World.");
        }
    }

}
