package exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.NoSuchElementException;

@Provider
public class NoSuchElementExMap implements ExceptionMapper<NoSuchElementException> {

    public record CustomError(String code, String message) {
    }

    @Override
    public Response toResponse(NoSuchElementException e) {
        var error = new CustomError("404", e.getMessage());
        return Response.serverError().entity(error).build();
    }
}
