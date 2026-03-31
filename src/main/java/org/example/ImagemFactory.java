package org.example;

public class ImagemFactory extends ClipboardFactory {
    @Override
    public Conteudo criarConteudo() {
        return new ConteudoImagem();
    }
}