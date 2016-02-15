package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.ValueExp interface javax.management.ValueExp}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ValueExpClassTests}.
 * </p>
 *
 * @see javax.management.ValueExp interface javax.management.ValueExp (the hereby targeted class-under-test class)
 * @see ValueExpClassTests ValueExpClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValueExpTests<SUT extends javax.management.ValueExp>
extends org.j8unit.repository.java.io.SerializableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.ValueExp#apply(javax.management.ObjectName) public abstract
     * javax.management.ValueExp javax.management.ValueExp.apply(javax.management.ObjectName) throws
     * javax.management.BadStringOperationException,javax.management.BadBinaryOpValueExpException,javax.management.BadAttributeValueExpException,javax.management.InvalidApplicationException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.ValueExp#apply(javax.management.ObjectName) public abstract
     * javax.management.ValueExp javax.management.ValueExp.apply(javax.management.ObjectName) throws
     * javax.management.BadStringOperationException,javax.management.BadBinaryOpValueExpException,javax.management.BadAttributeValueExpException,javax.management.InvalidApplicationException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.ValueExp#apply(javax.management.ObjectName) public abstract javax.management.ValueExp
     *      javax.management.ValueExp.apply(javax.management.ObjectName) throws
     *      javax.management.BadStringOperationException,javax.management.BadBinaryOpValueExpException,javax.management.
     *      BadAttributeValueExpException,javax.management.InvalidApplicationException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_apply_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.ValueExp#setMBeanServer(javax.management.MBeanServer) public abstract
     * void javax.management.ValueExp.setMBeanServer(javax.management.MBeanServer)}.
     *
     * <p>
     * Test method for {@link javax.management.ValueExp#setMBeanServer(javax.management.MBeanServer) public abstract
     * void javax.management.ValueExp.setMBeanServer(javax.management.MBeanServer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.ValueExp#setMBeanServer(javax.management.MBeanServer) public abstract void
     *      javax.management.ValueExp.setMBeanServer(javax.management.MBeanServer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMBeanServer_MBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
