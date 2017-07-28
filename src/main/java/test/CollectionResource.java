package test;

import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Resource collection endpoint class.
 *
 * @param <T>
 *            {@link Identifiable} resource type.
 */
public abstract class CollectionResource<T extends Identifiable<T>> extends BasicResource<T> {
	/**
	 * Gets a stream of all resource objects.
	 * 
	 * @return Resource object stream.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Stream<T> getAll() {
		return Stream.empty();
	}

	/**
	 * Gets endpoint for accessing a specific resource object by ID.
	 * <p>
	 * <b>CAUSES THE StackOverflowError EXCEPTION</b>
	 * 
	 * @param id
	 *            Resource object ID.
	 * @return Endpoint for resource.
	 */
	@Path("{id}")
	public Resource<T> getById(@PathParam("id") ID<T> id) {
		return asResource(id);
	}

	/**
	 * Creates a concrete endpoint class for handling a single resource object.
	 * 
	 * @param id
	 *            Resource object ID.
	 * @return Endpoint for resource.
	 */
	abstract protected Resource<T> asResource(ID<T> id);
}
