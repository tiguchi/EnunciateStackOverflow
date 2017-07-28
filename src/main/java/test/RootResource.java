package test;

import javax.ws.rs.Path;

@Path("/")
public class RootResource {
	@Path("users")
	public UsersResource test() {
		return new UsersResource();
	}
}
