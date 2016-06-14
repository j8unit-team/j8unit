package org.j8unit.generator.api;

import org.j8unit.J8UnitTest;

/**
 * Supplier of the base interface of any specific j8unit test interface.
 *
 * In detail, the supplied base class must be the {@link Class} of {@link J8UnitTest} or of any sub-type (e.&thinsp;g.,
 * {@link org.j8unit.repository.RepositoryTests} or {@link org.j8unit.repository.RepositoryClassTests}).
 */
public abstract interface BaseTestClassSupplier {

    /**
     * <p>
     * Returns the base interface of any specific j8unit test interface. That is the {@link Class} of {@link J8UnitTest}
     * or of any sub-type (e.&thinsp;g., {@link org.j8unit.repository.RepositoryTests} or
     * {@link org.j8unit.repository.RepositoryClassTests}).
     * </p>
     *
     * @return the base interface of any specific j8unit test interface
     */
    @SuppressWarnings("rawtypes")
    public abstract Class<? extends J8UnitTest> getBaseJ8UnitInterfaceType();

}
