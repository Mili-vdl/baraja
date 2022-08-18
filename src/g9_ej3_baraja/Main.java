/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_ej3_baraja;

import entidades.Baraja;
import entidades.Carta;
import java.util.Scanner;

/**
 *
 * @author Milagros
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carta c = new Carta();
        Baraja mazo = new Baraja();

        System.out.println("Abriendo baraja nueva...\n");
        mazo.crearMazo();
        //mazo.mostrarBaraja();
        System.out.println("Mezclando cartas...\n");
        mazo.barajar();

        int option;
        do {
            System.out.println("** MENU **");
            System.out.println("1. Dar una cantidad de cartas");
            System.out.println("2. Mostrar las cartas que ya han salido");
            System.out.println("3. Mostrar como quedó la baraja");
            System.out.println("4. Mostrar cantidad de cartas disponibles");
            System.out.println("5. Salir");

            option = scan.nextInt();
            switch (option) {
                case 1:
                    mazo.darCartas();
                    break;
                case 2:
                    mazo.cartasMonton();
                    break;
                case 3:
                    System.out.println("El mazo quedó");
                    mazo.mostrarBaraja();
                    break;
                case 4:
                    mazo.cartasDisponibles();
                    break;
            }
        } while (option != 5);

    }

}
