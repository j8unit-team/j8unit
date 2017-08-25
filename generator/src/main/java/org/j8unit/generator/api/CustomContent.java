package org.j8unit.generator.api;

import static java.util.Objects.requireNonNull;
import org.j8unit.generator.api.render.OriginRenderer;

/**
 * Container of {@linkplain #customTestInterfaceBody(int, OriginRenderer) custom content} and
 * {@link #specificTestInterfaceBody(Class, int, OriginRenderer) specific content}.
 */
public abstract interface CustomContent {

    public default String customTestInterfaceBody(final int depth, final OriginRenderer renderer) {
        requireNonNull(renderer);
        return "";
    }

    public default String specificTestInterfaceBody(final Class<?> type, final int depth, final OriginRenderer renderer) {
        requireNonNull(type);
        requireNonNull(renderer);
        return "";
    }

}
