package za.co.rams.escape.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


/**
 *
 * @author User
 */
@Path("/movie")
public class MovieResources {
    @GET
    public Response getMovies(){
        return Response.status(200).entity("In movie path").build();
    }
    
    
    @GET
    @Path("/{movieid}")
    public Response getMovie(@PathParam("movieid") String movieid) {
        return Response.status(200).entity("In movie "+ movieid +" path").build();
    }
    
    @GET
    @Path("/{movieid}/book")
    public Response book(@PathParam("movieid") String movieid) {
        return Response.status(200).entity("Booking movie "+ movieid    ).build();
    }
}
