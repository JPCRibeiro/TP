package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Orc extends Personagem{
    public Orc() {
        super(20, 6, 2, 2);
    }

    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD8() + getPontosDeForca();
    }
}
