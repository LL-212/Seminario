/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lfgl.seminario;

/**
 *
 * @author Loiola
 */
public class NameList
        implements NameCollection {

    private String[] nomes = {"Ana", "Bruna", "Carlos", "Pedro", "Jose",
        "Felipe", "Camila"};

    @Override
    public Iterator createIterator() {
        return new NameListIterator(nomes);
    }

}
