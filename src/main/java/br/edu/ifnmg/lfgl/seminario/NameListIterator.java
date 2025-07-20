/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lfgl.seminario;

/**
 *
 * @author Loiola
 */
public class NameListIterator 
        implements Iterator {

    private String[] nomes;
    private int indice = 0;

    public NameListIterator(String[] nomes) {
        this.nomes = nomes;
    }

    @Override
    public boolean hasNext() {
        return indice < nomes.length;
    }

    @Override
    public String next() {
        return hasNext() ? nomes[indice++] : null;
    }

}
