import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> nameToNumber = new HashMap<>();

    public int  add(String name, String phoneNumber){
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, phoneNumber);
        }
        return nameToNumber.size();
    }
}
