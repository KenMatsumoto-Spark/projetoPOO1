/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author DiogoGuilhermeMarcioVictor
 */
public class Registro {
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    
    private Hospede hospede;
    private Quarto quarto;
    private Recepcionista recepcionista; 
    private ArrayList<ServicoQuarto> servicos;
    
    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        
        recepcionista.addRegistro(this);
        this.servicos = new ArrayList<ServicoQuarto>();
    }
    
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    
    public double getValorHospedagem() {
        return valorHospedagem;
    }
    
    public void reservarQuarto(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        hospede.addRegistro(this);
        quarto.addRegistro(this);
        quarto.reservar();
    }
    
    public double liberarQuarto() {
        long diferencaEmDias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        int dias = (int) diferencaEmDias;
        double valor = quarto.liberar(dias);
        valorHospedagem = valor - (valor * (hospede.getTaxaDesconto()/100));
        for (ServicoQuarto servico : servicos) {
            valorHospedagem += servico.getValor();
        }
        return valorHospedagem;
    }
    
    public void setHospede(Hospede hos){
        this.hospede = hos;
    }
    
    public void setRecepcionista(Recepcionista rec){
        this.recepcionista = rec;
    }
        
    public void setQuarto(Quarto qua){
        this.quarto = qua;
    }
    
    public void addServico(ServicoQuarto serv){
        this.servicos.add(serv);
        serv.setRegistro(this);
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public ArrayList<ServicoQuarto> getServicos() {
        return servicos;
    }
   
}
