package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.kerberos.KerberosPrincipal class
 * javax.security.auth.kerberos.KerberosPrincipal}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link KerberosPrincipalClassTests}.
 * </p>
 *
 * @see javax.security.auth.kerberos.KerberosPrincipal class javax.security.auth.kerberos.KerberosPrincipal (the hereby
 *      targeted class-under-test class)
 * @see KerberosPrincipalClassTests KerberosPrincipalClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KerberosPrincipalTests<SUT extends javax.security.auth.kerberos.KerberosPrincipal>
extends org.j8unit.repository.java.security.PrincipalTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#hashCode() public int
     * javax.security.auth.kerberos.KerberosPrincipal.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#hashCode() public int
     * javax.security.auth.kerberos.KerberosPrincipal.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosPrincipal#hashCode() public int
     *      javax.security.auth.kerberos.KerberosPrincipal.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#equals(Object) public boolean
     * javax.security.auth.kerberos.KerberosPrincipal.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#equals(Object) public boolean
     * javax.security.auth.kerberos.KerberosPrincipal.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosPrincipal#equals(Object) public boolean
     *      javax.security.auth.kerberos.KerberosPrincipal.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#getNameType() public int
     * javax.security.auth.kerberos.KerberosPrincipal.getNameType()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#getNameType() public int
     * javax.security.auth.kerberos.KerberosPrincipal.getNameType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosPrincipal#getNameType() public int
     *      javax.security.auth.kerberos.KerberosPrincipal.getNameType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNameType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#getName() public java.lang.String
     * javax.security.auth.kerberos.KerberosPrincipal.getName()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#getName() public java.lang.String
     * javax.security.auth.kerberos.KerberosPrincipal.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosPrincipal#getName() public java.lang.String
     *      javax.security.auth.kerberos.KerberosPrincipal.getName() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#toString() public java.lang.String
     * javax.security.auth.kerberos.KerberosPrincipal.toString()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#toString() public java.lang.String
     * javax.security.auth.kerberos.KerberosPrincipal.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosPrincipal#toString() public java.lang.String
     *      javax.security.auth.kerberos.KerberosPrincipal.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#getRealm() public java.lang.String
     * javax.security.auth.kerberos.KerberosPrincipal.getRealm()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.kerberos.KerberosPrincipal#getRealm() public java.lang.String
     * javax.security.auth.kerberos.KerberosPrincipal.getRealm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.kerberos.KerberosPrincipal#getRealm() public java.lang.String
     *      javax.security.auth.kerberos.KerberosPrincipal.getRealm() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRealm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
