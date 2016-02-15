package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.JMXPrincipal class
 * javax.management.remote.JMXPrincipal}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link JMXPrincipalClassTests}.
 * </p>
 *
 * @see javax.management.remote.JMXPrincipal class javax.management.remote.JMXPrincipal (the hereby targeted
 *      class-under-test class)
 * @see JMXPrincipalClassTests JMXPrincipalClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXPrincipalTests<SUT extends javax.management.remote.JMXPrincipal>
extends org.j8unit.repository.java.security.PrincipalTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#toString() public java.lang.String
     * javax.management.remote.JMXPrincipal.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#toString() public java.lang.String
     * javax.management.remote.JMXPrincipal.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXPrincipal#toString() public java.lang.String
     *      javax.management.remote.JMXPrincipal.toString() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#getName() public java.lang.String
     * javax.management.remote.JMXPrincipal.getName()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#getName() public java.lang.String
     * javax.management.remote.JMXPrincipal.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXPrincipal#getName() public java.lang.String
     *      javax.management.remote.JMXPrincipal.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#equals(Object) public boolean
     * javax.management.remote.JMXPrincipal.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#equals(Object) public boolean
     * javax.management.remote.JMXPrincipal.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXPrincipal#equals(Object) public boolean
     *      javax.management.remote.JMXPrincipal.equals(java.lang.Object) (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#hashCode() public int
     * javax.management.remote.JMXPrincipal.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.JMXPrincipal#hashCode() public int
     * javax.management.remote.JMXPrincipal.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.JMXPrincipal#hashCode() public int javax.management.remote.JMXPrincipal.hashCode()
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

}
