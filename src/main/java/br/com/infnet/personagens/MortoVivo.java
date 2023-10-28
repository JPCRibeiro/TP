package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class MortoVivo extends Personagem{
    public MortoVivo() {
        super(12, 4, 0, 1);
    }

    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
