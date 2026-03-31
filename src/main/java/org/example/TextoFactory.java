package org.example;

public class TextoFactory extends ClipboardFactory {
    @Override
    public Conteudo criarConteudo() {
        return new ConteudoTexto();
    }
}