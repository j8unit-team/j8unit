package org.j8unit.generator.api.render;

import static java.util.Objects.requireNonNull;
import java.lang.reflect.Type;
import java.util.List;
import org.j8unit.generator.api.ImportMemory;

public abstract interface FancyOriginRenderer
extends ConciseOriginRenderer {

    public default void setClaimedNames(final List<String> scopeName) {
        this.getImportMemory().setClaimedNames(scopeName);
    }

    public abstract void resetImportMemory();

    public abstract ImportMemory getImportMemory();

    public default String renderImport(final String reference) {
        return this.getImportMemory().render(reference);
    }

    @Override
    public default String originCanonicalNameOf(final Type type) {
        requireNonNull(type);
        if (type instanceof Class) {
            final Class<?> clazz = (Class<?>) type;
            return this.getImportMemory().add(clazz) ? this.originSimpleNameOf(clazz) : ConciseOriginRenderer.super.originCanonicalNameOf(clazz);
        } else {
            return ConciseOriginRenderer.super.originCanonicalNameOf(type);
        }
    }

    @Override
    public default String originCanonicalNameOf(final Class<?> type, final String methodName) {
        requireNonNull(type);
        requireNonNull(methodName);
        if (type instanceof Class) {
            final Class<?> clazz = type;
            return this.getImportMemory().addStatic(clazz, methodName) ? methodName : ConciseOriginRenderer.super.originCanonicalNameOf(type, methodName);
        } else {
            return ConciseOriginRenderer.super.originCanonicalNameOf(type, methodName);
        }
    }

    @Override
    public default String javadocNameOf(final Class<?> entity) {
        requireNonNull(entity);
        return ConciseOriginRenderer.super.originCanonicalNameOf(entity);
    }

}
