package ch.gisel.quarkus;

import ch.gisel.quarkus.service.MyService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/hello-resteasy")
public class GreetingResource {

    @Inject
    MyService myService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/person/{id}")
    public String findPerson(@PathParam("id") long id) {
        return myService.findPerson(id);
    }
}