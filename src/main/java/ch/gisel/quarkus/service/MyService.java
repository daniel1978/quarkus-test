package ch.gisel.quarkus.service;

import ch.gisel.quarkus.dao.MyFirstDAO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MyService {

    @Inject
    MyFirstDAO myFirstDAO;

    public String findPerson(long id) {
        return myFirstDAO.getName(id);
    }
}
