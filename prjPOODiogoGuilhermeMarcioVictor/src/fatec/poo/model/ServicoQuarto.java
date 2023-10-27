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
public class ServicoQuarto {
    private int codigo;
    private String descricao;
    private double valor;

    public ServicoQuarto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescicao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
    
}
