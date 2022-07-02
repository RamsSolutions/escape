package za.co.rams.escape.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author User
 */
@Path("/theater")
public class TheaterResources {
    
    @GET
    public Response getTheaters(){
        return Response.status(200).entity("In theater path").build();
    }
    
    @GET
    @Path("/{theaterid}")
    public Response getTheater(@PathParam("theaterid") String theaterid){
        return Response.status(200).entity("In theater "+theaterid+" path").build();
    }
}
