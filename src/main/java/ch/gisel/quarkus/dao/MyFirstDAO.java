package ch.gisel.quarkus.dao;

import ch.gisel.quarkus.entity.Person;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class MyFirstDAO implements IMyFirstDAO {

    private Map<Long, String> names;

    @ConfigProperty(name = "message.no.person.found")
    String noPersonFoundMessage;

    @Inject
    EntityManager em;

    public MyFirstDAO() {
        names = new HashMap<>();
        names.put(1l, "Daniel");
        names.put(2l, "Albert");
        names.put(3l, "Werner");
    }

    @Override
    public String getName(long id) {
        Person person = em.find(Person.class, id);
        if (person == null) {
            return noPersonFoundMessage;
        }
        return person.getName();
    }

    @Override
    public long createPerson(String name) {
        Person person = new Person();
        person.setName(name);
        em.persist(person);
        return person.getId();
    }
}
