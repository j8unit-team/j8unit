package org.j8unit.generator.api.render;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Java.JAVA_NAMESPACE_DELIMITER;
import static org.j8unit.generator.util.OptionalString.ofOptional;
import org.j8unit.generator.api.ImportMemory;

public abstract interface FancyTargetRenderer
extends ConciseTargetRenderer {

    public abstract void setImportMemory(final ImportMemory memory);

    public abstract ImportMemory getImportMemory();

    @Override
    public default String targetCanonicalNameOf(final Class<?> type) {
        final String className = ofOptional(this.targetPackageFor(type)).append(JAVA_NAMESPACE_DELIMITER).orEmpty()
                                 + this.targetBasicNameOf(type).replace('.', '$');
        return this.getImportMemory().add(className) ? this.targetSimpleNameOf(type) : ConciseTargetRenderer.super.targetCanonicalNameOf(type);
    }

    @Override
    public default String targetJavadocNameOf(final Class<?> entity) {
        requireNonNull(entity);
        return ConciseTargetRenderer.super.targetCanonicalNameOf(entity);
    }

}
