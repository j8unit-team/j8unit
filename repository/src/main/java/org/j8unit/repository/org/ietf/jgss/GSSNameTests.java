package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.ietf.jgss.GSSName interface org.ietf.jgss.GSSName}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link GSSNameClassTests}.
 * </p>
 *
 * @see org.ietf.jgss.GSSName interface org.ietf.jgss.GSSName (the hereby targeted class-under-test class)
 * @see GSSNameClassTests GSSNameClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GSSNameTests<SUT extends org.ietf.jgss.GSSName>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#toString() public abstract java.lang.String
     * org.ietf.jgss.GSSName.toString()}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#toString() public abstract java.lang.String
     * org.ietf.jgss.GSSName.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#toString() public abstract java.lang.String org.ietf.jgss.GSSName.toString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.ietf.jgss.GSSName#isMN() public abstract boolean org.ietf.jgss.GSSName.isMN()}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#isMN() public abstract boolean org.ietf.jgss.GSSName.isMN()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#isMN() public abstract boolean org.ietf.jgss.GSSName.isMN() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMN()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#canonicalize(org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSName.canonicalize(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#canonicalize(org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSName.canonicalize(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#canonicalize(org.ietf.jgss.Oid) public abstract org.ietf.jgss.GSSName
     *      org.ietf.jgss.GSSName.canonicalize(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canonicalize_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#export() public abstract byte[] org.ietf.jgss.GSSName.export()
     * throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#export() public abstract byte[] org.ietf.jgss.GSSName.export()
     * throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#export() public abstract byte[] org.ietf.jgss.GSSName.export() throws
     *      org.ietf.jgss.GSSException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_export()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#isAnonymous() public abstract boolean
     * org.ietf.jgss.GSSName.isAnonymous()}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#isAnonymous() public abstract boolean
     * org.ietf.jgss.GSSName.isAnonymous()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#isAnonymous() public abstract boolean org.ietf.jgss.GSSName.isAnonymous() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAnonymous()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#hashCode() public abstract int org.ietf.jgss.GSSName.hashCode()}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#hashCode() public abstract int org.ietf.jgss.GSSName.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#hashCode() public abstract int org.ietf.jgss.GSSName.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.ietf.jgss.GSSName#equals(org.ietf.jgss.GSSName) public abstract boolean
     * org.ietf.jgss.GSSName.equals(org.ietf.jgss.GSSName) throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#equals(org.ietf.jgss.GSSName) public abstract boolean
     * org.ietf.jgss.GSSName.equals(org.ietf.jgss.GSSName) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#equals(org.ietf.jgss.GSSName) public abstract boolean
     *      org.ietf.jgss.GSSName.equals(org.ietf.jgss.GSSName) throws org.ietf.jgss.GSSException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_GSSName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#equals(Object) public abstract boolean
     * org.ietf.jgss.GSSName.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#equals(Object) public abstract boolean
     * org.ietf.jgss.GSSName.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#equals(Object) public abstract boolean org.ietf.jgss.GSSName.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link org.ietf.jgss.GSSName#getStringNameType() public abstract org.ietf.jgss.Oid
     * org.ietf.jgss.GSSName.getStringNameType() throws org.ietf.jgss.GSSException}.
     *
     * <p>
     * Test method for {@link org.ietf.jgss.GSSName#getStringNameType() public abstract org.ietf.jgss.Oid
     * org.ietf.jgss.GSSName.getStringNameType() throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.ietf.jgss.GSSName#getStringNameType() public abstract org.ietf.jgss.Oid
     *      org.ietf.jgss.GSSName.getStringNameType() throws org.ietf.jgss.GSSException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStringNameType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
