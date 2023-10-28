package br.com.infnet;

import br.com.infnet.personagens.Personagem;
import br.com.infnet.util.PersonagemUtil;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Escolha um herói: 1-3" );
        int escolhaHeroi = scanner.nextInt();

        PersonagemUtil personagemUtil = new PersonagemUtil();
        Personagem heroi = personagemUtil.escolherHeroiFromArray(escolhaHeroi);
        Personagem monstro = personagemUtil.escolherMonstro();

        int quantidadeRodadas = 0;

        while(heroi.getPontosDeVida() > 0 && monstro.getPontosDeVida() > 0) {
            quantidadeRodadas++;
            Personagem atacante, atacado = null;

            if (heroi.calcularIniciativa() > monstro.calcularIniciativa()) {
                atacante = heroi;
                atacante = monstro;
            } else {
                atacante = monstro;
                atacado = heroi;
            }

            if (conseguiuAtacar(atacante, atacado)) {
                System.out.println("Ataque bem sucedido");
                int dano = atacante.calcularFatorDeDano();
                atacado.retirarPontosDeVida(dano);
            } else {
                System.out.println("Ataque mal sucedido");
            }
        }

    }

    private static boolean conseguiuAtacar(Personagem atacante, Personagem monstro) {
        return atacante.calcularFatorDeAtaque() > monstro.calcularFatorDeDefesa();
    }

}
