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
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;
    private Registro registro;
    
    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
        this.tipo = tipo;
    }
    
    public void reservar() {
        this.situacao = true;
    }
    
    public double liberar(int dias) {
        this.situacao = false;
        this.totalFaturado = dias * this.valorDiaria;
        return (dias * this.valorDiaria);
    }
    
    public void addRegistro(Registro reg){
        this.registro = reg;
        reg.setQuarto(this);
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Registro getRegistro() {
        return registro;
    }
    
}
