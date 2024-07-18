package controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

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
}
