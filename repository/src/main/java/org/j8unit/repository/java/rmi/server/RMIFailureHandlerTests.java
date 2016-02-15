package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RMIFailureHandler interface
 * java.rmi.server.RMIFailureHandler}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link RMIFailureHandlerClassTests}.
 * </p>
 *
 * @see java.rmi.server.RMIFailureHandler interface java.rmi.server.RMIFailureHandler (the hereby targeted
 *      class-under-test class)
 * @see RMIFailureHandlerClassTests RMIFailureHandlerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIFailureHandlerTests<SUT extends java.rmi.server.RMIFailureHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMIFailureHandler#failure(Exception) public abstract boolean
     * java.rmi.server.RMIFailureHandler.failure(java.lang.Exception)}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RMIFailureHandler#failure(Exception) public abstract boolean
     * java.rmi.server.RMIFailureHandler.failure(java.lang.Exception)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RMIFailureHandler#failure(Exception) public abstract boolean
     *      java.rmi.server.RMIFailureHandler.failure(java.lang.Exception) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_failure_Exception()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
