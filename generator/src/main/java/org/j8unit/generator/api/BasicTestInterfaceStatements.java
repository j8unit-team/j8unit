package org.j8unit.generator.api;

import java.lang.reflect.Type;
import java.util.Map.Entry;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;

/**
 * Provides the statement of the {@linkplain #getTestInterfaceGenericStatement(OriginRenderer, Class) generic part of
 * some of specific j8unit test interface} and of the complete definition of the
 * {@linkplain #getTestInterfaceSuperTypeDefinition(OriginRenderer, Entry) super type's definition of some specific
 * j8unit interface}.
 */
public abstract interface BasicTestInterfaceStatements {

    /**
     * <p>
     * Returns the generic statement of some specific j8unit test interface corresponding the given {@link Class type}.
     * </p>
     *
     * @param type
     *            the given type
     * @param renderer
     *            the renderer to use when computing the generic statement
     * @return the generic test interface statement of any specific j8unit test interface
     */
    public abstract String getTestInterfaceGenericStatement(final OriginRenderer renderer, final Class<?> type);

    /**
     * <p>
     * Returns the generic statement of the super type's definition of some specific j8unit test interface corresponding
     * the given {@link Class type}.
     * </p>
     *
     * @param renderer
     *            the renderer to use when computing the super type's definition
     * @param superType
     *            the given super type
     * @return the according test class definition
     */
    public abstract <Renderer extends OriginRenderer & TargetRenderer> String getTestInterfaceSuperTypeDefinition(final Renderer renderer,
                                                                                                                  final Entry<? extends Class<?>, ? extends Type> superType);

}
