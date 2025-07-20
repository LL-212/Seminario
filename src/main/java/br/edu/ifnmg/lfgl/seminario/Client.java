/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lfgl.seminario;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        Dialog dialog = new Dialog();
        SaveButton salvar = new SaveButton();
        CancelButton cancelar = new CancelButton();

        dialog.registerComponents(salvar, cancelar);

        salvar.click();
        cancelar.click();
    }
}
