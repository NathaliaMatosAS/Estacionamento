/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento;

/**
 *
 * @author a120112
 */
public class Vagas {

    String placa;
    String data;
    int entrada;
    int saida;
    int vaga;
    int pagamentoTotal;

    public Vagas() {
        placa = " ";
        data = " ";
        entrada = 0;
        saida = 0;
        vaga = 0;
        pagamentoTotal = 0;
    }
    
    Estacionamento e = new Estacionamento();

    void estacionarCarro() {
        for (int i = 0; i <= 23; i++) {
            if (e.vetor[i] == null) {
                e.vetor[i] = placa;
                vaga=i;

            }

        }

    }

    void pagamento(int horas) {
        horas = saida - entrada;
        if (horas <= 1) {
            pagamentoTotal = 4;
        } else {
            pagamentoTotal = 4 + (horas - 1) * 2;

        }
        e.vetor[vaga]=null;

    }

}
