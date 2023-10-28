package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;
import lombok.ToString;

@ToString
public abstract class Personagem {
    private int pontosDeVida;
    private int pontosDeForca;
    private int pontosDeDefesa;
    private int pontosDeAgilidade;

    public Personagem(int pontosDeVida, int pontosDeForca,
                      int pontosDeDefesa, int pontosDeAgilidade) {
        this.pontosDeVida = pontosDeVida;
        this.pontosDeForca = pontosDeForca;
        this.pontosDeDefesa = pontosDeDefesa;
        this.pontosDeAgilidade = pontosDeAgilidade;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public int getPontosDeForca() {
        return pontosDeForca;
    }

    public int getPontosDeDefesa() {
        return pontosDeDefesa;
    }

    public int getPontosDeAgilidade() {
        return pontosDeAgilidade;
    }

    public int calcularIniciativa() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + getPontosDeAgilidade();
    }

    public int calcularFatorDeAtaque() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + getPontosDeAgilidade() + getPontosDeForca();
    }

    public int calcularFatorDeDefesa() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + getPontosDeAgilidade() + getPontosDeForca();
    }

    public abstract int calcularFatorDeDano();

    public void retirarPontosDeVida(int pontos) {
        this.pontosDeVida -= pontos;
    }


}
