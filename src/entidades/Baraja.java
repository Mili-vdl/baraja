/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Milagros
 */
public class Baraja {

    List<Carta> mazoNuevo;
    List<Carta> cartasRepartidas;
    Scanner scan;

    public Baraja() {
        this.scan = new Scanner(System.in);
        this.mazoNuevo = new ArrayList();
        this.cartasRepartidas = new ArrayList();
    }

    public void crearMazo() {
        for (Palo palo : Palo.values()) {
            for (int i = 1; i < 13; i++) {
                if (i == 8 || i == 9) {
                    //nada
                } else {
                    Carta c = new Carta(palo, i);
                    mazoNuevo.add(c);
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(mazoNuevo);
    }

    public Carta siguienteCarta() {
        Carta c = mazoNuevo.get(0);
        //System.out.println("La siguiente carta es el " + mazoNuevo.get(0));
        cartasRepartidas.add(c);
        mazoNuevo.remove(0);
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son: " + mazoNuevo.size());
    }

    public void darCartas() {
        System.out.println("¿Cuantas cartas quiere dar?");
        int cant = scan.nextInt();
        if (cant > this.mazoNuevo.size()) {
            System.out.println("No hay suficientes cartas");
        } else {
            for (int i = 0; i < cant; i++) {
                System.out.println("Repartir " + siguienteCarta());
            }
        }
    }

    public void cartasMonton() {
        System.out.println("Las cartas que ya salieron son: ");
        for (Carta c : cartasRepartidas) {
            System.out.println(c);
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : mazoNuevo) {
            System.out.println(carta);
        }
    }
}
