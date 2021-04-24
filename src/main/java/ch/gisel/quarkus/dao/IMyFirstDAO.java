package ch.gisel.quarkus.dao;

public interface IMyFirstDAO {

    String getName(long id);

    long createPerson(String name);
}
