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
    private double valorDiario;
    private double totalFaturado;

    public Quarto(int numero, String tipo, double valorDiario) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiario = valorDiario;
    }
    
}
