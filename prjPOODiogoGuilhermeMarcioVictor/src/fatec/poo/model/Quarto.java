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

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
        
        if (tipo == "S") {
            this.tipo = "Solteiro";
        } else {
            this.tipo = "Casado";
        }
    }
    
    public void reservar() {
        this.situacao = true;
    }
    
    public double liberar(int dias) {
        this.situacao = false;
        this.totalFaturado = dias * this.valorDiaria;
        return this.totalFaturado;
    }
    
}
