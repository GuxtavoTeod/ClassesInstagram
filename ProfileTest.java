import org.junit.Test;
import static org.junit.Assert.*;

public class ProfileTest {
    @Test
    public void testValidDescription() {
        Profile profile = new Profile(1, "Info", "", 0, "");

        profile.setDescription("Descrição de 50 caracteres.12345678901234567890");

        assertEquals("Descrição de 50 caracteres.12345678901234567890", profile.getDescription());
    }

    @Test
    public void testInvalidDescription() {

        Profile profile = new Profile(1, "Info", "", 0, "");

        try {
            String longDescription = generateLongDescription(4100);

            profile.setDescription(longDescription);
            throw new InvalidDescriptionException("Descrição inválida");
        } catch (IllegalArgumentException e) {
        }
    }
    private String generateLongDescription(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append('a');
        }
        return sb.toString();
    }
}
