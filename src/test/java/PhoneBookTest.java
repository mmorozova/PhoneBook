import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneBookTest {

    @Test
    public void test_add() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Mary", "2466911"));
    }
}
