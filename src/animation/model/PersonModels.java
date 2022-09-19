package animation.model;

import java.util.HashMap;
import java.util.Map;

public class PersonModels {

    private Map<String, Person> samples;

    public PersonModels() {
        samples = new HashMap<>();
        loadSamples();
    }

    public Person get(String type) {
        return samples.get(type);
    }

    private void loadSamples() {
        samples.put("firstMan", new Person(
                "                   ",
                "        o          ",
                "       /|\\          ",
                "_______/_\\___________"
        ));
        samples.put("secondMan", new Person(
                "                   ",
                "       (^ ^)          ",
                "       <)  )\\         ",
                "_______/__\\___________"
        ));
    }

}
