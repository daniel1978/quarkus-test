package ch.gisel.quarkus.soap;

import ch.gisel.quarkus.entity.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IMyWebService {

    @WebMethod
    @WebResult(name = "out")
    Person createPerson(@WebParam(name = "in") Person person);
}
