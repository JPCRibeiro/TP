package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Kobold extends Personagem{
    public Kobold() {
        super(20, 4, 2, 4);
    }

    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        int somaDados = 0;
        for(int i = 0; i < 3; i++) {
            somaDados += dadoUtil.rollD2();
        }
        return somaDados + getPontosDeForca();
    }
}
