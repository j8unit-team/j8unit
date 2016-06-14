package org.j8unit.generator.api;

import org.j8unit.J8UnitTest;
import org.j8unit.generator.api.render.OriginRenderer;

/**
 * Provides the definition statement of the {@linkplain #getTestClassBaseTypeDefinition(OriginRenderer, Class, Class)
 * base type some of specific j8unit test class}. (That is, the real test class of some specific, reusable/extendable
 * j8unit test interface.)
 */
public abstract interface BasicTestClassStatements {

    /**
     * <p>
     * Returns the definition statements of the j8unit base type of some specific j8unit test class corresponding the
     * given {@link Class type}.
     * </p>
     *
     * @param renderer
     *            the renderer to use when computing the base type's definition
     * @param base
     *            the queried j8unit base type
     * @param type
     *            the given type
     * @return the according base type' definition statement
     */
    public abstract String getTestClassBaseTypeDefinition(final OriginRenderer renderer, final @SuppressWarnings("rawtypes") Class<? extends J8UnitTest> base,
                                                          final Class<?> type);

}
