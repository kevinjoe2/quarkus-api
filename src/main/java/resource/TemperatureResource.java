package resource;

import dto.TemperatureDto;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.TemperatureService;

@Path("/temperatures")
public class TemperatureResource {

    private final TemperatureService service;

    public TemperatureResource(TemperatureService service) {
        this.service = service;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/find-all")
    public Response findAll() {
        return Response.ok().entity(service.findAll()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/find-one/{id}")
    public Response findOne(@PathParam("id") String id) {
        return Response.ok().entity(service.findOne(id)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/create")
    public Response create(TemperatureDto temperatureDto) {
        return Response.ok().entity(service.create(temperatureDto)).build();
    }
}
