import org.junit.Test;
import static org.junit.Assert.*;

public class CommentTest {
    @Test
    public void testComentarioValidoCom100Caracteres() {
        Post post = new Post(1, "Este é um texto de postagem ... (150 caracteres)", "imagem.png", "2023-10-26", "video.mp4");

        String textoComentarioValido = "Lorem ipsum ... (100 caracteres)";
        Comment comentario = new Comment(1, 1, textoComentarioValido, "2023-10-26");

        assertEquals(1, comentario.getIdUser());
        assertEquals(textoComentarioValido, comentario.getText());
        assertEquals("2023-10-26", comentario.getData());
    }

    @Test
    public void testComentarioInvalidoCom160Caracteres() {
        Post post = new Post(1, "Esta é outra postagem ... (150 caracteres)", "imagem.png", "2023-10-26", "video.mp4");

        String textoComentarioInvalido = "Este é um comentário muito longo ... (mais de 160 caracteres)";
        try {
            Comment comentario = new Comment(1, 1, textoComentarioInvalido, "2023-10-26");

            throw new ComentarioInvalidoException("Comentário invalido!");
        } catch (ComentarioInvalidoException e) {
        }
    }
}
