
import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import fatec.poo.model.ServicoQuarto;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DiogoGuilhermeMarcioVictor
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testes
        Recepcionista objRecepcionista = new Recepcionista(123321, "Hugo");
        objRecepcionista.setTurno("M-Manhã");
        
        Hospede objHospede = new Hospede("1233345567", "Amicia");
        objHospede.setTaxaDesconto(10);
        
        Quarto objQuarto = new Quarto(01, "simples", 50);
        
        //teste LocalDate
        LocalDate dataEntrada = LocalDate.now();
        LocalDate dataSaida = LocalDate.of(2023, Month.NOVEMBER, 01);
        //System.out.println(dataEntrada);
        //System.out.println(dataSaida);
        
        //long diferencaEmDias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        //System.out.println((int)diferencaEmDias);
        
        Registro objRegistro = new Registro(001, dataEntrada, objRecepcionista);
        
        objRegistro.reservarQuarto(objHospede, objQuarto);
        
        ServicoQuarto servRefrigerante = new ServicoQuarto(001, "refrigerante");
        ServicoQuarto servBolo = new ServicoQuarto(002, "bolo");
        
        servRefrigerante.setValor(6.00);
        servBolo.setValor(14.00);
        
        objRegistro.addServico(servRefrigerante);
        objRegistro.addServico(servBolo);
        
        System.out.println("Recepcionista");
        System.out.println("nome: " + objRecepcionista.getNome());
        System.out.println("reg: " + objRecepcionista.getRegFunc());
        System.out.println("turno: " + objRecepcionista.getTurno());
        System.out.println("");
        
        System.out.println("Hospede");
        System.out.println("nome: " + objHospede.getNome());
        System.out.println("cpf: " + objHospede.getCpf());
        System.out.println("taxa desc.: " + objHospede.getTaxaDesconto());
        System.out.println("");
        
        System.out.println("Quarto");
        System.out.println("numero: " + objQuarto.getNumero());
        System.out.println("tipo: " + objQuarto.getTipo());
        System.out.println("situação: " + objQuarto.isSituacao());
        System.out.println("valor Diaria: " + objQuarto.getValorDiaria());
        System.out.println("total faturado: " + objQuarto.getTotalFaturado());
        System.out.println("");
        
        System.out.println("ServicoQuarto - servRefrigerante");
        System.out.println("codigo: " + servRefrigerante.getCodigo());
        System.out.println("descricao: " + servRefrigerante.getDescricao());
        System.out.println("valor: " + servRefrigerante.getValor());
        System.out.println("");
        
        System.out.println("ServicoQuarto - servBolo");
        System.out.println("codigo: " + servBolo.getCodigo());
        System.out.println("descricao: " + servBolo.getDescricao());
        System.out.println("valor: " + servBolo.getValor());
        System.out.println("");
        
        System.out.println("Registro pre-checkout");
        System.out.println("codigo: " + objRegistro.getCodigo());
        System.out.println("dataEntrada: " + objRegistro.getDataEntrada());
        System.out.println("valor: " + objRegistro.getValorHospedagem());
        System.out.println("");
        
        objRegistro.setDataSaida(dataSaida);
        double valorTotal = objRegistro.liberarQuarto();
        
        System.out.println("Registro post-checkout");
        System.out.println("codigo: " + objRegistro.getCodigo());
        System.out.println("dataEntrada: " + objRegistro.getDataEntrada());
        System.out.println("dataSaida: " + objRegistro.getDataSaida());
        System.out.println("valor(expect 150 - 15(desc) + 14 + 6 = 135 + 20 = 155): " + objRegistro.getValorHospedagem());
        System.out.println("retorno de liberarQuarto " + valorTotal);
        System.out.println("");
        
        System.out.println("teste associaçoes binarias");
        System.out.println("hospede");
        objHospede.getRegistros().forEach((reg) -> {
            System.out.println(reg.getCodigo());
        });
        System.out.println(objRegistro.getHospede().getNome());
        System.out.println("");
        
        System.out.println("recepcionista");
        objRecepcionista.getRegistros().forEach((reg) -> {
            System.out.println(reg.getCodigo());
        });
        System.out.println(objRegistro.getRecepcionista().getNome());
        System.out.println("");
        
        System.out.println("quarto");
        System.out.println(objQuarto.getRegistro().getCodigo());
        System.out.println(objRegistro.getQuarto().getNumero());
        System.out.println("");
        
        System.out.println("servico quarto - refrigerante");
        System.out.println(servRefrigerante.getRegistro().getCodigo());
        objRegistro.getServicos().forEach((serv) -> {
            System.out.println(serv.getDescricao());
        });
        System.out.println("");
    }
    
}
