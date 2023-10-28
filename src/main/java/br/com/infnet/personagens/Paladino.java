package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Paladino extends Personagem{
    public Paladino() {
        super(15, 2, 5, 2);
    }

    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
