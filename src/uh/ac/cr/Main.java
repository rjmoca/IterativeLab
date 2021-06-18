package uh.ac.cr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IterativeControl iterativeControl = new IterativeControl();
        int option = 0;

        while (option!=5) {

            System.out.println("Por favor seleccione un metodo a utilizar:\n 1. Metodo 'While & For'.\n 2. Metodo 'Do While'.\n 3. Imprimir y volver a preguntar\n 4. Metodo 'While' hasta escoger la detención del programa.\n 5. Finalizar.");
            option = scanner.nextInt();

            if (option == 5) {
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

                    case 3:

                    case 4:

                    case 5:

                }
            }
        }

        //2- Todo Print hello world and ask the user if he wants to print hello again using a Do while structure.

        //3- Todo ask the user if he wants to print hello using a while structure to keep printing until user wants to stop.

        //Do all the code needed for the previous items on the class created. Use main just to call the methods.
    }
}
