package test;

/**
 * Endpoint that represents all users.
 */
public class UsersResource extends CollectionResource<User> {
	@Override
	protected Resource<User> asResource(ID<User> id) {
		return new UserResource(id);
	}
}
