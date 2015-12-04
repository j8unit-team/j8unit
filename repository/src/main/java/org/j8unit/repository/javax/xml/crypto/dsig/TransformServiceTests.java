package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.TransformService class javax.xml.crypto.dsig.TransformService},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.TransformServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TransformServiceTests<SUT extends javax.xml.crypto.dsig.TransformService>
extends org.j8unit.repository.javax.xml.crypto.dsig.TransformTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.TransformService#init(javax.xml.crypto.dsig.spec.TransformParameterSpec) public
     * abstract void javax.xml.crypto.dsig.TransformService.init(javax.xml.crypto.dsig.spec.TransformParameterSpec)
     * throws java.security.InvalidAlgorithmParameterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_TransformParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.TransformService#init(javax.xml.crypto.XMLStructure,javax.xml.crypto.XMLCryptoContext)
     * public abstract void
     * javax.xml.crypto.dsig.TransformService.init(javax.xml.crypto.XMLStructure,javax.xml.crypto.XMLCryptoContext)
     * throws java.security.InvalidAlgorithmParameterException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_XMLStructure_XMLCryptoContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.TransformService#getMechanismType() public final java.lang.String
     * javax.xml.crypto.dsig.TransformService.getMechanismType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMechanismType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.TransformService#getAlgorithm() public final java.lang.String
     * javax.xml.crypto.dsig.TransformService.getAlgorithm()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getAlgorithm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.TransformService#getProvider() public final java.security.Provider
     * javax.xml.crypto.dsig.TransformService.getProvider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.TransformService#marshalParams(javax.xml.crypto.XMLStructure,javax.xml.crypto.XMLCryptoContext)
     * public abstract void
     * javax.xml.crypto.dsig.TransformService.marshalParams(javax.xml.crypto.XMLStructure,javax.xml.crypto.XMLCryptoContext)
     * throws javax.xml.crypto.MarshalException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshalParams_XMLStructure_XMLCryptoContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
