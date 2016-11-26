package org.j8unit.generator.api;

import static java.util.Collections.emptySet;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.generator.GeneratorTokens.indent;
import static org.j8unit.generator.util.Java.annotation;
import static org.j8unit.generator.util.Sets.reduce;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.StreamSupport;
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

    public default Set<String> getEffectiveWarnings(final Iterator<? extends CustomWarnings> references) {
        final Set<String> enclosingWarnings = StreamSupport.stream(spliteratorUnknownSize(references, 0), false) //
                                                           .map(CustomWarnings::getWarnings) //
                                                           .flatMap(Collection::stream) //
                                                           .collect(toSet());
        return reduce(this.getWarnings(), enclosingWarnings);

    }

    public default String renderEffectiveWarnings(final Iterator<? extends CustomWarnings> references, final int depth, final OriginRenderer renderer) {
        final String indent = indent(depth);
        final String annotation = annotation(renderer.originCanonicalNameOf(SuppressWarnings.class), this.getEffectiveWarnings(references));
        return String.format("%s%s%n", indent, annotation);
    }

}
