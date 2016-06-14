package org.j8unit.generator.api.render;

import static java.util.Arrays.stream;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;
import static org.j8unit.generator.util.Arrays.baseComponentTypeOf;
import static org.j8unit.generator.util.Java.JAVA_LANG_PACKAGE;
import static org.j8unit.generator.util.OptionalString.ofEmptyable;
import static org.j8unit.generator.util.Strings.csv;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/**
 * An extension of {@link OriginRenderer} with concise behaviour in case of needless explicitly.
 */
public interface ConciseOriginRenderer
extends OriginRenderer {

    /**
     * {@inheritDoc}
     *
     * @implNote This implementation returns only the {@linkplain #originBasicNameOf(Class) origin basic name} if the
     *           given {@code type} is located within {@linkplain org.j8unit.generator.util.Java#JAVA_LANG_PACKAGE the
     *           default java package} (because there is no need to declare explicitly).
     */
    @Override
    public default String originCanonicalNameOf(final Type type) {
        requireNonNull(type);
        if ((type instanceof Class) && JAVA_LANG_PACKAGE.equals(baseComponentTypeOf((Class<?>) type).getPackage())) {
            return this.originBasicNameOf((Class<?>) type);
        } else {
            return OriginRenderer.super.originCanonicalNameOf(type);
        }
    }

    /**
     * {@inheritDoc}
     *
     * @implNote in order to decrease verbosity the definition statement does not comprise {@link Object} as an upper
     *           bound (because there is no need to declare explicitly).
     */
    @Override
    public default List<String> listOfTypeParameterDefinitionsOf(final GenericDeclaration entity) {
        requireNonNull(entity);
        return Arrays.stream(entity.getTypeParameters()).map(var -> {
            final String name = var.getName();
            final String bounds = csv(stream(var.getBounds()).filter(t -> !Object.class.equals(t)).map(this::originCanonicalDefinitionOf));
            return name + ofEmptyable(bounds).prepend(" extends ").orEmpty();
        }).collect(toList());
    }

}
