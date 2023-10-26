import org.junit.Test;
import static org.junit.Assert.*;

public class FriendshipTest {
    @Test
    public void testValidFriendshipRequest() {
        User user = new User(1, "Gustavo", "password123", "gustavo@example.com");

        Friendship friendship = new Friendship(1, "Solicitação", "2", "Enrique", "26/10/2023");

        assertEquals("Solicitação", friendship.getStatus());
    }

    @Test
    public void testValidFriendshipSentStatus() {
        User user = new User(1, "Enrique", "password123", "enrique@example.com");

        Friendship friendship = new Friendship(1, "Enviado", "2", "Gustavo", "26/10/2023");

        assertEquals("Enviado", friendship.getStatus());
    }
}
