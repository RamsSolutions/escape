package za.co.rams.escape.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 *
 * @author User
 */
@Path("/member")
public class MemberResources {
    @GET
    public Response getTheaters(@Context SecurityContext sc, @Context ServletContext ctx){
        URI uri = null;
        try {
            uri = new URI(ctx.getContextPath());
        } catch (URISyntaxException ex) {
        }
        if(!sc.isUserInRole("admin")){
            Response.status(400).entity("Not logged in").build();
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException ex) {
//            }
            return Response.temporaryRedirect(uri).build();
        }
        return Response.status(200).entity("In member path").build();
    }
}
