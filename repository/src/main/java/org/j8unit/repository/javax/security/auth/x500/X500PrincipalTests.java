package org.j8unit.repository.javax.security.auth.x500;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.x500.X500Principal class
 * javax.security.auth.x500.X500Principal}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link X500PrincipalClassTests}.
 * </p>
 *
 * @see javax.security.auth.x500.X500Principal class javax.security.auth.x500.X500Principal (the hereby targeted
 *      class-under-test class)
 * @see X500PrincipalClassTests X500PrincipalClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface X500PrincipalTests<SUT extends javax.security.auth.x500.X500Principal>
extends org.j8unit.repository.java.security.PrincipalTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#getName(String) public java.lang.String
     * javax.security.auth.x500.X500Principal.getName(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#getName(String) public java.lang.String
     * javax.security.auth.x500.X500Principal.getName(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500Principal#getName(String) public java.lang.String
     *      javax.security.auth.x500.X500Principal.getName(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#getName(String, java.util.Map) public
     * java.lang.String javax.security.auth.x500.X500Principal.getName(java.lang.String,java.util.Map<java.lang.String,
     * java.lang.String>)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#getName(String, java.util.Map) public
     * java.lang.String javax.security.auth.x500.X500Principal.getName(java.lang.String,java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500Principal#getName(String, java.util.Map) public java.lang.String
     *      javax.security.auth.x500.X500Principal.getName(java.lang.String,java.util.Map) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName_String_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#getName() public java.lang.String
     * javax.security.auth.x500.X500Principal.getName()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#getName() public java.lang.String
     * javax.security.auth.x500.X500Principal.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500Principal#getName() public java.lang.String
     *      javax.security.auth.x500.X500Principal.getName() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.x500.X500Principal#equals(Object) public boolean
     * javax.security.auth.x500.X500Principal.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#equals(Object) public boolean
     * javax.security.auth.x500.X500Principal.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500Principal#equals(Object) public boolean
     *      javax.security.auth.x500.X500Principal.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.x500.X500Principal#hashCode() public int
     * javax.security.auth.x500.X500Principal.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#hashCode() public int
     * javax.security.auth.x500.X500Principal.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500Principal#hashCode() public int
     *      javax.security.auth.x500.X500Principal.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.security.auth.x500.X500Principal#getEncoded() public byte[]
     * javax.security.auth.x500.X500Principal.getEncoded()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#getEncoded() public byte[]
     * javax.security.auth.x500.X500Principal.getEncoded()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500Principal#getEncoded() public byte[]
     *      javax.security.auth.x500.X500Principal.getEncoded() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#toString() public java.lang.String
     * javax.security.auth.x500.X500Principal.toString()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.x500.X500Principal#toString() public java.lang.String
     * javax.security.auth.x500.X500Principal.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.x500.X500Principal#toString() public java.lang.String
     *      javax.security.auth.x500.X500Principal.toString() (the hereby targeted method-under-test)
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
