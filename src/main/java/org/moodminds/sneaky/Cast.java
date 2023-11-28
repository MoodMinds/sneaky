package org.moodminds.sneaky;

/**
 * Static utility class for unchecked casting.
 */
public class Cast {

    /**
     * Construct the object.
     */
    private Cast() {}

    /**
     * Cast the given argument.
     *
     * @param object the given argument
     * @param <V> the result value type
     * @return the given object casting result
     */
    @SuppressWarnings("unchecked")
    public static <V> V cast(Object object) {
        return (V) object;
    }
}
