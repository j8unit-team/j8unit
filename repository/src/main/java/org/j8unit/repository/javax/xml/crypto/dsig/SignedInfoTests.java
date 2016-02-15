package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.SignedInfo interface
 * javax.xml.crypto.dsig.SignedInfo}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link SignedInfoClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.SignedInfo interface javax.xml.crypto.dsig.SignedInfo (the hereby targeted
 *      class-under-test class)
 * @see SignedInfoClassTests SignedInfoClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignedInfoTests<SUT extends javax.xml.crypto.dsig.SignedInfo>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getCanonicalizedData() public abstract
     * java.io.InputStream javax.xml.crypto.dsig.SignedInfo.getCanonicalizedData()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getCanonicalizedData() public abstract
     * java.io.InputStream javax.xml.crypto.dsig.SignedInfo.getCanonicalizedData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignedInfo#getCanonicalizedData() public abstract java.io.InputStream
     *      javax.xml.crypto.dsig.SignedInfo.getCanonicalizedData() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCanonicalizedData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getSignatureMethod() public abstract
     * javax.xml.crypto.dsig.SignatureMethod javax.xml.crypto.dsig.SignedInfo.getSignatureMethod()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getSignatureMethod() public abstract
     * javax.xml.crypto.dsig.SignatureMethod javax.xml.crypto.dsig.SignedInfo.getSignatureMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignedInfo#getSignatureMethod() public abstract javax.xml.crypto.dsig.SignatureMethod
     *      javax.xml.crypto.dsig.SignedInfo.getSignatureMethod() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignatureMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getReferences() public abstract java.util.List
     * javax.xml.crypto.dsig.SignedInfo.getReferences()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getReferences() public abstract java.util.List
     * javax.xml.crypto.dsig.SignedInfo.getReferences()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignedInfo#getReferences() public abstract java.util.List
     *      javax.xml.crypto.dsig.SignedInfo.getReferences() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReferences()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getCanonicalizationMethod() public abstract
     * javax.xml.crypto.dsig.CanonicalizationMethod javax.xml.crypto.dsig.SignedInfo.getCanonicalizationMethod()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getCanonicalizationMethod() public abstract
     * javax.xml.crypto.dsig.CanonicalizationMethod javax.xml.crypto.dsig.SignedInfo.getCanonicalizationMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignedInfo#getCanonicalizationMethod() public abstract
     *      javax.xml.crypto.dsig.CanonicalizationMethod javax.xml.crypto.dsig.SignedInfo.getCanonicalizationMethod()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCanonicalizationMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.SignedInfo.getId()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignedInfo#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.SignedInfo.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignedInfo#getId() public abstract java.lang.String
     *      javax.xml.crypto.dsig.SignedInfo.getId() (the hereby targeted method-under-test)
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

}
