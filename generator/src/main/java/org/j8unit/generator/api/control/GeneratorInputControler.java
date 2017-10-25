package org.j8unit.generator.api.control;

import static java.util.stream.Collectors.toSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * This interface specifies the handling of the {@linkplain org.j8unit.generator.api.J8UnitGenerator j8unit generator}
 * input. In detail, it provides some methods to explore the packages- and the types-under-test.
 * </p>
 */
public abstract interface GeneratorInputControler {

    /**
     * <p>
     * Returns a {@linkplain Set set} of all {@linkplain Package packages} to be considered when generating some source
     * files.
     *
     * If the packages cannot be explored by any exceptional reason, an according {@link Exception} is thrown.
     * </p>
     *
     * @apiNote Any specific implementation of this method should declare specific exceptions or no exception at all.
     *
     * @implSpec The default implementation explores the packages by {@linkplain Collectors#toSet() accumulating}
     *           {@link Class#getPackage() the packages} of {@link #exploreOriginTypes() the explored origin types}.
     *
     * @return a set of all packages to be considered when generating some source files
     * @throws Exception
     *             if the packages cannot be explored by any exceptional reason (any checked exception)
     * @throws RuntimeException
     *             if the packages cannot be explored by any exceptional reason (any unchecked exception)
     */
    public default Set<Package> exploreOriginPackages()
    throws Exception, RuntimeException {
        final Set<Class<?>> originTypes = this.exploreOriginTypes();
        return originTypes.stream().map(Class::getPackage).collect(toSet());
    }

    /**
     * <p>
     * Returns a {@linkplain Set set} of all {@linkplain Class types} to be considered when generating some source
     * files.
     *
     * If the types cannot be explored by any exceptional reason, an according {@link Exception} is thrown.
     * </p>
     *
     * @apiNote Any specific implementation of this method should declare specific exceptions or no exception at all.
     *
     * @return a set of all types to be considered when generating some source files
     * @throws Exception
     *             if the packages cannot be explored by any exceptional reason (any checked exception)
     * @throws RuntimeException
     *             if the packages cannot be explored by any exceptional reason (any unchecked exception)
     */
    public abstract Set<Class<?>> exploreOriginTypes()
    throws Exception, RuntimeException;

}
