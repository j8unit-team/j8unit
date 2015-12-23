package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.keyinfo.RetrievalMethod interface
 * javax.xml.crypto.dsig.keyinfo.RetrievalMethod}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.RetrievalMethodTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.RetrievalMethodClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.keyinfo.RetrievalMethod
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.keyinfo.RetrievalMethod#dereference(javax.xml.crypto.XMLCryptoContext)
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getTransforms()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.keyinfo.RetrievalMethod#getURI()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getURI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
