package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Guerreiro extends Personagem {
    public Guerreiro() {
        super(12, 4, 3, 3);
    }

    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
