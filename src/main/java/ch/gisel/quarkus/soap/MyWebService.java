package ch.gisel.quarkus.soap;

import ch.gisel.quarkus.entity.Person;
import javax.jws.WebService;

@WebService(endpointInterface = "ch.gisel.quarkus.soap.IMyWebService", serviceName = "MyWebService")
public class MyWebService implements IMyWebService {

    @Override
    public Person createPerson(Person person) {
        person.setId(25);
        return person;
    }
}
