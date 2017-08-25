package org.j8unit.maven.plugin.api;

import static java.lang.String.format;
import java.util.function.Supplier;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Comfort extension of {@link MojoExecutionException} with some sugar constructors and
 * {@linkplain #onDemandMojoException(String, Object...) on-demand supply}.
 */
public class J8UnitMojoExecutionException
extends MojoExecutionException {

    private static final long serialVersionUID = -155139184838175060L;

    public J8UnitMojoExecutionException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public J8UnitMojoExecutionException(final String message) {
        super(message);
    }

    public J8UnitMojoExecutionException(final String pattern, final Object... args) {
        this(format(pattern, args));
    }

    public J8UnitMojoExecutionException(final Throwable cause, final String pattern, final Object... args) {
        this(format(pattern, args), cause);
    }

    public static Supplier<J8UnitMojoExecutionException> onDemandMojoException(final String pattern, final Object... args) {
        return () -> new J8UnitMojoExecutionException(pattern, args);
    }

}
