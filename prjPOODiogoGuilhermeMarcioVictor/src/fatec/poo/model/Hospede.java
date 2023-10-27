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
public class Hospede extends Pessoa{
    private String cpf;
    private double taxaDesconto;
    private ArrayList<Registro> registros;
    
    public Hospede(String nome, String cpf) {
        super(nome);
        
        this.cpf = cpf;
        
        registros = new ArrayList<Registro>();
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }
    
    public void addRegistro(Registro reg){
        registros.add(reg);
    }
}
