package org.j8unit.generator.api;

import static java.util.Collections.emptySet;
import static org.j8unit.generator.GeneratorTokens.indent;
import static org.j8unit.generator.util.Java.annotation;
import java.util.Set;
import org.j8unit.generator.api.render.OriginRenderer;

/**
 * Container of {@linkplain #getWarnings() custom warnings to be suppressed}. The intention is to be used when creating
 * a {@link SuppressWarnings} annotation similar to: <code>&#64;SuppressWarnings({"xyz", "foobar"})</code>.
 */
public abstract interface CustomWarnings {

    /**
     * Returns a set of all custom warnings.
     *
     * @return a set of all custom warnings
     */
    public default Set<String> getWarnings() {
        return emptySet();
    }

    /**
     * Renders the {@link SuppressWarnings}-declaration using {@linkplain #getWarnings() all warnings}. The result ends
     * with the line separator string.
     *
     * If there is no warning at all, an empty {@code String} will be returned instead.
     */
    public default String renderWarnings(final int depth, final OriginRenderer renderer) {
        final String indent = indent(depth);
        final String annotation = annotation(renderer.originCanonicalNameOf(SuppressWarnings.class), this.getWarnings());
        return String.format("%s%s%n", indent, annotation);
    }

}
