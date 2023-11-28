package org.moodminds.sneaky;

/**
 * Static utility method for throwing any type of exceptions.
 */
public class Sneak {

    /**
     * Construct the object.
     */
    private Sneak() {}

    /**
     * Throw the specified exception.
     *
     * @param exception the specified exception
     * @param <V> the result value type
     * @param <E> the exception type
     * @return no return, only throwing
     * @throws E the exception thrown
     */
    public static <V, E extends Throwable> V sneak(Throwable exception) throws E {
        throw Cast.<E>cast(exception);
    }
}
