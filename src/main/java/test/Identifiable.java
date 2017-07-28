package test;

/**
 * A resource type that can be identified by ID.
 *
 * @param <T>
 *            Resource type.
 * @see User
 */
public interface Identifiable<T> {
	ID<T> getId();
}
