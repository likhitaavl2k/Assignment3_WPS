package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;

@Path("/3")
public class UserService implements ContainerResponseFilter {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<hello> getjson() {
		Map<Integer,hello> map = new HashMap<>();
		List<hello> list = new ArrayList<>();
		list.add(new hello(58, "Likhita", "CSE", "avllikhita@gmail.com"));
		list.add(new hello(43, "Keerti", "CSE", "ksskeerti@gmail.com"));
		list.add(new hello(41, "Hashitha", "CSE", "hashithaa0602@gmail.com"));
		list.add(new hello(24, "Karthik", "CSE", "karthikkalitkar@gmail.com"));
		list.add(new hello(57, "Kiran", "MECH", "kiranreddy@gmail.com"));
		
		return list;
	}
	
	public void filter(ContainerRequestContext request,
            ContainerResponseContext response) throws IOException {
        response.getHeaders().add("Access-Control-Allow-Origin", "*");
        response.getHeaders().add("Access-Control-Allow-Headers",
                "origin, content-type, accept, authorization");
        response.getHeaders().add("Access-Control-Allow-Credentials", "true");
        response.getHeaders().add("Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE, OPTIONS, HEAD");
    }
}
