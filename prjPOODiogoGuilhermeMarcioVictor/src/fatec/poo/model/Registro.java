/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author DiogoGuilhermeMarcioVictor
 */
public class Registro {
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;

    public Registro(int codigo, LocalDate dataEntrada, double valorHospedagem) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.valorHospedagem = valorHospedagem;
    }
    
    
}
