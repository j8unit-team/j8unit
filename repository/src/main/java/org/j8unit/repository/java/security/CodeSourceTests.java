package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.CodeSource class java.security.CodeSource}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CodeSourceClassTests}.
 * </p>
 *
 * @see java.security.CodeSource class java.security.CodeSource (the hereby targeted class-under-test class)
 * @see CodeSourceClassTests CodeSourceClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CodeSourceTests<SUT extends java.security.CodeSource>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.CodeSource#toString() public java.lang.String
     * java.security.CodeSource.toString()}.
     *
     * <p>
     * Test method for {@link java.security.CodeSource#toString() public java.lang.String
     * java.security.CodeSource.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.CodeSource#toString() public java.lang.String java.security.CodeSource.toString() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.security.CodeSource#getCertificates() public final java.security.cert.Certificate[]
     * java.security.CodeSource.getCertificates()}.
     *
     * <p>
     * Test method for {@link java.security.CodeSource#getCertificates() public final java.security.cert.Certificate[]
     * java.security.CodeSource.getCertificates()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.CodeSource#getCertificates() public final java.security.cert.Certificate[]
     *      java.security.CodeSource.getCertificates() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertificates()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.CodeSource#implies(java.security.CodeSource) public boolean
     * java.security.CodeSource.implies(java.security.CodeSource)}.
     *
     * <p>
     * Test method for {@link java.security.CodeSource#implies(java.security.CodeSource) public boolean
     * java.security.CodeSource.implies(java.security.CodeSource)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.CodeSource#implies(java.security.CodeSource) public boolean
     *      java.security.CodeSource.implies(java.security.CodeSource) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_implies_CodeSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.CodeSource#getLocation() public final java.net.URL
     * java.security.CodeSource.getLocation()}.
     *
     * <p>
     * Test method for {@link java.security.CodeSource#getLocation() public final java.net.URL
     * java.security.CodeSource.getLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.CodeSource#getLocation() public final java.net.URL java.security.CodeSource.getLocation() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.CodeSource#equals(Object) public boolean
     * java.security.CodeSource.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.CodeSource#equals(Object) public boolean
     * java.security.CodeSource.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.CodeSource#equals(Object) public boolean java.security.CodeSource.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.CodeSource#hashCode() public int java.security.CodeSource.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.CodeSource#hashCode() public int java.security.CodeSource.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.CodeSource#hashCode() public int java.security.CodeSource.hashCode() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.security.CodeSource#getCodeSigners() public final java.security.CodeSigner[]
     * java.security.CodeSource.getCodeSigners()}.
     *
     * <p>
     * Test method for {@link java.security.CodeSource#getCodeSigners() public final java.security.CodeSigner[]
     * java.security.CodeSource.getCodeSigners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.CodeSource#getCodeSigners() public final java.security.CodeSigner[]
     *      java.security.CodeSource.getCodeSigners() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCodeSigners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
