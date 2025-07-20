/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lfgl.seminario;

/**
 *
 * @author Loiola
 */
public class Dialog
        implements Mediator {

    private SaveButton salvar;
    private CancelButton cancelar;

    public void registerComponents(SaveButton salvar, CancelButton cancelar) {
        this.salvar = salvar;
        this.cancelar = cancelar;

        salvar.setMediator(this);
        cancelar.setMediator(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == salvar && event.equals("click")) {
            salvar.operation();
        } else if (sender == cancelar && event.equals("click")) {
            cancelar.operation();
        }

    }

}
