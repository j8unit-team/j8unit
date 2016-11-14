package org.j8unit.generator.api;

import java.util.List;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.api.render.TargetRenderer;

/**
 * Extends {@link BasicTestInterfaceStatements} and provides the
 * {@link #getTestInterfaceSuperTypesDefinitions(Class, GeneratorUseControler, OriginRenderer) definition statements of
 * some of specific j8unit test interface's super types},
 */
public abstract interface ExtendedTestInterfaceStatements
extends BasicTestInterfaceStatements {

    /**
     * <p>
     * Returns the definition statements of the super types of some specific j8unit test interface corresponding the
     * given {@link Class type}. Any specific implementation may drop all (or only some) of the
     * {@linkplain org.j8unit.generator.util.TypeAnalysis#redundantTypes(java.util.Set) redundant} super types (see
     * {@link org.j8unit.generator.util.TypeAnalysis#calculateNearestMatchingParents(Class, java.util.function.Predicate)}
     * and {@link GeneratorUseControler#useType(Class)}).
     * </p>
     *
     * @param type
     *            the given type
     * @param control
     *            the super types filter
     * @param renderer
     *            the renderer to use when computing the super type's definition
     * @return the according super types' definition statements
     */
    public abstract <Renderer extends OriginRenderer & TargetRenderer> List<String> getTestInterfaceSuperTypesDefinitions(final Class<?> type,
                                                                                                                          final GeneratorUseControler control,
                                                                                                                          final Renderer renderer);

}
