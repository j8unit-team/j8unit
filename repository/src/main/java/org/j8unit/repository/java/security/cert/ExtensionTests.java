package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.Extension interface java.security.cert.Extension}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ExtensionClassTests}.
 * </p>
 *
 * @see java.security.cert.Extension interface java.security.cert.Extension (the hereby targeted class-under-test class)
 * @see ExtensionClassTests ExtensionClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExtensionTests<SUT extends java.security.cert.Extension>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.Extension#getId() public abstract java.lang.String
     * java.security.cert.Extension.getId()}.
     *
     * <p>
     * Test method for {@link java.security.cert.Extension#getId() public abstract java.lang.String
     * java.security.cert.Extension.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.Extension#getId() public abstract java.lang.String java.security.cert.Extension.getId()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.Extension#isCritical() public abstract boolean
     * java.security.cert.Extension.isCritical()}.
     *
     * <p>
     * Test method for {@link java.security.cert.Extension#isCritical() public abstract boolean
     * java.security.cert.Extension.isCritical()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.Extension#isCritical() public abstract boolean java.security.cert.Extension.isCritical()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCritical()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.Extension#encode(java.io.OutputStream) public abstract void
     * java.security.cert.Extension.encode(java.io.OutputStream) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.security.cert.Extension#encode(java.io.OutputStream) public abstract void
     * java.security.cert.Extension.encode(java.io.OutputStream) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.Extension#encode(java.io.OutputStream) public abstract void
     *      java.security.cert.Extension.encode(java.io.OutputStream) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_encode_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.Extension#getValue() public abstract byte[]
     * java.security.cert.Extension.getValue()}.
     *
     * <p>
     * Test method for {@link java.security.cert.Extension#getValue() public abstract byte[]
     * java.security.cert.Extension.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.Extension#getValue() public abstract byte[] java.security.cert.Extension.getValue() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
