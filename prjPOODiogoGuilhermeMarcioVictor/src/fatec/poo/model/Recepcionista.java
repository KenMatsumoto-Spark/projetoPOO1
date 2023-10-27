/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author DiogoGuilhermeMarcioVictor
 */
public class Recepcionista extends Pessoa {
    private int regFunc;
    private String turno;

    public Recepcionista(int regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
    }

    public void setTurno(String turno) {
        if (turno == "M") {
            this.turno = "Manhã";
        } else if (turno == "T") {
            this.turno = "Tarde";
        } else {
            this.turno = "Noite";
        }
    }

    public int getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
    
    
}
