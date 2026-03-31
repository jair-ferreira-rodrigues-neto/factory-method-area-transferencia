package org.example;

public abstract class ClipboardFactory {
    public abstract Conteudo criarConteudo();

    public void copiarParaOClip() {
        Conteudo c = criarConteudo();
        c.processar();
    }
}