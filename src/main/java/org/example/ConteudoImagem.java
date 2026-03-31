package org.example;

public class ConteudoImagem implements Conteudo {
    @Override
    public void processar() {
        System.out.println("Processando bits de imagem para a área de transferência...");
    }
}