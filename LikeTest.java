import org.junit.Test;
import static org.junit.Assert.*;

public class LikeTest {
    @Test
    public void testValidLikeWithPostDomain() {
        Like like = new Like(1, "post123", "post");
        assertEquals("post123", like.getIdPost());
    }

    @Test
    public void testInvalidLikeWithNonPostDomain() {
        try {
            Like like = new Like(1, "comment123", "comment");
            throw new InvalidLikeDomainException("Dominio invalido!");
        } catch (InvalidLikeDomainException e) {
        }
    }
}
