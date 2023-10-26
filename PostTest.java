import org.junit.Test;
import static org.junit.Assert.*;

public class PostTest {
    @Test
    public void testValidText() {
        Post post = new Post(1, "", "", "", "");

        post.setText("Texto de 20 caracteres.");

        assertEquals("Texto de 20 caracteres.", post.getText());
    }

    @Test
    public void testInvalidText() {
        Post post = new Post(1, "", "", "", "");

        try {
            String longText = generateLongText(151);

            post.setText(longText);

            throw new InvalidDescriptionException("Post inválido");
        } catch (IllegalArgumentException e) {
        }
    }
    private String generateLongText(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append('a');
        }
        return sb.toString();
    }
}
