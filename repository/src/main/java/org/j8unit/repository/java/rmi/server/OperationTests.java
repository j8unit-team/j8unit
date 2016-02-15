package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.Operation class java.rmi.server.Operation}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link OperationClassTests}.
 * </p>
 *
 * @see java.rmi.server.Operation class java.rmi.server.Operation (the hereby targeted class-under-test class)
 * @see OperationClassTests OperationClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OperationTests<SUT extends java.rmi.server.Operation>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.Operation#getOperation() public java.lang.String
     * java.rmi.server.Operation.getOperation()}.
     *
     * <p>
     * Test method for {@link java.rmi.server.Operation#getOperation() public java.lang.String
     * java.rmi.server.Operation.getOperation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.Operation#getOperation() public java.lang.String java.rmi.server.Operation.getOperation()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOperation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.Operation#toString() public java.lang.String
     * java.rmi.server.Operation.toString()}.
     *
     * <p>
     * Test method for {@link java.rmi.server.Operation#toString() public java.lang.String
     * java.rmi.server.Operation.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.Operation#toString() public java.lang.String java.rmi.server.Operation.toString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
