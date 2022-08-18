/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Palo;

/**
 *
 * @author Milagros
 */
public class Carta {

    private Palo palo;
    private int numero;

    public Carta() {
    }

    public Carta(Palo palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{ Numero=" + numero + "  Palo=" + palo + '}';
    }

}
