package org.j8unit.generator.api.render;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Arrays.baseComponentTypeOf;
import static org.j8unit.generator.util.Java.JAVA_LANG;
import static org.j8unit.generator.util.OptionalString.ofOptional;

public abstract interface ConciseTargetRenderer
extends TargetRenderer {

    @Override
    public default String targetCanonicalNameOf(final Class<?> type) {
        requireNonNull(type);
        ofOptional(this.targetPackageFor(type)).orEmpty();
        if (JAVA_LANG.equals(ofOptional(this.targetPackageFor(baseComponentTypeOf(type))).orEmpty())) {
            return this.targetBasicNameOf(type);
        } else {
            return TargetRenderer.super.targetCanonicalNameOf(type);
        }
    }

}
