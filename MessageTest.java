import org.junit.Test;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class MessageTest {
    @Test
    public void testValidMessageDateTomorrow() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        String dateTomorrow = tomorrow.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        try {
            Message message = new Message(1, 1, "Enviada", dateTomorrow);

            assertEquals(dateTomorrow, message.getDate());
        } catch (InvalidMessageDateException e) {
        }
    }

    @Test
    public void testInvalidMessageDateFuture() {
        LocalDate invalidDate = LocalDate.now().plusYears(200);
        String dateInvalid = invalidDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        try {
            Message message = new Message(1, 1, "Enviada", dateInvalid);

            throw new InvalidMessageDateException("Data invalida!");
        } catch (InvalidMessageDateException e) {
        }
    }
}
