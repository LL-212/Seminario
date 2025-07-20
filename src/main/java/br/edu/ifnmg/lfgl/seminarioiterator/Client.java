/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lfgl.seminarioiterator;

/**
 *
 * @author Loiola
 */
public class Client {

    public static void main(String[] args) {
        NameCollection listaNomes = new NameList();
        Iterator iterator = listaNomes.createIterator();

        while (iterator.hasNext()) {
            System.out.println("> " + iterator.next());
        }

    }
}
