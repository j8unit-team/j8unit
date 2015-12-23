package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.Transform interface
 * javax.xml.crypto.dsig.Transform}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.TransformTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.TransformClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.Transform
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformTests<SUT extends javax.xml.crypto.dsig.Transform>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>, org.j8unit.repository.javax.xml.crypto.AlgorithmMethodTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Transform#getParameterSpec() public abstract
     * java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.Transform.getParameterSpec()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.Transform#getParameterSpec()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data, javax.xml.crypto.XMLCryptoContext) public
     * abstract javax.xml.crypto.Data
     * javax.xml.crypto.dsig.Transform.transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext) throws
     * javax.xml.crypto.dsig.TransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data, javax.xml.crypto.XMLCryptoContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Data_XMLCryptoContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data, javax.xml.crypto.XMLCryptoContext, java.io.OutputStream)
     * public abstract javax.xml.crypto.Data
     * javax.xml.crypto.dsig.Transform.transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext,java.io.OutputStream)
     * throws javax.xml.crypto.dsig.TransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data, javax.xml.crypto.XMLCryptoContext,
     *             java.io.OutputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Data_XMLCryptoContext_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
