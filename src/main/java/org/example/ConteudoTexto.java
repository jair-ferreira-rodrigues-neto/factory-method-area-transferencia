package org.example;

public class ConteudoTexto implements Conteudo {
    @Override
    public void processar() {
        System.out.println("Processando texto plano para a área de transferência...");
    }
}