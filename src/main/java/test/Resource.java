package test;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Endpoint base class for single resource objects.
 *
 * @param <T>
 *            {@link Identifiable} resource type.
 */
public abstract class Resource<T extends Identifiable<T>> extends BasicResource<T> {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public T get() {
		// ... here it would load and return the resource object.
		return null;
	}
}
