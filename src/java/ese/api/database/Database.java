package ese.api.database;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import net.minidev.json.JSONObject;

@Path("db")
public class Database {
    @Context
    private UriInfo context;

    public Database() {
    }
    
    @GET
    @Path("/query/{table}/{field}/{filter}")
    @Produces("application/json")
    public JSONObject Query(@PathParam("table") String tableName, @PathParam("field") String field, @PathParam("filter") String filter) {
        JSONObject result = new JSONObject();
        result.put("errorcode", "OK");
        result.put("errormsg", "OK :: " + tableName);

        return result;
    }
}
