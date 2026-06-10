import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> nameToNumber = new HashMap<>();

    public int add(String name, String phoneNumber){
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, phoneNumber);
        }
        return nameToNumber.size();
    }

    public String findByNumber(String phoneNumber){
        return nameToNumber.entrySet().stream()
                .filter(el -> el.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

    }
}
