package ch.gisel.quarkus.dao;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class MyFirstDAO {

    private Map<Long, String> names;

    @ConfigProperty(name = "message.no.person.found")
    String noPersonFoundMessage;

    public MyFirstDAO() {
        names = new HashMap<>();
        names.put(1l, "Daniel");
        names.put(2l, "Albert");
        names.put(3l, "Werner");
    }

    public String getName(long id) {
        String name = names.get(id);
        if (name == null) {
            return noPersonFoundMessage;
        }
        return name;
    }
}
