package uh.ac.cr;

import java.util.Scanner;

public class IterativeControl {


    public void whileMethod() {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        //Asking how many times user wants to print "Hello World."
        System.out.println("¿Cuantas veces desea imprimir el mensaje 'Hello World'?");
        amount = scanner.nextInt();
        //While loop for printing the message.
        while (amount != 0) {
            System.out.println("Hello World.");
            amount = amount-1;
        }
    }
}
