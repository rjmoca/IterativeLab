package uh.ac.cr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IterativeControl iterativeControl = new IterativeControl();
        int option = 0;

        while (option!=5) {

            System.out.println("Por favor seleccione una opción:\n 1. Metodo 'While'.\n 2. Metodo 'For'.\n 3. Metodo 'Do While'\n 4. Metodo 'While' hasta escoger la detención del programa.\n 5. Finalizar.");
            option = scanner.nextInt();

            if (option == 5) {
                //Closing the application.
                System.out.println("Finalizó...");
                break;
            }else {
                switch (option) {
                    case 1:
                        //While method.
                        iterativeControl.whileMethod();
                        break;

                    case 2:

                    case 3:

                    case 4:

                    case 5:

                }
            }
        }
        //Do the next operation on the new class created.

        //1- Todo. Ask user how many time he wants to print hello world on screen.
            //1.1- Todo. Print Hello world as many times as user defined. Use a while structure.
            //1.2- Todo. Print Hello world as many times as user defined. Use a for structure.

        //2- Todo Print hello world and ask the user if he wants to print hello again using a Do while structure.

        //3- Todo ask the user if he wants to print hello using a while structure to keep printing until user wants to stop.

        //Do all the code needed for the previous items on the class created. Use main just to call the methods.
    }
}
