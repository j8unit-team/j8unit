package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.keyinfo.RetrievalMethod interface
 * javax.xml.crypto.dsig.keyinfo.RetrievalMethod}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RetrievalMethodClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.keyinfo.RetrievalMethod interface javax.xml.crypto.dsig.keyinfo.RetrievalMethod (the
 *      hereby targeted class-under-test class)
 * @see RetrievalMethodClassTests RetrievalMethodClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RetrievalMethodTests<SUT extends javax.xml.crypto.dsig.keyinfo.RetrievalMethod>
extends org.j8unit.repository.javax.xml.crypto.URIReferenceTests<SUT>, org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.keyinfo.RetrievalMethod#dereference(javax.xml.crypto.XMLCryptoContext) public
     * abstract javax.xml.crypto.Data
     * javax.xml.crypto.dsig.keyinfo.RetrievalMethod.dereference(javax.xml.crypto.XMLCryptoContext) throws
     * javax.xml.crypto.URIReferenceException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.keyinfo.RetrievalMethod#dereference(javax.xml.crypto.XMLCryptoContext) public
     * abstract javax.xml.crypto.Data
     * javax.xml.crypto.dsig.keyinfo.RetrievalMethod.dereference(javax.xml.crypto.XMLCryptoContext) throws
     * javax.xml.crypto.URIReferenceException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.keyinfo.RetrievalMethod#dereference(javax.xml.crypto.XMLCryptoContext) public abstract
     *      javax.xml.crypto.Data
     *      javax.xml.crypto.dsig.keyinfo.RetrievalMethod.dereference(javax.xml.crypto.XMLCryptoContext) throws
     *      javax.xml.crypto.URIReferenceException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dereference_XMLCryptoContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getTransforms() public abstract
     * java.util.List javax.xml.crypto.dsig.keyinfo.RetrievalMethod.getTransforms()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getTransforms() public abstract
     * java.util.List javax.xml.crypto.dsig.keyinfo.RetrievalMethod.getTransforms()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getTransforms() public abstract java.util.List
     *      javax.xml.crypto.dsig.keyinfo.RetrievalMethod.getTransforms() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransforms()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getURI() public abstract java.lang.String
     * javax.xml.crypto.dsig.keyinfo.RetrievalMethod.getURI()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getURI() public abstract java.lang.String
     * javax.xml.crypto.dsig.keyinfo.RetrievalMethod.getURI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getURI() public abstract java.lang.String
     *      javax.xml.crypto.dsig.keyinfo.RetrievalMethod.getURI() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getURI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
