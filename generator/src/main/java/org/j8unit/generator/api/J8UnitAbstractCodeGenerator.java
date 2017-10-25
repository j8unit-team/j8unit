package org.j8unit.generator.api;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;
import static org.j8unit.generator.api.LoggingMessagesKeys.ENVELOPED_TYPES;
import java.util.Set;
import java.util.stream.Stream;
import org.j8unit.generator.EnvelopedTypeModifiers;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.FancyOriginRenderer;

public interface J8UnitAbstractCodeGenerator
extends J8UnitGenerator, EnvelopedTypeModifiers, GeneratorMarkers {

    /**
     * Returns a {@linkplain Set set} of all {@link Class} objects reflecting all the
     * {@linkplain GeneratorUseControler#useType(Class) considerable} classes and interfaces declared as members of the
     * given {@code type}.
     *
     * @implSpec The default implementation fully implements the aforementioned renderer.
     *
     * @param type
     *            the target type
     * @param control
     *            the generator control
     * @return a set of all considerable member {@code Class} objects
     */
    public default Set<Class<?>> exploreEnvelopedTypes(final Class<?> type, final GeneratorUseControler control) {
        final Set<Class<?>> collect = stream(type.getDeclaredClasses()).filter(control::useType).collect(toSet());
        logger().info(ENVELOPED_TYPES, type, collect);
        return collect;
    }

    public default Set<Class<?>> exploreAllEnvelopedTypes(final Class<?> type, final GeneratorUseControler control) {
        final Set<Class<?>> enveloped = exploreEnvelopedTypes(type, control);
        final Stream<Class<?>> all = enveloped.parallelStream().flatMap(e -> concat(Stream.of(e), exploreAllEnvelopedTypes(e, control).stream()));
        return all.collect(toSet());
    }

    public default Set<Class<?>> exploreAllEnvelopedTypes(final Set<Class<?>> types, final GeneratorUseControler control) {
        final Stream<Class<?>> all = types.parallelStream().flatMap(e -> concat(Stream.of(e), exploreAllEnvelopedTypes(e, control).stream()));
        return all.collect(toSet());
    }

    /**
     * <p>
     * Generates the source code of the required {@code import} statements in relation to the given target {@code type}.
     * </p>
     *
     * @param reference
     *            the reference package
     * @param renderer
     *            the type name renderer
     *
     * @return the source code of the required {@code import} statements
     */
    public default String generateImports(final String reference, final FancyOriginRenderer renderer) {
        return renderer.renderImport(reference);
    }

}
