package ch.gisel.quarkus.service;

import ch.gisel.quarkus.dao.IMyFirstDAO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class MyService {

    @Inject
    IMyFirstDAO myFirstDAO;

    public String findPerson(long id) {
        return myFirstDAO.getName(id);
    }

    @Transactional
    public long createPerson(String name) {
        return myFirstDAO.createPerson(name);
    }
}
