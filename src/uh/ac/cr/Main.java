package uh.ac.cr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IterativeControl iterativeControl = new IterativeControl();
        int option = 0;

        while (option!=5) {

            System.out.println("Por favor seleccione un metodo a utilizar:\n 1. Metodo 'While & For'.\n 2. Imprimir y volver a preguntar\n 3. Metodo 'While' hasta escoger la detención del programa.\n 4. Finalizar.");
            option = scanner.nextInt();

            if (option == 4) {
                //Closing the application.
                System.out.println("Finalizó...");
                break;
            }else {
                switch (option) {
                    case 1:
                        //While and For method.
                        iterativeControl.whileAndForMethod();
                        break;

                    case 2:
                        //Do While until user wants to stop.
                        iterativeControl.doWhileMethod();
                        break;

                    case 3:

                }
            }
        }

        //3- Todo ask the user if he wants to print hello using a while structure to keep printing until user wants to stop.

        //Do all the code needed for the previous items on the class created. Use main just to call the methods.
    }
}
