import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClipboardFactoryTest {

    @Test
    public void testCriacaoTexto() {
        ClipboardFactory factory = new TextoFactory();
        Conteudo conteudo = factory.criarConteudo();
        assertTrue(conteudo instanceof ConteudoTexto);
    }

    @Test
    public void testCriacaoImagem() {
        ClipboardFactory factory = new ImagemFactory();
        Conteudo conteudo = factory.criarConteudo();
        assertTrue(conteudo instanceof ConteudoImagem);
    }
}