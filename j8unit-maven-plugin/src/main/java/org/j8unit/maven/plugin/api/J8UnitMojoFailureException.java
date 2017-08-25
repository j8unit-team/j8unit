package org.j8unit.maven.plugin.api;

import static java.lang.String.format;
import java.util.function.Supplier;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Comfort extension of {@link J8UnitMojoFailureException} with some sugar constructors and
 * {@linkplain #onDemandMojoFailure(String, Object...) on-demand supply}.
 */
public class J8UnitMojoFailureException
extends MojoFailureException {

    private static final long serialVersionUID = 5358483795607858620L;

    public J8UnitMojoFailureException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public J8UnitMojoFailureException(final String message) {
        super(message);
    }

    public J8UnitMojoFailureException(final String pattern, final Object... args) {
        this(format(pattern, args));
    }

    public J8UnitMojoFailureException(final Throwable cause, final String pattern, final Object... args) {
        this(format(pattern, args), cause);
    }

    public static Supplier<J8UnitMojoFailureException> onDemandMojoFailure(final String pattern, final Object... args) {
        return () -> new J8UnitMojoFailureException(pattern, args);
    }

}
