package ch.gisel.quarkus;

import ch.gisel.quarkus.service.MyService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
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

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/person/{name}")
    public long createPerson(@PathParam("name") String name) {
        return myService.createPerson(name);
    }
}