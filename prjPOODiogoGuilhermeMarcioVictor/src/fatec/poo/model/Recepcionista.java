/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author DiogoGuilhermeMarcioVictor
 */
public class Recepcionista extends Pessoa {
    private int regFunc;
    private String turno;
    private ArrayList<Registro> registros;
    
    public Recepcionista(int regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        
        registros = new ArrayList<Registro>();
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
    
    public void addRegistro(Registro reg){
        registros.add(reg);
        reg.setRecepcionista(this);
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }
}
