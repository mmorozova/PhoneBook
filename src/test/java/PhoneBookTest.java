import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PhoneBookTest {

    @Test
    public void test_add() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Mary", "2466911"));
    }

    @Test
    public void test_find_by_number(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "2466911");
        phoneBook.add("Ann", "2442529");
        assertEquals("Mary", phoneBook.findByNumber("2466911"));
    }

    @Test
    public void test_find_by_name(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "2466911");
        phoneBook.add("Ann", "2442529");
        assertEquals("2466911", phoneBook.findByName("Mary"));
    }

    @Test
    public void test_print_all_names(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "2466911");
        phoneBook.add("Ann", "2442529");
        phoneBook.add("Eva", "2469460");

        List<String> expected = Arrays.asList("Ann", "Eva", "Mary");
        List<String> result = phoneBook.printAllNames();

        assertEquals(expected, result);
    }
}
