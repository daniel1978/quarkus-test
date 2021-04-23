package ch.gisel.quarkus.dao;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class MyFirstDAO {

    private Map<Long, String> names;

    public MyFirstDAO() {
        names = new HashMap<>();
        names.put(1l, "Daniel");
        names.put(2l, "Albert");
        names.put(3l, "Werner");
    }

    public String getName(long id) {
        return names.get(id);
    }
}
