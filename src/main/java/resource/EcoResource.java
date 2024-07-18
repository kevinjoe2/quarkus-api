package resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

import java.util.Optional;

@Path("/saludar")
public class EcoResource {

    @GET
    public String saludar() {
        return "Hola mundo.";
    }

    @GET
    @Path("/dias")
    public String dias() {
        return "Hola, buenos dias.";
    }

    @GET
    @Path("/tardes")
    public String tardes() {
        return "Hola, buenas tardes.";
    }

    @GET
    @Path("/noches")
    public String noches() {
        return "Hola, buenas noches.";
    }

    @GET
    @Path("/bots")
    public String bots(@QueryParam("mensaje") String mensaje) {
        return Optional.ofNullable(mensaje)
                .map(msj -> "> " + msj)
                .orElse("No se que responder!");
    }

    @GET
    @Path("/auxs/{mensaje}")
    public String auxs(@PathParam("mensaje") String mensaje) {
        return Optional.ofNullable(mensaje)
                .map(msj -> "> " + msj)
                .orElse("No se que responder!");
    }

    @GET
    @Path("/{mensaje}/to/upper")
    public String toUpper(@PathParam("mensaje") String mensaje) {
        return Optional.ofNullable(mensaje)
                .map(msj -> "> " + msj.toUpperCase())
                .orElse("NO SE QUE RESPONDER!");
    }
}
