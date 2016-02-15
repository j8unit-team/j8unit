package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.activation.ActivationGroupID class
 * java.rmi.activation.ActivationGroupID}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ActivationGroupIDClassTests}.
 * </p>
 *
 * @see java.rmi.activation.ActivationGroupID class java.rmi.activation.ActivationGroupID (the hereby targeted
 *      class-under-test class)
 * @see ActivationGroupIDClassTests ActivationGroupIDClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivationGroupIDTests<SUT extends java.rmi.activation.ActivationGroupID>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroupID#hashCode() public int
     * java.rmi.activation.ActivationGroupID.hashCode()}.
     *
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroupID#hashCode() public int
     * java.rmi.activation.ActivationGroupID.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationGroupID#hashCode() public int java.rmi.activation.ActivationGroupID.hashCode()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroupID#getSystem() public
     * java.rmi.activation.ActivationSystem java.rmi.activation.ActivationGroupID.getSystem()}.
     *
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroupID#getSystem() public
     * java.rmi.activation.ActivationSystem java.rmi.activation.ActivationGroupID.getSystem()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationGroupID#getSystem() public java.rmi.activation.ActivationSystem
     *      java.rmi.activation.ActivationGroupID.getSystem() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSystem()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroupID#equals(Object) public boolean
     * java.rmi.activation.ActivationGroupID.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.rmi.activation.ActivationGroupID#equals(Object) public boolean
     * java.rmi.activation.ActivationGroupID.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.activation.ActivationGroupID#equals(Object) public boolean
     *      java.rmi.activation.ActivationGroupID.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
