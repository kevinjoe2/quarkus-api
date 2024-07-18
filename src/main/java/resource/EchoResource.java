package resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

import java.util.Optional;

@Path("/echos")
public class EchoResource {

    @GET
    public String greet() {
        return "Hello world.";
    }

    @GET
    @Path("/day")
    public String day() {
        return "Hello, good morging.";
    }

    @GET
    @Path("/evening")
    public String evening() {
        return "Hello, good evening.";
    }

    @GET
    @Path("/night")
    public String night() {
        return "Hello, good night.";
    }

    @GET
    @Path("/bots")
    public String bots(@QueryParam("message") String message) {
        return Optional.ofNullable(message)
                .map(msj -> "> " + msj)
                .orElse("I don't know what to do with!");
    }

    @GET
    @Path("/bots/{message}")
    public String botsV2(@PathParam("message") String message) {
        return Optional.ofNullable(message)
                .map(msj -> "> " + msj)
                .orElse("I don't know what to do with!");
    }

    @GET
    @Path("/{message}/to/upper")
    public String toUpper(@PathParam("message") String message) {
        return Optional.ofNullable(message)
                .map(msj -> "> " + msj.toUpperCase())
                .orElse("I DON'T KNOW WHAT TO DO WITH!");
    }
}
